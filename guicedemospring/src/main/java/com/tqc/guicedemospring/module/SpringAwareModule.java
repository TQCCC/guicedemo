package com.tqc.guicedemospring.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.tqc.guicedemospring.dao.SampleDao;
import org.springframework.context.ApplicationContext;

/**
 * Created by tangqingchang on 2017/12/25.
 */
public class SpringAwareModule extends AbstractModule {
	private final ApplicationContext applicationContext;

	public SpringAwareModule(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}


	@Override
	protected void configure() {
		bind(ApplicationContext.class).toInstance(applicationContext);
	}

	@Provides
	SampleDao getSampleDao(ApplicationContext applicationContext) {
		return applicationContext.getBean(SampleDao.class);
	}

}
