package com.leeyunbo.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * 작성자 : 이윤복
 * 작성일 : 4/22 
 * 목적 : 회원 Service 클래스
 */

import com.leeyunbo.biz.user.UserService;
import com.leeyunbo.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO; 
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}


}
