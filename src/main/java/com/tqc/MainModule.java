package com.tqc;

import com.google.inject.AbstractModule;
import com.tqc.helloworld.HelloWorldModule;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class MainModule extends AbstractModule {
	@Override
	protected void configure() {
		install(new HelloWorldModule());
	}

}
