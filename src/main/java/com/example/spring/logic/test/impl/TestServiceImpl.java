package com.example.spring.logic.test.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.spring.logic.test.TestService;

@Service
public class TestServiceImpl implements TestService {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

	@Override
	public void test() {
		LOGGER.debug("KKK");
	}

	// @Override
	// public void test(String params) {
	// LOGGER.debug("test {}", params);
	// }
}
