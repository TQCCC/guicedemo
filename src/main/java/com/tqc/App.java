package com.tqc;

import com.google.inject.Guice;
import com.google.inject.Key;
import com.google.inject.name.Names;
import com.tqc.helloworld.MyApplet;
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
		MyApplet mainApplet = Guice.createInjector(
				new MainModule(),
				new CommandLineModule(args)
		).getInstance(
				Key.get(
						MyApplet.class,
						Names.named(args[0])
				)
		);

		mainApplet.run();
	}

}
