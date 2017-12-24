package com.tqc.server.module;

import com.google.common.cache.Cache;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.tqc.server.OrderService;
import com.tqc.server.PaymentService;
import com.tqc.server.PriceService;
import com.tqc.server.anno.SessionId;
import com.tqc.server.cache.GuiceDemoCache;
import com.tqc.server.impl.OrderServiceImpl;
import com.tqc.server.impl.PaymentServiceImpl;
import com.tqc.server.impl.PriceServiceImpl;

import javax.inject.Singleton;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class ServerModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new ChinaModule());
		install(new GlobalModule());

		bind(OrderService.class).to(OrderServiceImpl.class);
		bind(PaymentService.class).to(PaymentServiceImpl.class);
		bind(PriceService.class).to(PriceServiceImpl.class);

//		bind(new TypeLiteral<Cache<String, String>>() {
//		})
//				.to(GuiceDemoCache.class);
	}

	@Provides
	@SessionId
	Long generateSessionId() {
		return System.currentTimeMillis();
	}


	@Provides
	@Singleton
	Cache<String, String> getCache() {
		return new GuiceDemoCache();
	}
}
