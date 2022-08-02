package com.korea.controller;

import static org.junit.Assert.fail;

import org.junit.Test;

import lombok.extern.log4j.Log4j;
@Log4j
public class logLeveltest {

	@Test
	public void test() {
		log.trace("test trace");
		log.debug("Debug Test");
		log.info("info test");
		log.warn("warn test");
	}

}
