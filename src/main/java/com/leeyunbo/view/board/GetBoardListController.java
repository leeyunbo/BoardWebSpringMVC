package com.leeyunbo.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.leeyunbo.biz.board.BoardVO;
import com.leeyunbo.biz.board.impl.BoardDAO;

public class GetBoardListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�� ��� �˻� ó��");
		
		//1. ����� �Է� ���� ����(�˻� ��� ���Ŀ� ����) 
		BoardVO boardVO = new BoardVO();
		
		//2. DB ���� ó�� 
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList();
		
		
		//3. �˻� ����� ���ǿ� �����ϰ� �̵��� ȭ�� �̸� ����, getBoardList.jsp
		ModelAndView mav = new ModelAndView();
		mav.setViewName("getBoardList.jsp");
		mav.addObject("boardList", boardList);
		return mav;
	}
}
