package com.leeyunbo.biz.board.impl;

/*
 * 작성자 : 이윤복
 * 작성일 : 4/19 
 * 목적 : 게시판 Service 클래스
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.leeyunbo.biz.board.BoardService;
import com.leeyunbo.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired 
	private BoardDAO boardDAO;
	
	@Override
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
		
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
		
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList() {
		return boardDAO.getBoardList();
	}

}
