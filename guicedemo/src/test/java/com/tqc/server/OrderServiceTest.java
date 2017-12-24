package com.tqc.server;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.util.Modules;
import com.tqc.server.impl.PriceServiceImpl;
import com.tqc.server.module.ServerModule;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;
import java.util.Set;

/**
 * Created by tangqingchang on 2017/12/23.
 */

class PriceServiceMock extends PriceServiceImpl {

	@Inject
	public PriceServiceMock(Set<String> supportedCurrencies) {
		super(supportedCurrencies, null);
	}

	@Override
	public long getPrice(long orderId) {
		return 666L;
	}
}


public class OrderServiceTest {

	@Inject
	private OrderService orderService;

	@Inject
	private PriceService priceService;


	@Before
	public void setUp() {
		Guice.createInjector(
				// override
				Modules.override(new ServerModule())
						.with(
								new AbstractModule() {
									@Override
									protected void configure() {
										bind(PriceService.class).to(PriceServiceMock.class);
									}
								}
						)
		)
				.injectMembers(this);
	}

	@Test
	public void testSendToPayment() {
		orderService.sendToPayment(789L);
	}

	@Test
	public void testSupportedCurrencies() {
		System.out.println(priceService.getSupportedCurrencies().toString());
	}

}