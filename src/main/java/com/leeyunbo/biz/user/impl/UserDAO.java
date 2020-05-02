package com.leeyunbo.biz.user.impl;

/*
 * 작성자 : 이윤복
 * 작성일 : 4/22 
 * 목적 : 회원 DAO 클래스
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.leeyunbo.biz.common.JDBCUtil;
import com.leeyunbo.biz.user.UserService;
import com.leeyunbo.biz.user.UserVO;

@Repository("userDAO")
public class UserDAO implements UserService {
	//JDBC 관련 변수
	private Connection conn = null; 
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	//SQL 명령어 
	private final String USER_GET = "select * from users where id=? and password=?"; 
	
	//CRUD 메서드 구현 
	//회원 정보 검색
	@Override
	public UserVO getUser(UserVO vo) {
		UserVO user = null;
		try {
			System.out.println("===> JDBC로 getUser() 기능 처리"); 
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery(); 
			if(rs.next()) {
				user = new UserVO(); 
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return user;
	}
	
}
