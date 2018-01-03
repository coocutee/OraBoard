package com.coo.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coo.dao.BoardDAO;
import com.coo.domain.BoardVO;
import com.coo.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class BoardTest {
	
	@Inject
	BoardService service;
	
	@Inject
	BoardDAO dao;
	
	
	@Test
	public void create()throws Exception{
		BoardVO vo = new BoardVO();
		vo.setContent("�����̴�");
		vo.setNick("��Ű");
		vo.setTitle("����");
		vo.setPw("���");
		
		service.register(vo);
		//dao.create(vo);
	}

}
