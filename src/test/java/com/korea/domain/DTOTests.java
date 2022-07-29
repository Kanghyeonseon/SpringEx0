package com.korea.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class DTOTests {
	@Test
	public void test() {
		/*
		 * testDTO dto = new testDTO("全辨悼", "44", "措备"); System.out.println(dto);
		 */
		
		testDTO dto = testDTO.builder()
				.age("30").name("全悼辨").addr("林家").build();
		System.out.println(dto);
	}
}
