package com.tqc.server.cache;

import com.google.inject.Guice;
import com.tqc.server.impl.PaymentServiceImpl;
import com.tqc.server.impl.PriceServiceImpl;
import com.tqc.server.module.ServerModule;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * Created by tangqingchang on 2017/12/24.
 */
public class CacheTest {

	@Inject
	PaymentServiceImpl paymentService;
	@Inject
	PriceServiceImpl priceService;

	@Before
	public void setUp() {
		Guice.createInjector(new ServerModule())
				.injectMembers(this);
	}

	@Test
	public void testCache() {
		paymentService.putCache("testKey", "testValue");
		String cachedValue = priceService.getCachedValue("testKey");

		assertEquals("testValue", cachedValue);
	}
}