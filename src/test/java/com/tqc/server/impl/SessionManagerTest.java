package com.tqc.server.impl;

import com.google.inject.Guice;
import com.tqc.server.ServerModule;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.*;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class SessionManagerTest {

	@Inject
	SessionManager sessionManager;

	@Before
	public void setUp() {
		Guice.createInjector(new ServerModule()).injectMembers(this);
	}

	@Test
	public void getSessionId() throws InterruptedException {
		Long sessionId1 = sessionManager.getSessionId();
		Thread.sleep(1000);
		Long sessionId2 = sessionManager.getSessionId();

		System.out.println("1: " + sessionId1);
		System.out.println("2: " + sessionId2);


		assertNotEquals(sessionId1.longValue(), sessionId2.longValue());
	}

}