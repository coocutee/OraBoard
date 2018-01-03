package com.coo.service;

import java.util.List;

import com.coo.domain.BoardVO;
import com.coo.domain.Criteria;

public interface BoardService {

	public void register(BoardVO vo)throws Exception;
	public BoardVO view (Integer bno)throws Exception;
	public void modify (BoardVO vo)throws Exception;
	public void remove (Integer bno)throws Exception;
	public List<BoardVO> listAll()throws Exception;
	public List<BoardVO> listCriteria(Criteria cri)throws Exception;
	public int countPaing(Criteria cri)throws Exception;
}
