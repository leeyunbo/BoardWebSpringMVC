package com.leeyunbo.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leeyunbo.biz.board.BoardVO;
import com.leeyunbo.biz.board.impl.BoardDAO;

@Controller
public class BoardController {
	
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 삭제 처리");
		
		// 1. 사용자 입력 정보 추출 Spring Container throw 
		// 2. DB 연동 처리 Spring Container throw 	
		// 3. DB 로직 처리 
		// 4. 화면 네비게이션
		boardDAO.deleteBoard(vo);
		return "getBoardList.do";
	}
	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
		System.out.println("글 상세 조회 처리");
		
		// 1. 검색할 게시글 번호 추출 Spring Container throw 
		// 2. DB 연동 처리 Spring Container throw 
		// 3. 객체 지정
		// 4. 화면 리턴
		model.addAttribute("board", boardDAO.getBoard(vo));
		return "getBoard.jsp";
	}
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, BoardDAO boardDAO, Model model) {
		System.out.println("글 목록 검색 처리");
		
		//1. 사용자 입력 정보 추출(검색 기능 이후에 구현) Spring Container throw
		//2. DB 연동 처리, Spring Container throw 
		//3. 객체 지정 
		//4. 화면 리턴
		model.addAttribute("boardList", boardDAO.getBoardList());
		return "getBoardList.jsp";
	}
	
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 등록 처리");
		
		//1. 사용자 입력 정보 추출 Spring Container throw  
		//2. DB 연동 처리 Spring Container throw
		boardDAO.insertBoard(vo); 
		return "getBoardList.do";
	}
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 수정 처리");
		
		//1. 사용자 입력 정보 추출 Spring Container throw 
		//2. DB 연동 처리 Spring Container throw 
		//3. DB 로직 처리 
		//4. 화면 네비게이션
		boardDAO.updateBoard(vo);
		return "getBoardList.do";
	}

}
