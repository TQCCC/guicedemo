package com.tqc.server.module;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

/**
 * Created by tangqingchang on 2017/12/24.
 */
public class ChinaModule extends AbstractModule {
	@Override
	protected void configure() {
		// Adds CNY support
		// 集合绑定
		Multibinder
				.newSetBinder(binder(), String.class)
				.addBinding()
				.toInstance("CNY");
	}
}
