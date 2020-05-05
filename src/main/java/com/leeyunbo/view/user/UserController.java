package com.leeyunbo.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.leeyunbo.biz.user.UserVO;
import com.leeyunbo.biz.user.impl.UserDAO;

@Controller
public class UserController {
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("�α׾ƿ� ó��");
		
		// 1. �������� ����� ���� ��ü ���� 
		// 2. ���� ���� ��, ���� ȭ������ �̵�
		session.invalidate(); 
		return "login.jsp";
	}
	
	@RequestMapping(value = "/login.do", method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO) {
		System.out.println("�α��� ó��");
		
		// ����� �Է� ���� Spring Container throw 
		// DB ���� ó�� Spring Container throw 	
		// ȭ�� �׺���̼� & DB ���� ó�� 
		if(userDAO.getUser(vo) != null) {
			return "getBoardList.do";
		} else {
			return "login.jsp";
		}	
	}
	
	@RequestMapping(value = "/login.do", method=RequestMethod.GET)
	public String loginView(UserVO vo) {
		System.out.println("�α��� ȭ������ �̵�"); 
		vo.setId("test");
		vo.setPassword("test123");
		return "login.jsp";
	}
}
