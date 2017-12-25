package com.tqc.guicedemospring.des;

import com.google.inject.servlet.RequestScoped;
import com.tqc.guicedemospring.dao.SampleDao;
import com.tqc.helloworld.MyDestination;

import javax.inject.Inject;

/**
 * Created by tangqingchang on 2017/12/24.
 */
@RequestScoped
public class WebDestination implements MyDestination {

	private final StringBuilder sb;
	private final SampleDao sampleDao;

	@Inject
	public WebDestination(SampleDao sampleDao) {
		System.out.println("WebDestination constructed.");
		this.sampleDao = sampleDao;
		sb = new StringBuilder();
	}

	@Override
	public void write(String string) {
		sb.append(string);
		sampleDao.save(string);
	}

	public String getResult() {
		return sb.toString();
	}
}
