package com.leeyunbo.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leeyunbo.biz.board.BoardVO;
import com.leeyunbo.biz.board.impl.BoardDAO;

@Controller
public class DeleteBoardController{

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("�� ���� ó��");
		
		// 1. ����� �Է� ���� ���� Spring Container throw 

		// 2. DB ���� ó�� Spring Container throw 
		
		// 3. DB ���� ó�� 
		boardDAO.deleteBoard(vo);
		
		// 4. ȭ�� �׺���̼�
		return "getBoardList.do";
	}
	
}
