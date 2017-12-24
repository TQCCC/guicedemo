package com.tqc.server;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import com.tqc.server.anno.SessionId;
import com.tqc.server.impl.OrderServiceImpl;
import com.tqc.server.impl.PaymentServiceImpl;
import com.tqc.server.impl.PriceServiceImpl;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class ServerModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(OrderService.class).to(OrderServiceImpl.class);
		bind(PaymentService.class).to(PaymentServiceImpl.class);
		bind(PriceService.class).to(PriceServiceImpl.class);

		bind(new TypeLiteral<List<String>>() {
		})
				.annotatedWith(Names.named("supportedCurrencies"))
				.toInstance(Arrays.asList("A", "B", "C"));
	}

	@Provides
	@SessionId
	Long generateSessionId() {
		return System.currentTimeMillis();
	}

//	@Provides
//	@Named("supportedCurrencies")
//	List<String> getSupportedCurrencies(PriceService priceService) {
//		return priceService.getSupportedCurrencies();
//	}
}
