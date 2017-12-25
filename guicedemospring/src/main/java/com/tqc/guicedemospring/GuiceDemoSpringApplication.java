package com.tqc.guicedemospring;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.tqc.guicedemospring.handler.GreetingHandler;
import com.tqc.guicedemospring.module.HelloWorldWebModule;
import com.tqc.guicedemospring.module.SpringAwareModule;
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
	GreetingHandler greetingHandler(Injector injector) {
		return injector.getInstance(GreetingHandler.class);
	}

}
