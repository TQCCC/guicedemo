package com.tqc.guicedemospring.handler;

import com.google.inject.servlet.RequestScoped;
import com.tqc.guicedemospring.des.WebDestination;
import com.tqc.guicedemospring.model.RequestParams;
import com.tqc.helloworld.MyApplet;

import javax.inject.Inject;

/**
 * Created by tangqingchang on 2017/12/25.
 */
@RequestScoped
public class GreetingHandler {

	private final RequestParams params;
	private final WebDestination destination;
	private final MyApplet applet;

	@Inject
	public GreetingHandler(RequestParams params, WebDestination destination, MyApplet applet) {
		this.params = params;
		this.destination = destination;
		this.applet = applet;
	}

	public String getByName(String name) {
		params.setGreetingName(name);
		applet.run();
		return destination.getResult();
	}
}
