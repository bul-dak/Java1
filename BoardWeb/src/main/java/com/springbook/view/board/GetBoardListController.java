package com.springbook.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class GetBoardListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse responce) {
		System.out.println("글 목록 검색 처리");
		BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
//		HttpSession session = request.getSession();
//		session.setAttribute("boardList", boardList);
//		return "getBoardList";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", boardList);
//		mav.setViewName("getBoardList.jsp");
		mav.setViewName("getBoardList");
		return mav;
	}
	
}
