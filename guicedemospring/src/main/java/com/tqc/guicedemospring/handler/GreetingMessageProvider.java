package com.tqc.guicedemospring.handler;

import com.google.inject.Provider;
import com.tqc.guicedemospring.dao.SampleDao;
import com.tqc.guicedemospring.model.RequestParams;

import javax.inject.Inject;

/**
 * Created by tangqingchang on 2017/12/25.
 */
public class GreetingMessageProvider implements Provider<String> {

	private final RequestParams params;
	private final SampleDao sampleDao;

	@Inject
	public GreetingMessageProvider(RequestParams params, SampleDao sampleDao) {
		this.params = params;
		this.sampleDao = sampleDao;
	}

	@Override
	public String get() {
		String name = params.getGreetingName();
		sampleDao.save(name);
		return "Hello! " + name;
	}
}
