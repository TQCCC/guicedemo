package com.tqc.server.impl;

import com.tqc.server.OrderService;
import com.tqc.server.PaymentService;
import com.tqc.server.PriceService;

import javax.inject.Inject;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class OrderServiceImpl implements OrderService {
	private final PriceService priceService;
	private final PaymentService paymentService;
	private final SessionManager sessionManager;

	private Long ordersPaid = 0L;

	@Inject
	public OrderServiceImpl(PriceService priceService, PaymentService paymentService, SessionManager sessionManager) {
		this.priceService = priceService;
		this.paymentService = paymentService;
		this.sessionManager = sessionManager;
	}

	@Override
	public void sendToPayment(long orderId) {
		long price = priceService.getPrice(orderId);
		paymentService.pay(orderId, price, sessionManager.getSessionId());
		ordersPaid = ordersPaid + 1;
	}
}
