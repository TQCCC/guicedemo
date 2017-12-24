package com.tqc;

import com.google.common.base.Joiner;
import com.google.inject.Guice;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
import com.tqc.helloworld.MyApplet;
import com.tqc.helloworld.module.CommandLineModule;
import com.tqc.helloworld.module.MainModule;

import java.util.Map;

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
		Map<String, MyApplet> applets = Guice.createInjector(
				new MainModule(),
				new CommandLineModule(args)
		).getInstance(
				Key.get(new TypeLiteral<Map<String, MyApplet>>() {
				})
		);

		if (args.length == 0 || !applets.containsKey(args[0])) {
			System.out.println("Unable to find applet.\n" +
					"Valid applets are: " +
					Joiner.on(", ").join(applets.keySet()));
			return;
		}

		applets.get(args[0]).run();
	}

}
