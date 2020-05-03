package com.leeyunbo.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.leeyunbo.biz.board.BoardVO;
import com.leeyunbo.biz.board.impl.BoardDAO;

@Controller
public class InsertBoardController {

	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 등록 처리");
		
		//1. 사용자 입력 정보 추출 Spring Container throw  
		//2. DB 연동 처리 Spring Container throw
		boardDAO.insertBoard(vo); 
		return "getBoardList.do";
	}
}
