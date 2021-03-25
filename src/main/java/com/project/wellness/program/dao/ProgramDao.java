package com.project.wellness.program.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.wellness.program.vo.ProgramVO;

@Repository
public class ProgramDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public ProgramDao() {}

	public List<ProgramVO> selectProgram() throws Exception {

		List<ProgramVO> list = sqlSession.selectList("Program.selectProgram");
		return list;
	}
}
