package com.tqc.guicedemospring.handler;

import com.tqc.guicedemospring.model.RequestParams;

import javax.inject.Inject;

/**
 * Created by tangqingchang on 2017/12/25.
 */
public class GreetingGenerator {

	private final RequestParams params;

	@Inject
	public GreetingGenerator(RequestParams params) {
		this.params = params;
	}

	public String getGreetingMessage() {
		return "Hello! " + params.getGreetingName();
	}
}
