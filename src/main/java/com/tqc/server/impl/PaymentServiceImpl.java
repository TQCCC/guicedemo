package com.tqc.server.impl;

import com.google.common.cache.Cache;
import com.tqc.server.PaymentService;

import javax.inject.Inject;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class PaymentServiceImpl implements PaymentService {

	private final Cache<String, String> cache;

	@Inject
	public PaymentServiceImpl(Cache<String, String> cache) {
		this.cache = cache;
	}

	@Override
	public void pay(long orderId, long price, Long sessionId) {
		System.out.println("start paying...");

		System.out.println("orderId: " + orderId);
		System.out.println("price: " + price);
		System.out.println("sessionId: " + sessionId);

		System.out.println("pay finished...");
	}


	public void putCache(String key, String value) {
		cache.put(key, value);
	}

}
