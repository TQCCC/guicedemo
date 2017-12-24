package com.tqc.guicedemospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tangqingchang on 2017/12/24.
 */
@RestController
public class BaseController {

	@GetMapping("/hello")
	String home() {
		return "Hello World";
	}
}
