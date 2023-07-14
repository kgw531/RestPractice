package com.momo.reply;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.momo.mapper.ReplyMapper;
import com.momo.vo.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyTest {
	@Autowired
	ReplyMapper mapper;
	
	@Test
	public void listTest() {
		List<ReplyVO> list = mapper.getList(136);
		log.info(list);
	}
	
	@Test
	public void insertTest() {
		ReplyVO vo = new ReplyVO();
		vo.setBno(136);
		vo.setReply("하이");
		vo.setReplyer("작성자");
		int res = mapper.insert(vo);
		log.info(res);
		
		
	}
	
	@Test
	public void deleteTest() {
		
		int res = mapper.delete(183);
		log.info(res);
		
		
	}
	
	@Test
	public void updateTest() {
		ReplyVO vo = new ReplyVO();
		vo.setRno(182);
		vo.setReply("수정");
		int res = mapper.update(vo);
		log.info(res);
		
		
	}
}
