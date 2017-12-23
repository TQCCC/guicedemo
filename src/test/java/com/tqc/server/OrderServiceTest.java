package com.tqc.server;

import com.google.inject.Guice;
import org.junit.Test;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class OrderServiceTest {

	@Test
	public void testSendToPayment() {
		OrderService orderService =
				Guice.createInjector(new ServerModule()).getInstance(OrderService.class);
		orderService.sendToPayment(789L);
	}

}