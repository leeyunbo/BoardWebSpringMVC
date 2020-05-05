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
		System.out.println("로그아웃 처리");
		
		// 1. 브라우저와 연결된 세션 객체 종료 
		// 2. 세션 종료 후, 메인 화면으로 이동
		session.invalidate(); 
		return "login.jsp";
	}
	
	@RequestMapping(value = "/login.do", method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO) {
		System.out.println("로그인 처리");
		
		// 사용자 입력 추출 Spring Container throw 
		// DB 연동 처리 Spring Container throw 	
		// 화면 네비게이션 & DB 로직 처리 
		if(userDAO.getUser(vo) != null) {
			return "getBoardList.do";
		} else {
			return "login.jsp";
		}	
	}
	
	@RequestMapping(value = "/login.do", method=RequestMethod.GET)
	public String loginView(UserVO vo) {
		System.out.println("로그인 화면으로 이동"); 
		vo.setId("test");
		vo.setPassword("test123");
		return "login.jsp";
	}
}
