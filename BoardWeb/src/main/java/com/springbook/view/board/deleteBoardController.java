package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.Impl.BoardDAO;
import com.springbook.view.controller.Controller;

public class deleteBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String seq = request.getParameter("seq"); 
		
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(seq)); 
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.deleteBoard(vo); 

		return "getBoardList.do";
	}

}
