package com.tqc.helloworld.module;

import com.google.inject.AbstractModule;
import com.tqc.helloworld.Applets;
import com.tqc.helloworld.impl.PrintLineApplet;

/**
 * Created by tangqingchang on 2017/12/24.
 */
public class PrintLineModule extends AbstractModule {
	@Override
	protected void configure() {

		Applets.register(binder()).named("println").to(PrintLineApplet.class);

//		MapBinder.newMapBinder(binder(), String.class, MyApplet.class)
//				.addBinding("println").to(PrintLineApplet.class);

//		bind(MyApplet.class)
//				.annotatedWith(Names.named("println"))
//				.to(PrintLineApplet.class);
	}
}
