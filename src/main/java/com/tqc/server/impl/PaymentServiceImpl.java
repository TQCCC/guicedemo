package com.tqc.server.impl;

import com.tqc.server.PaymentService;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class PaymentServiceImpl implements PaymentService {
	@Override
	public void pay(long orderId, long price, Long sessionId) {
		System.out.println("start paying...");

		System.out.println("orderId: " + orderId);
		System.out.println("price: " + price);
		System.out.println("sessionId: " + sessionId);

		System.out.println("pay finished...");
	}
}
