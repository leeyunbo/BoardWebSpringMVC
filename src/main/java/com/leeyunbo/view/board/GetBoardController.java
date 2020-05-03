package com.leeyunbo.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leeyunbo.biz.board.BoardVO;
import com.leeyunbo.biz.board.impl.BoardDAO;

@Controller
public class GetBoardController{

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
	
}
