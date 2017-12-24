package com.tqc.server.cache;

import com.google.common.cache.AbstractCache;

import javax.inject.Singleton;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by tangqingchang on 2017/12/24.
 */
//单例作用域注解
@Singleton
public class GuiceDemoCache extends AbstractCache<String, String> {

	//单例下使用线程安全的ConcurrentHashMap
	private final Map<String, String> keyValues = new ConcurrentHashMap<>();

	@Override
	public String getIfPresent(Object key) {
		return keyValues.get(key);
	}

	@Override
	public void put(String key, String value) {
		keyValues.put(key, value);
	}
}
