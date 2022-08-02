package com.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public void test1() {
		log.info("URL : /test");
	}
	
	@GetMapping("/test2") 
	public void test2() {
		log.info("URL : test2");
	}
	@GetMapping("/test3") 
	public void test3(SampleDTO dto) {
		log.info("URL : test3");
	}
}
