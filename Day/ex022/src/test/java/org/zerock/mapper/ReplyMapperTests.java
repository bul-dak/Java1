package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	
	@Autowired
	private ReplyMapper mapper; 
	
	private Long[] bnoArr = {41L,42L,43L,44L,45L};
	@Test
	public void testMapper() {
		log.info(mapper);
	}
	
	@Test
	public void testCreate() {
		
		for(int i=0; i<5; i++) {
		ReplyVO vo = new ReplyVO();
		vo.setBno(bnoArr[i]);
		vo.setReply("홍길동전0" + i+1);
		vo.setReplyer("길동이0" + i+1);
		mapper.insert(vo);
		}
	}
	
	@Test
	public void testRead() {
		ReplyVO vo = mapper.read(1L);
		log.info(vo);
	}
	
	@Test
	public void testDelete() {
		log.info(mapper.delete(1L));
	}

	@Test
	public void testUpdate() {
		ReplyVO vo = new ReplyVO();
		vo.setReply("수정중...........");
		vo.setRno(2L);
		log.info(mapper.update(vo));
	}
	
	@Test
	public void testList() {
		Criteria cri = new Criteria();
		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[1]);
		log.info(replies);
	}
	
	@Test
	public void testList2() {
		Criteria cri = new Criteria(2,5);
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 200L);
		
		replies.forEach(reply -> log.info(reply));
	}
	
	@Test
	public void testCount() {
		int num = mapper.getCountByBno(200L);
		log.info("num : " + num);
	}
}
