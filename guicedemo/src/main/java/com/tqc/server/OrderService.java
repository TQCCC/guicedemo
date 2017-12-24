package com.tqc.server;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public interface OrderService {

	/**
	 * send to payment
	 *
	 * @param orderId
	 */
	void sendToPayment(long orderId);
}
