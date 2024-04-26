package com.green.evalBbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.green.evalBbs.dto.EvalBbsDto;

import com.green.evalBbs.dto.EvalBbsDto;

@Mapper
public interface IEvalBbsDao {
	public List<EvalBbsDto> getList();
<<<<<<< HEAD
	public EvalBbsDto getDto(@Param("title") String title);
	public void write(@Param("dto") EvalBbsDto dto);
	
=======
>>>>>>> 63199a069a013e52a6a706871cc9578d706af47d
}
