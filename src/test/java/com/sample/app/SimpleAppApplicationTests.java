package com.sample.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleAppApplicationTests {

	Logger logger = LoggerFactory.getLogger(SimpleAppApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Testcase executing");
		assertEquals(1,1);
	}

}
