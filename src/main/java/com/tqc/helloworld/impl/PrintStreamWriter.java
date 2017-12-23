package com.tqc.helloworld.impl;

import com.tqc.helloworld.MyDestination;

import javax.inject.Inject;
import java.io.PrintStream;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class PrintStreamWriter implements MyDestination {

	private PrintStream destination;

	@Inject
	public PrintStreamWriter(PrintStream destination) {
		this.destination = destination;
	}

	@Override
	public void write(String s) {
		destination.println(s);
	}
}
