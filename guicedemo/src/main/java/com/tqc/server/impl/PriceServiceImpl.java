package com.tqc.server.impl;

import com.google.common.cache.Cache;
import com.tqc.server.PriceService;

import javax.inject.Inject;
import java.util.Set;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class PriceServiceImpl implements PriceService {

	private final Set<String> supportedCurrencies;

	private final Cache<String, String> cache;

	@Inject
	public PriceServiceImpl(Set<String> supportedCurrencies, Cache<String, String> cache) {
		this.supportedCurrencies = supportedCurrencies;
		this.cache = cache;
	}

	@Override
	public long getPrice(long orderId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<String> getSupportedCurrencies() {
		return supportedCurrencies;
	}


	public String getCachedValue(String key) {
		return cache.getIfPresent(key);
	}
}
