package com.tqc.guicedemospring.model;

import com.google.inject.servlet.RequestScoped;

/**
 * Created by tangqingchang on 2017/12/24.
 */
@RequestScoped
public class RequestParams {
	private String message;

	public RequestParams() {

		System.out.println("RequestParams constructed.");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
