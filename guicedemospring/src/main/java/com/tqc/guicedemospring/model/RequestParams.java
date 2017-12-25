package com.tqc.guicedemospring.model;

import com.google.inject.servlet.RequestScoped;

/**
 * Created by tangqingchang on 2017/12/24.
 */
@RequestScoped
public class RequestParams {
	private String greetingName;

	public RequestParams() {
		System.out.println("RequestParams constructed.");
	}

	public String getGreetingName() {
		return greetingName;
	}

	public void setGreetingName(String greetingName) {
		this.greetingName = greetingName;
	}
}
