package com.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.domain.SampleDTO;
import com.korea.domain.SampleDTOList;
import com.korea.domain.TodoDTO;
import com.korea.domain.TodoDTO2;

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
	@GetMapping("/test4")
	public void test4(@RequestParam("name") String name, @RequestParam("age") Integer age) {
		log.info("URL : test4");
		log.info("name : " + name +", age : " + age);
	}
	@GetMapping("/test5")
	public void test5(@RequestParam("name") String[] list) {
		log.info("URL : test5");
		for(String str : list) {
			log.info(str + " ");
		}
	}
	@GetMapping("/test6")
	public void test6(SampleDTOList list) {
		log.info("URL : test6");
		for(SampleDTO dto : list.getList()) {
			log.info(dto + " ");
		}
	}

	/*
	 * @InitBinder public void initBinder(WebDataBinder binder) { SimpleDateFormat
	 * df = new SimpleDateFormat("yyyy-mm-dd");
	 * binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(df,
	 * false)); }
	 */
	@GetMapping("/test7")
	public void test7 (TodoDTO tdto) {
		log.info("URL : test7");
		log.info(tdto);
	}
	@GetMapping("/test8")
	public void test8 (TodoDTO2 tdto) {
		log.info("URL : test8");
		log.info(tdto);
	}
	
}
