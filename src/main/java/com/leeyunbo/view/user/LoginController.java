package com.leeyunbo.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leeyunbo.biz.user.UserVO;
import com.leeyunbo.biz.user.impl.UserDAO;

@Controller
public class LoginController{

	@RequestMapping("/login.do")
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
}
