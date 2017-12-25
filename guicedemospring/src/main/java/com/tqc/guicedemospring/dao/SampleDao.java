package com.tqc.guicedemospring.dao;

import org.springframework.stereotype.Component;

/**
 * Created by tangqingchang on 2017/12/25.
 */
@Component
public class SampleDao {
	public void save(String data) {
		System.out.println(data + " saved.");
	}
}
