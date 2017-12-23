package com.tqc.server;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.tqc.server.anno.SessionId;
import com.tqc.server.impl.OrderServiceImpl;
import com.tqc.server.impl.PaymentServiceImpl;
import com.tqc.server.impl.PriceServiceImpl;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class ServerModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(OrderService.class).to(OrderServiceImpl.class);
		bind(PaymentService.class).to(PaymentServiceImpl.class);
		bind(PriceService.class).to(PriceServiceImpl.class);
	}

	@Provides
	@SessionId
	Long generateSessionId() {
		return System.currentTimeMillis();
	}
}
