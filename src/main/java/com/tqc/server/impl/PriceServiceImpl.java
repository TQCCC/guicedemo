package com.tqc.server.impl;

import com.tqc.server.PriceService;

import javax.inject.Inject;
import java.util.Set;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class PriceServiceImpl implements PriceService {

	private final Set<String> supportedCurrencies;

	@Inject
	public PriceServiceImpl(Set<String> supportedCurrencies) {
		this.supportedCurrencies = supportedCurrencies;
	}

	@Override
	public long getPrice(long orderId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<String> getSupportedCurrencies() {
		return supportedCurrencies;
	}
}
