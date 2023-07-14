package com.momo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.momo.service.ReplyService;
import com.momo.vo.ReplyVO;

import lombok.extern.log4j.Log4j;

@RestController
@Log4j
public class ReplyController {
	@Autowired
	ReplyService replyService;
	
	@GetMapping("/reply/list/{bno}")
	public Map<String,Object> getList( @PathVariable("bno") int bno){
		Map<String,Object> map = new HashMap<String,Object>();
		
		List<ReplyVO> list = replyService.getList(bno);
		
		map.put("list", list);
		
		return map;
		
	}
	
	
	
	
	
	
	
}
