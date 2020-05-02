package com.leeyunbo.biz.user;

/*
 * 작성자 : 이윤복
 * 작성일 : 4/19 
 * 목적 : 회원 Service 인터페이스
 */

public interface UserService {

	//CRUD 메서드 구현 
	//회원 정보 검색
	UserVO getUser(UserVO vo);

}