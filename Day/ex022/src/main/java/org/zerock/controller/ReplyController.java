package org.zerock.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyPageDTO;
import org.zerock.domain.ReplyVO;
import org.zerock.service.ReplyService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/* 작업		URL			HTTP전송방식
 * 등록 : /replies/new : POST
 * 조회 : /replies/:rno : GET
 * 삭제 : /replies/:rno : DELETE
 * 수정 : /replies/:rno : PUT or PATCH
 * 페이지 : /replies/pages/:bno/:page : GET
*/
@RestController
@RequestMapping("/replies/")
@Log4j
@AllArgsConstructor
public class ReplyController {
	
	private ReplyService service;
	
	//클라이언트에서 서버전송 json, 서버에서 클라이언트 전송 String
	//{속성:값, 속성:값} --> @RequestBody
	//{bno:값, reply:값, replyer:값} 이런식으로 넘겨줘야함
	@PostMapping(value="/new", consumes = "application/json",
			produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> create(@RequestBody ReplyVO vo) {
		log.info("ReplyVO : " + vo);
		int insertCount = service.register(vo);
		
		if(insertCount == 1){
			return new ResponseEntity<>("success", HttpStatus.OK);
//			return "success"; 로 해도 상관 없지만 클라이언트에게 상태창도 함께 보내주기 위해 위에 코드를 사용함
		}else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping(value="/pages/{bno}/{page}", 
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<ReplyPageDTO> getList(@PathVariable("bno") Long bno,@PathVariable("page") int page) {
		Criteria cri = new Criteria(page, 10);
		log.info("cri : " + cri);
		log.info("bno : " + bno);
		return new ResponseEntity<>(service.getListPage(cri, bno), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{rno}", produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> remove(@PathVariable("rno") Long rno) {
		if(service.remove(rno) == 1) {
			return new ResponseEntity<String>("success", HttpStatus.OK);
		}else {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value="/get/{rno}", produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<ReplyVO> get(@PathVariable("rno") Long rno){
		return new ResponseEntity<ReplyVO>(service.get(rno), HttpStatus.OK);
	}

	@RequestMapping(method = {RequestMethod.PUT, RequestMethod.PATCH},
			value="/{rno}", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> modify(@PathVariable("rno") Long rno, @RequestBody ReplyVO vo){
		vo.setRno(rno);
		return service.modify(vo) == 1 ? new ResponseEntity<String>("success",HttpStatus.OK) : 
										new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
