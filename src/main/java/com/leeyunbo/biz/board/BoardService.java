package com.leeyunbo.biz.board;

/*
 * 작성자 : 이윤복
 * 작성일 : 4/19 
 * 목적 : 게시판 Service 인터페이스
 */

import java.util.List;

import com.leeyunbo.biz.board.BoardVO;

public interface BoardService {

	//CRUD 메소드 구현 
	//글 등록 
	void insertBoard(BoardVO vo);

	//글 수정 
	void updateBoard(BoardVO vo);

	//글 삭제 
	void deleteBoard(BoardVO vo);

	//글 상세 조회 
	BoardVO getBoard(BoardVO vo);

	//글 목록 조회 
	List<BoardVO> getBoardList();

}