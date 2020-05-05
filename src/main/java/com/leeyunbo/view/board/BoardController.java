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
		System.out.println("�� ���� ó��");
		
		// 1. ����� �Է� ���� ���� Spring Container throw 
		// 2. DB ���� ó�� Spring Container throw 	
		// 3. DB ���� ó�� 
		// 4. ȭ�� �׺���̼�
		boardDAO.deleteBoard(vo);
		return "getBoardList.do";
	}
	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
		System.out.println("�� �� ��ȸ ó��");
		
		// 1. �˻��� �Խñ� ��ȣ ���� Spring Container throw 
		// 2. DB ���� ó�� Spring Container throw 
		// 3. ��ü ����
		// 4. ȭ�� ����
		model.addAttribute("board", boardDAO.getBoard(vo));
		return "getBoard.jsp";
	}
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, BoardDAO boardDAO, Model model) {
		System.out.println("�� ��� �˻� ó��");
		
		//1. ����� �Է� ���� ����(�˻� ��� ���Ŀ� ����) Spring Container throw
		//2. DB ���� ó��, Spring Container throw 
		//3. ��ü ���� 
		//4. ȭ�� ����
		model.addAttribute("boardList", boardDAO.getBoardList());
		return "getBoardList.jsp";
	}
	
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("�� ��� ó��");
		
		//1. ����� �Է� ���� ���� Spring Container throw  
		//2. DB ���� ó�� Spring Container throw
		boardDAO.insertBoard(vo); 
		return "getBoardList.do";
	}
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("�� ���� ó��");
		
		//1. ����� �Է� ���� ���� Spring Container throw 
		//2. DB ���� ó�� Spring Container throw 
		//3. DB ���� ó�� 
		//4. ȭ�� �׺���̼�
		boardDAO.updateBoard(vo);
		return "getBoardList.do";
	}

}
