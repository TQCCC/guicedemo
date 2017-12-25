package com.tqc.guicedemospring.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.servlet.ServletModule;
import com.tqc.guicedemospring.dao.SampleDao;
import org.springframework.context.ApplicationContext;

/**
 * Created by tangqingchang on 2017/12/25.
 */
public class SpringAwareServletModule extends AbstractModule {
	private final ApplicationContext applicationContext;

	public SpringAwareServletModule(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}


	@Override
	protected void configure() {
		install(new ServletModule());
		bind(ApplicationContext.class).toInstance(applicationContext);
	}

	@Provides
	SampleDao getSampleDao(ApplicationContext applicationContext) {
		return applicationContext.getBean(SampleDao.class);
	}

}
