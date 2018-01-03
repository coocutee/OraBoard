package com.coo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.coo.dao.BoardDAO;
import com.coo.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	@Override
	public void register(BoardVO vo) throws Exception {

		dao.create(vo);
	}

	@Override
	public BoardVO view(Integer bno) throws Exception {
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.update(vo);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}

}
