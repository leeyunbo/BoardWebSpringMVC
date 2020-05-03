package com.leeyunbo.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leeyunbo.biz.board.BoardVO;
import com.leeyunbo.biz.board.impl.BoardDAO;

@Controller
public class UpdateBoardController{

	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 수정 처리");
		
		//1. 사용자 입력 정보 추출 Spring Container throw 
		
		//2. DB 연동 처리 Spring Container throw 
		
		//3. DB 로직 처리 
		boardDAO.updateBoard(vo);
		
		//4. 화면 네비게이션
		return "getBoardList.do";
	}

}
