package com.tqc.server;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Provider;
import com.google.inject.name.Named;
import com.tqc.server.impl.PriceServiceImpl;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class OrderServiceTest {

	@Inject
	private OrderService orderService;

	@Inject
	@Named("supportedCurrencies")
	private Provider<List<String>> supportedCurrenciesProvider;


	@Before
	public void setUp() {
		Guice.createInjector(
				new ServerModule(),
				new AbstractModule() {
					@Override
					protected void configure() {
						bind(PriceServiceImpl.class).toInstance(new PriceServiceImpl() {
							@Override
							public long getPrice(long orderId) {
								return 666L;
							}
						});
					}
				}
		)
				.injectMembers(this);
	}

	@Test
	public void testSendToPayment() {
		orderService.sendToPayment(789L);
	}

	@Test
	public void testSupportedCurrencies() {
		System.out.println(supportedCurrenciesProvider.get().toString());
	}

}