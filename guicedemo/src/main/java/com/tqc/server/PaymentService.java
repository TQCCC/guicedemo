package com.tqc.server;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public interface PaymentService {
	/**
	 * 支付
	 *
	 * @param orderId
	 * @param price
	 * @param sessionId
	 */
	void pay(long orderId, long price, Long sessionId);
}
