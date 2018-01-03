package com.coo.web;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coo.dao.BoardDAO;
import com.coo.domain.BoardVO;
import com.coo.domain.Criteria;
import com.coo.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class BoardTest {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardTest.class);
	
	@Inject
	BoardService service;
	
	@Inject
	BoardDAO dao;
	
	
	@Test
	public void create()throws Exception{
		BoardVO vo = new BoardVO();
		vo.setContent("��");
		vo.setNick("��Ű");
		vo.setTitle("����");
		vo.setPw("���");
		
		service.register(vo);
		//dao.create(vo);
	}
	
	@Test
	public void listAll()throws Exception{
		System.out.println(service.listAll());
	}
	
	@Test
	public void read() throws Exception{
		System.out.println(dao.read(2));
		System.out.println(service.view(2));
	}
	
	
	@Test
	public void page()throws Exception{

		Criteria cri = new Criteria();
		cri.setPage(2);
		cri.setPerPageNum(10);
		
		System.out.println("��");
		
		List<BoardVO> list = dao.listCriteria(cri);
		
		for(BoardVO vo : list){
			logger.info(vo.getTitle());
			
		}
	}

}
