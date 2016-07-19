package com.example.spring.logic.test.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.spring.logic.test.TestService;

/**
 * @author gimbyeongsu
 * 
 */
@Service
public class TestServiceImpl implements TestService {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

	@Override
	public void test() {
		LOGGER.debug("KKK");
	}

	// @Override
	// public void test(java.util.Map<String, Object> params) {
	// LOGGER.debug("test {}", params);
	// }
}
