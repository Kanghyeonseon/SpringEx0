package com.korea.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("Select sysdate From dual")
	public String getTime();
	public String getTime2();
}
