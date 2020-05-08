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
	
	// �˻� ���� ��� ���� 
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("����", "TITLE");
		conditionMap.put("����", "CONTENT");
		return conditionMap;
	}
	
	// �� ���� 
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		System.out.println("�� ���� ó��");
		
		// 1. ����� �Է� ���� ���� Spring Container throw 
		// 2. DB ���� ó�� Spring Container throw 	
		// 3. DB ���� ó�� 
		// 4. ȭ�� �׺���̼�
		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}
	  
	// �� �� ���� ��ȸ
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		System.out.println("�� �� ��ȸ ó��");
		
		// 1. �˻��� �Խñ� ��ȣ ���� Spring Container throw 
		// 2. DB ���� ó�� Spring Container throw 
		// 3. ��ü ����
		// 4. ȭ�� ����
		model.addAttribute("board", boardService.getBoard(vo));
		return "getBoard.jsp";
	}
	
	// �� ��� ��ȸ
	// @RequestParam(value="searchCondition", defaultValue="TITLE",required=false) String condition
	// @RequestParam(value="searchKeyword", defaultValue="",required=false) String keyword
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, Model model) {
		System.out.println("�� ��� �˻� ó��");
	
		//1. ����� �Է� ���� ����(�˻� ��� ���Ŀ� ����) Spring Container throw
		//2. DB ���� ó��, Spring Container throw 
		//3. ��ü ���� 	
		//4. ȭ�� ����
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		
		model.addAttribute("boardList", boardService.getBoardList(vo));
		return "getBoardList.jsp";
	}
	
	// �� �ۼ� 
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo) {
		System.out.println("�� ��� ó��");
		
		//1. ����� �Է� ���� ���� Spring Container throw  
		//2. DB ���� ó�� Spring Container throw
		boardService.insertBoard(vo); 
		return "getBoardList.do";
	}
	
	// �� ����
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo) {
		System.out.println("�� ���� ó��");
		
		//1. ����� �Է� ���� ���� Spring Container throw 
		//2. DB ���� ó�� Spring Container throw 
		//3. DB ���� ó�� 
		//4. ȭ�� �׺���̼�
		boardService.updateBoard(vo);
		return "getBoardList.do";
	}

}
