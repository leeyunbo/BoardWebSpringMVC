package com.leeyunbo.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController{

	@Override
	public String logout(HttpSession session) {
		System.out.println("로그아웃 처리");
		
		// 1. 브라우저와 연결된 세션 객체 종료 
		session.invalidate(); 

		// 2. 세션 종료 후, 메인 화면으로 이동
		return "login.jsp";
	}

}
