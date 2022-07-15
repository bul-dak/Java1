package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapperTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Autowired
	private BoardService service;
	
	@Test
	public void testRegister() {
		BoardVO vo = new BoardVO();
		vo.setTitle("유기욱");
		vo.setContent("오늘상태");
		vo.setWriter("메롱");
		
		service.register(vo);
		log.info("생성된 게시물 번호: "+vo.getBno());
	}
	
	@Test
	public void testRead() {
		service.get(6L);
//		log.info("검색된 데이타: "+service.get(6L));
	}
	
	@Test
	public void testDelete() {
		log.info("삭제된 개수 : " + service.remove(6L));
	}
	
	@Test
	public void testModify() {
		BoardVO vo = new BoardVO();
		vo.setBno(11L);
		vo.setTitle("토트넘");
		vo.setContent("세비아");
		vo.setWriter("내한");
		
		log.info(service.modify(vo));
	}
	
	@Test
	public void testGetList() {
		log.info(service.getList());
	}
	
	
	
	
	
	
	
}
