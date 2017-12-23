package com.tqc.helloworld;

import com.google.inject.AbstractModule;
import com.tqc.helloworld.anno.Output;
import com.tqc.helloworld.MyApplet;
import com.tqc.helloworld.MyDestination;
import com.tqc.helloworld.impl.PrintStreamWriter;
import com.tqc.helloworld.impl.StringWritingApplet;

import java.io.PrintStream;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class HelloWorldModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(MyApplet.class).to(StringWritingApplet.class);
		bind(MyDestination.class).to(PrintStreamWriter.class);
		bind(PrintStream.class).toInstance(System.out);
		bind(String.class).annotatedWith(Output.class).toInstance("Hello World");
	}
}
