package com.tqc;

import com.google.inject.Guice;
import com.tqc.inter.MyApplet;

public class App {

	/**
	 * bootstrap
	 * parse command line
	 * set up environment
	 * kick off main logic
	 *
	 * @param args [description]
	 */
	public static void main(String[] args) {
		MyApplet mainApplet = Guice.createInjector(
				new MainModule()
		).getInstance(MyApplet.class);

		mainApplet.run();
	}

}
