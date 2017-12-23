package com.tqc;

import com.google.inject.AbstractModule;
import com.tqc.inter.MyApplet;
import com.tqc.inter.MyDestination;
import com.tqc.inter.impl.PrintStreamWriter;
import com.tqc.inter.impl.StringWritingApplet;

import java.io.PrintStream;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class MainModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(MyApplet.class).to(StringWritingApplet.class);
		bind(MyDestination.class).to(PrintStreamWriter.class);
		bind(PrintStream.class).toInstance(System.out);
		bind(String.class).toInstance("Hello World");
	}

}
