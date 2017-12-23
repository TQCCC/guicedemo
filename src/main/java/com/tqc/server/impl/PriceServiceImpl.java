package com.tqc.server.impl;

import com.tqc.server.PriceService;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class PriceServiceImpl implements PriceService {
	@Override
	public long getPrice(long orderId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<String> getSupportedCurrencies() {
		return Arrays.asList("CNY", "USD", "EUR");
	}
}
