package com.leeyunbo.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leeyunbo.biz.board.BoardVO;
import com.leeyunbo.biz.board.impl.BoardDAO;

@Controller
public class GetBoardController{

	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 상세 조회 처리");
		
		// 1. 검색할 게시글 번호 추출 Spring Container throw 
		// 2. DB 연동 처리 Spring Container throw 
		// 3. ModelAndView 객체 설정
		mav.setViewName("getBoard.jsp");
		mav.addObject("board", boardDAO.getBoard(vo));
		return mav;
	}
	
}
