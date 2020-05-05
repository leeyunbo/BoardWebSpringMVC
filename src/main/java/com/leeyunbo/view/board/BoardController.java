package com.leeyunbo.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("�� �� ��ȸ ó��");
		
		// 1. �˻��� �Խñ� ��ȣ ���� Spring Container throw 
		// 2. DB ���� ó�� Spring Container throw 
		// 3. ModelAndView ��ü ����
		mav.setViewName("getBoard.jsp");
		mav.addObject("board", boardDAO.getBoard(vo));
		return mav;
	}
	
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("�� ��� �˻� ó��");
		
		//1. ����� �Է� ���� ����(�˻� ��� ���Ŀ� ����) Spring Container throw
		//2. DB ���� ó��, Spring Container throw 
		//3. ModelAndView ��ü ����
		BoardVO boardVO = new BoardVO();
		mav.addObject("boardList", boardDAO.getBoardList());
		mav.setViewName("getBoardList.jsp");
		return mav;
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
