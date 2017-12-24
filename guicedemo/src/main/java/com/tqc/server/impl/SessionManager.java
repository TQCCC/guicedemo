package com.tqc.server.impl;

import com.google.inject.Provider;
import com.tqc.server.anno.SessionId;

import javax.inject.Inject;

/**
 * Created by tangqingchang on 2017/12/23.
 */
public class SessionManager {

	private final Provider<Long> sessionIdProvider;

	@Inject
	public SessionManager(@SessionId Provider<Long> sessionIdProvider) {
		this.sessionIdProvider = sessionIdProvider;
	}

	public Long getSessionId() {
		return sessionIdProvider.get();
	}
}
