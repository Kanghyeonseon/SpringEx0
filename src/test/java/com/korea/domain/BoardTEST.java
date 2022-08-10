package com.korea.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;
@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardTEST {
	@Autowired
	private BoardVO boardVO;
	
	@Test
	public void test() {
		BoardVO BoardVO = boardVO.builder()
				.title("자바의정식").build();
		log.info("BoardVO : " + BoardVO);
	}

}
