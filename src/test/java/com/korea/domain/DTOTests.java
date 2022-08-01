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
public class DTOTests {
	@Autowired
	private testDTO testDTO;
	
	@Test
	public void test() {
		/*
		 * testDTO dto = new testDTO("全辨悼", "44", "措备"); System.out.println(dto);
		 */
		
		testDTO dto = testDTO.builder()
				.age("30").name("全悼辨").addr("林家").build();
		System.out.println(dto);
	}
	
	@Test
	public void test2() {
		testDTO.setName("全辨悼");
		log.info("testDTO : " + testDTO);
	}
}
