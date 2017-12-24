package com.tqc.server.module;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

/**
 * Created by tangqingchang on 2017/12/24.
 */
public class GlobalModule extends AbstractModule {
	@Override
	protected void configure() {
		// Adds EUR, USD support
		Multibinder<String> currencyBinder = Multibinder.newSetBinder(binder(), String.class);

		currencyBinder.addBinding().toInstance("EUR");
		currencyBinder.addBinding().toInstance("USD");
	}
}
