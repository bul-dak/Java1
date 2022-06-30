package com.ezen.project.goods;

import java.util.List;

public interface GoodsService {
	//CRUD기능의 메소드 구현
	//글등록
	void insertBoard(GoodsVO vo);
	//글수정
	void updateBoard(GoodsVO vo);
	//글삭제
	void deleteBoard(GoodsVO vo);
	//글 상세 조회
	GoodsVO getBoard(GoodsVO vo);
	//글 목록 조회
	List<GoodsVO> getBoardList(GoodsVO vo);
	
}