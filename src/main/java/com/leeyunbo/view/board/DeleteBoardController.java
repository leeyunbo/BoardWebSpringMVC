package com.leeyunbo.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leeyunbo.biz.board.BoardVO;
import com.leeyunbo.biz.board.impl.BoardDAO;

@Controller
public class DeleteBoardController{

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 삭제 처리");
		
		// 1. 사용자 입력 정보 추출 Spring Container throw 

		// 2. DB 연동 처리 Spring Container throw 
		
		// 3. DB 로직 처리 
		boardDAO.deleteBoard(vo);
		
		// 4. 화면 네비게이션
		return "getBoardList.do";
	}
	
}
