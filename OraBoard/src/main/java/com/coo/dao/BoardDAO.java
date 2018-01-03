package com.coo.dao;

import java.util.List;

import com.coo.domain.BoardVO;
import com.coo.domain.Criteria;

public interface BoardDAO {
	
	public void create(BoardVO vo) throws Exception;
	public BoardVO read (Integer bno)throws Exception;
	public void update (BoardVO vo)throws Exception;
	public void delete (Integer bno)throws Exception;
	public List<BoardVO> listAll()throws Exception;
	public List<BoardVO> listPage(Integer page)throws Exception;
	public List<BoardVO> listCriteria(Criteria cri)throws Exception;
	public int countPaing(Criteria cri)throws Exception;

}
