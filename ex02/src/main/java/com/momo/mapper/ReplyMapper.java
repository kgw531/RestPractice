package com.momo.mapper;

import java.util.List;

import com.momo.vo.ReplyVO;

public interface ReplyMapper {
	
	List<ReplyVO> getList(int bno);
	
	int insert(ReplyVO vo);
	
	int delete(int rno);
	
	int update(ReplyVO vo);
}
