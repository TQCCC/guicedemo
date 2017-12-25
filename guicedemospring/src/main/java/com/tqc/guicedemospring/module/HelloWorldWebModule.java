package com.tqc.guicedemospring.module;

import com.google.inject.AbstractModule;
import com.tqc.guicedemospring.des.WebDestination;
import com.tqc.guicedemospring.handler.GreetingMessageProvider;
import com.tqc.helloworld.MyApplet;
import com.tqc.helloworld.MyDestination;
import com.tqc.helloworld.anno.Output;
import com.tqc.helloworld.impl.StringWritingApplet;

/**
 * Created by tangqingchang on 2017/12/24.
 */
public class HelloWorldWebModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(MyApplet.class).to(StringWritingApplet.class);
		bind(MyDestination.class).to(WebDestination.class);
		bind(String.class).annotatedWith(Output.class).toProvider(GreetingMessageProvider.class);
	}

}
