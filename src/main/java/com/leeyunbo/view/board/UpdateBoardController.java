package com.leeyunbo.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.leeyunbo.biz.board.BoardVO;
import com.leeyunbo.biz.board.impl.BoardDAO;


public class UpdateBoardController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�� ���� ó��");
		
		//1. ����� �Է� ���� ����
		// request.setCharacterEncoding("EUC-KR"); 
		String title = request.getParameter("title");
		String content = request.getParameter("content"); 
		String seq = request.getParameter("seq"); 
		
		//2. DB ���� ó�� 
		BoardVO vo = new BoardVO(); 
		vo.setTitle(title);
		vo.setContent(content);
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO = new BoardDAO(); 
		boardDAO.updateBoard(vo);
		
		//3. ȭ�� �׺���̼� 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("getBoardList.do");
		return mav;
	}

}
