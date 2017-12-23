package com.tqc.inter.impl;

import com.google.inject.Provider;
import com.tqc.inter.MyApplet;
import com.tqc.inter.MyDestination;

import javax.inject.Inject;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class StringWritingApplet implements MyApplet {

	private MyDestination destination;

	private Provider<String> stringProvider;

	@Inject
	public StringWritingApplet(MyDestination destination, Provider<String> stringProvider) {
		this.destination = destination;
		this.stringProvider = stringProvider;
	}


	private void writeString() {
		destination.write(stringProvider.get());
	}

	public void run() {
		writeString();
	}
}
