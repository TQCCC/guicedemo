package com.tqc.guicedemospring.controller;

import com.tqc.guicedemospring.des.WebDestination;
import com.tqc.guicedemospring.model.RequestParams;
import com.tqc.helloworld.MyApplet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tangqingchang on 2017/12/24.
 */
@RestController
public class BaseController {

	@Autowired
	MyApplet applet;

	@Autowired
	WebDestination webDestination;

	@Autowired
	RequestParams params;

	@GetMapping("/hello")
	String home(@RequestParam("msg") String msg) {
		params.setMessage(msg);
		applet.run();
		return webDestination.getResult();
	}
}
