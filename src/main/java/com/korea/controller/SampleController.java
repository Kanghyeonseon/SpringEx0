package com.korea.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.korea.domain.BoardDTO;
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
	
	@GetMapping("/test9")
	public void test9 (SampleDTO dto, Model model) {
		log.info("URL : test9");
		log.info("dto : " + dto);
		model.addAttribute("dto", dto);
	}
	
	@GetMapping("/test10")
	public String test10 () {
		log.info("URL : /test10");
		return "/test10";
	}
	
	// ������ ���
	@GetMapping("/forward")
	public String Forward (SampleDTO dto, Model model) {
		log.info("URL : /forward...");
		model.addAttribute("dto", dto);
		return "forward:result"; // ������ġ�� �������� ����η� ������. �����ζ�� /sample/result�� �Է��ؾ���.
	}
	
	@GetMapping("/result")
	public void result (Model model) {
		log.info("URL : /result...");
		BoardDTO dto = new BoardDTO().builder()
				.no(1010)
				.content("����")
				.writer("admin")
				.build();
		model.addAttribute("board", dto);
	}
	
	// �����̷�Ʈ ���
	@GetMapping("/redirect")
	public String Redirect (SampleDTO dto, RedirectAttributes rttr) {
		log.info("URL : /redirect...");
		// model.addAttribute("dto", dto);
		rttr.addFlashAttribute("dto", dto);
		return "redirect:result"; // ������ġ�� �������� ����η� ������. �����ζ�� /sample/result�� �Է��ؾ���.
	}
	
	// void Ÿ��
	@GetMapping("/voidtest")
	public void testfunc() {
		log.info("void �׽�Ʈ ������...");
	}
	
	// String Ÿ��
	@GetMapping("/stringtest")
	public String testfunc2(@RequestParam("Page") Integer page) {
		log.info("string �׽�Ʈ ������..");
		if(page==1) {
			return "/sample/one";
		} else {
			return "/sample/two";
		}
	}
	
	// ��ü Ÿ��
	@GetMapping("/objectTest")
	public @ResponseBody SampleDTO testfunc3() {
		SampleDTO dto = new SampleDTO();
		dto.setAge(10);
		dto.setName("ȫ�浿");
		return dto;
	}
	
	
	
	// ResponseEntity Ÿ��
	@GetMapping("/responseEntityTest")
	public ResponseEntity<String> testfunc4() {
		log.info("response Entity Ÿ��...");
		HttpHeaders header = new HttpHeaders();
		header.add("content-Type", "application/json;charset=UTF-8");
		
		SampleDTO dto = new SampleDTO();
		dto.setAge(10);
		dto.setName("ȫ�浿");
		
		return new ResponseEntity<String>(dto.toString(), header, HttpStatus.OK);
	}
	
	// ����
	@GetMapping("/errortest")
	public String errortest (SampleDTO dto, Model model) {
		model.addAttribute("dto", dto);
		return "/sample/voidtest";
	}
	
	
	
	
	
	
	
	
	
	
}
