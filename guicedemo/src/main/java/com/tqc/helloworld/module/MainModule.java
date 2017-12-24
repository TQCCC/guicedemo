package com.tqc.helloworld.module;

import com.google.inject.AbstractModule;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class MainModule extends AbstractModule {
	@Override
	protected void configure() {
		install(new HelloWorldModule());
		install(new PrintLineModule());
	}

}
