package com.korea.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class DTOTests {
	@Test
	public void test() {
		/*
		 * testDTO dto = new testDTO("ȫ�浿", "44", "�뱸"); System.out.println(dto);
		 */
		
		testDTO dto = testDTO.builder()
				.age("30").name("ȫ����").addr("�ּ�").build();
		System.out.println(dto);
	}
}
