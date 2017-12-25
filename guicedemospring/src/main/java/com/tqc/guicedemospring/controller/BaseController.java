package com.tqc.guicedemospring.controller;

import com.tqc.guicedemospring.handler.GreetingHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tangqingchang on 2017/12/24.
 */
@RestController
public class BaseController {

	@Autowired
	GreetingHandler greetingHandler;

	@RequestMapping("/greeting")
	String home(@RequestParam("name") String name) {
		return greetingHandler.getByName(name);
	}
}
