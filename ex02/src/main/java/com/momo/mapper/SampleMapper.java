package com.momo.mapper;

import org.apache.ibatis.annotations.Select;

public interface SampleMapper {
	String getTime();
	
	@Select("select sysdate from dual")
	String getTime1();
}
