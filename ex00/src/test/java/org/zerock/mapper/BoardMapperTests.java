package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(list->log.info(list));
//		for(BoardVO vo : mapper.getList()) {
//			log.info(vo);
//		}
	}
		@Test
		public void testinsert() {
			BoardVO vo = new BoardVO();
			vo.setTitle("자바의 정석");
			vo.setContent("자바 책...");
			vo.setWriter("남궁성");
			mapper.insert(vo);
		}
		@Test
		public void testSelectKey() {
			BoardVO vo = new BoardVO();
			vo.setTitle("JSP2");
			vo.setContent("JSP2 책...");
			vo.setWriter("남궁성");
			mapper.insertSelectKey(vo);
		}

		@Test
		public void testread() {
			BoardVO vo = mapper.read(10L);
			log.info(vo);
		}

		@Test
		public void testdelete() {
//			mapper.delete(9L);
			log.info("delete count : "+mapper.delete(9L));
		}

		@Test
		public void testupdate() {
			BoardVO vo = new BoardVO();
			vo.setBno(2L);
			vo.setTitle("1");
			vo.setContent("2");
			vo.setWriter("3");
			log.info("update count"+mapper.update(vo));
		}


}
