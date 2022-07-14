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
	public void testgetList() {
		log.info(mapper.getList());
	}

	@Test
	public void testread() {
		log.info(mapper.read(4L));
	}
	
	@Test
	public void testdelete() {
		log.info(mapper.delete(1L));
	}
	
	@Test
	public void testinsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("이수정");
		vo.setContent("모자샀다");
		vo.setWriter("MLB");
		log.info(mapper.insert(vo));
	}
	
	@Test
	public void testinsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setBno(15L);
		vo.setTitle("AAA");
		vo.setContent("모자샀다");
		vo.setWriter("MLB");
		log.info(mapper.insertSelectKey(vo));
	}
	
	@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setBno(15L);
		vo.setTitle("BBB");
		vo.setContent("BBB");
		vo.setWriter("BBB");
		log.info(mapper.update(vo));
	}
	





}
