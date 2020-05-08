package com.leeyunbo.view.board;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.leeyunbo.biz.board.BoardService;
import com.leeyunbo.biz.board.BoardVO;
import com.leeyunbo.biz.board.impl.BoardDAO;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	// 검색 조건 목록 설정 
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}
	
	// 글 삭제 
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		System.out.println("글 삭제 처리");
		
		// 1. 사용자 입력 정보 추출 Spring Container throw 
		// 2. DB 연동 처리 Spring Container throw 	
		// 3. DB 로직 처리 
		// 4. 화면 네비게이션
		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}
	  
	// 글 상세 정보 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		System.out.println("글 상세 조회 처리");
		
		// 1. 검색할 게시글 번호 추출 Spring Container throw 
		// 2. DB 연동 처리 Spring Container throw 
		// 3. 객체 지정
		// 4. 화면 리턴
		model.addAttribute("board", boardService.getBoard(vo));
		return "getBoard.jsp";
	}
	
	// 글 목록 조회
	// @RequestParam(value="searchCondition", defaultValue="TITLE",required=false) String condition
	// @RequestParam(value="searchKeyword", defaultValue="",required=false) String keyword
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, Model model) {
		System.out.println("글 목록 검색 처리");
	
		//1. 사용자 입력 정보 추출(검색 기능 이후에 구현) Spring Container throw
		//2. DB 연동 처리, Spring Container throw 
		//3. 객체 지정 	
		//4. 화면 리턴
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		
		model.addAttribute("boardList", boardService.getBoardList(vo));
		return "getBoardList.jsp";
	}
	
	// 글 작성 
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo) {
		System.out.println("글 등록 처리");
		
		//1. 사용자 입력 정보 추출 Spring Container throw  
		//2. DB 연동 처리 Spring Container throw
		boardService.insertBoard(vo); 
		return "getBoardList.do";
	}
	
	// 글 수정
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo) {
		System.out.println("글 수정 처리");
		
		//1. 사용자 입력 정보 추출 Spring Container throw 
		//2. DB 연동 처리 Spring Container throw 
		//3. DB 로직 처리 
		//4. 화면 네비게이션
		boardService.updateBoard(vo);
		return "getBoardList.do";
	}

}
