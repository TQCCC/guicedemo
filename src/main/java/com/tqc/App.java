package com.tqc;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.tqc.helloworld.Applets;
import com.tqc.helloworld.module.CommandLineModule;
import com.tqc.helloworld.module.MainModule;

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

		Injector injector = Guice.createInjector(
				new MainModule(),
				new CommandLineModule(args)
		);

		Applets.get(injector, args[0]).run();
	}

}
