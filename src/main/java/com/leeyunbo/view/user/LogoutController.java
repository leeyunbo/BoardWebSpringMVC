package com.leeyunbo.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController{

	@Override
	public String logout(HttpSession session) {
		System.out.println("�α׾ƿ� ó��");
		
		// 1. �������� ����� ���� ��ü ���� 
		session.invalidate(); 

		// 2. ���� ���� ��, ���� ȭ������ �̵�
		return "login.jsp";
	}

}
