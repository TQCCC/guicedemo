package com.tqc.guicedemospring.des;

import com.google.inject.servlet.RequestScoped;
import com.tqc.helloworld.MyDestination;

/**
 * Created by tangqingchang on 2017/12/24.
 */
@RequestScoped
public class WebDestination implements MyDestination {

	private final StringBuilder sb;

	public WebDestination() {
		System.out.println("WebDestination constructed.");
		sb = new StringBuilder();
	}

	@Override
	public void write(String string) {
		sb.append(string);
	}

	public String getResult() {
		return sb.toString();
	}
}
