package com.korea.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.korea.mapper.BoardMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class BoardMapperTests {
	@Autowired
	private BoardMapper BoardMapper;

	@Test
	public void getListTest() {
		log.info("getList : " + BoardMapper.getList());
		System.out.println("------------------");
	}

	@Test
	public void insertTest() {
		BoardVO board = BoardVO.builder().content("내용").writer("홍동길").title("제목").updateDate(null).
				build();
		BoardMapper.insert(board);
		log.info(board);
		
	}

	@Test
	public void readTest() {
		System.out.println("------------------");
		log.info(BoardMapper.read((long) 12));
	}

	@Test
	public void DeleteTest() {
		log.info(BoardMapper.delete((long) 15));
	}

	@Test
	public void UpdateTest() {
		BoardVO board = BoardVO.builder().bno(8).content("내용").writer("홍동길").title("수정").build();
		log.info(BoardMapper.update(board));
	}

	@Test
	public void getTotalCountTest() {
		Criteria cri = Criteria.builder().bno(0).build();
		log.info("개수 : " + BoardMapper.getTotalCount(cri));
	}
	
	@Test
	public void debug() {
		log.debug("Debug Message!");
	}

}
