package com.tqc.helloworld.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.tqc.helloworld.anno.Args;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tangqingchang on 2017/12/24.
 */
public class CommandLineModule extends AbstractModule {

	private String[] args;

	public CommandLineModule(String[] args) {
		this.args = args;
	}

	@Override
	protected void configure() {

	}

	@Provides
	@Args
	List<String> getCommandLineArgs() {
		return Arrays.asList(args);
	}

}
