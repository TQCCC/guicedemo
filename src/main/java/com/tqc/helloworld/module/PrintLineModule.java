package com.tqc.helloworld.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.tqc.helloworld.MyApplet;
import com.tqc.helloworld.impl.PrintLineApplet;

/**
 * Created by tangqingchang on 2017/12/24.
 */
public class PrintLineModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(MyApplet.class)
				.annotatedWith(Names.named("println"))
				.to(PrintLineApplet.class);
	}
}
