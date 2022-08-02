package com.korea.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.korea.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;
@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MybatisSpring {
	@Autowired
	private TimeMapper timeMapper;
	@Test
	public void test() {
		log.info("로그" + timeMapper.getClass().getName());
		log.info("애너테이션방식 : " + timeMapper.getTime());
		log.info("XML : " + timeMapper.getTime2());
	}
	
	@Test
	public void test2() {
		String time = timeMapper.getTime2();
	}
}
