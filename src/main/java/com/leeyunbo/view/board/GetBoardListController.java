package com.leeyunbo.view.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leeyunbo.biz.board.BoardVO;
import com.leeyunbo.biz.board.impl.BoardDAO;

@Controller
public class GetBoardListController {

	@RequestMapping("/getBoardList.do")
	public ModelAndView handleRequest(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 목록 검색 처리");
		
		//1. 사용자 입력 정보 추출(검색 기능 이후에 구현) Spring Container throw 
		BoardVO boardVO = new BoardVO();
		
		//2. DB 연동 처리, Spring Container throw 
		
		
		//3. 검색 결과를 세션에 저장하고 이동할 화면 이름 리턴, getBoardList.jsp
		mav.addObject("boardList", boardDAO.getBoardList());
		mav.setViewName("getBoardList.jsp");
		return mav;
	}
}
