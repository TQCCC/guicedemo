package com.tqc.server;

import java.util.List;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public interface PriceService {
	/**
	 * 根据订单id获取价格
	 * @param orderId
	 * @return
	 */
	long getPrice(long orderId);

	/**
	 * 获取支持的货币类型
	 * @return
	 */
	List<String> getSupportedCurrencies();
}
