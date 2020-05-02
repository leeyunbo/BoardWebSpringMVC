package com.leeyunbo.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.leeyunbo.biz.board.BoardVO;
import com.leeyunbo.biz.board.impl.BoardDAO;

public class GetBoardController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�� �� ��ȸ ó��");
		// 1. �˻��� �Խñ� ��ȣ ����
		String seq = request.getParameter("seq");

		// 2. DB ���� ó�� 
		BoardVO vo = new BoardVO(); 
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO = new BoardDAO();
		BoardVO board = boardDAO.getBoard(vo);
		
		// 3. Session ����
		ModelAndView mav = new ModelAndView();
		mav.setViewName("getBoard");
		mav.addObject("board", board);
		return mav;
	}
	
}
