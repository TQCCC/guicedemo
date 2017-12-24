package com.tqc.helloworld.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import com.tqc.helloworld.MyApplet;
import com.tqc.helloworld.MyDestination;
import com.tqc.helloworld.anno.Args;
import com.tqc.helloworld.anno.Output;
import com.tqc.helloworld.impl.PrintStreamWriter;
import com.tqc.helloworld.impl.StringWritingApplet;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class HelloWorldModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(MyApplet.class)
				.annotatedWith(Names.named("hello"))
				.to(StringWritingApplet.class);

		bind(MyDestination.class).to(PrintStreamWriter.class);
		bind(PrintStream.class).toInstance(System.out);
	}


	@Provides
	@Output
	String getOutputString(@Args List<String> args) {
		return args.get(0);
	}
}
