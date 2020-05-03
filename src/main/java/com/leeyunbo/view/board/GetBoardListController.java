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
		System.out.println("�� ��� �˻� ó��");
		
		//1. ����� �Է� ���� ����(�˻� ��� ���Ŀ� ����) Spring Container throw 
		BoardVO boardVO = new BoardVO();
		
		//2. DB ���� ó��, Spring Container throw 
		
		
		//3. �˻� ����� ���ǿ� �����ϰ� �̵��� ȭ�� �̸� ����, getBoardList.jsp
		mav.addObject("boardList", boardDAO.getBoardList());
		mav.setViewName("getBoardList.jsp");
		return mav;
	}
}
