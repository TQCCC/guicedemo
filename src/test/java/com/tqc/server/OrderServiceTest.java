package com.tqc.server;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class OrderServiceTest {

	@Inject
	private OrderService orderService;


	@Before
	public void setUp() {
		Guice.createInjector(new ServerModule())
				.injectMembers(this);
	}

	@Test
	public void testSendToPayment() {
		orderService.sendToPayment(789L);
	}

}