package com.tqc.guicedemospring;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.tqc.guicedemospring.des.WebDestination;
import com.tqc.guicedemospring.model.RequestParams;
import com.tqc.guicedemospring.module.HelloWorldWebModule;
import com.tqc.guicedemospring.module.SpringAwareModule;
import com.tqc.helloworld.MyApplet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.RequestScope;

@SpringBootApplication
@ServletComponentScan
public class GuiceDemoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuiceDemoSpringApplication.class, args);
	}

	@Bean
	Injector injector(ApplicationContext applicationContext) {
		return Guice.createInjector(
				new HelloWorldWebModule(),
				new SpringAwareModule(applicationContext)
		);
	}

	@Bean
	@RequestScope
	MyApplet applet(Injector injector) {
		return injector.getInstance(MyApplet.class);
	}

	@Bean
	@RequestScope
	WebDestination destination(Injector injector) {
		return injector.getInstance(WebDestination.class);
	}

	@Bean
	@RequestScope
	RequestParams params(Injector injector) {
		return injector.getInstance(RequestParams.class);
	}
}
