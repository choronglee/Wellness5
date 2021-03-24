package com.project.wellness.program.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.wellness.program.dao.ProgramDao;
import com.project.wellness.program.vo.ProgramVO;

@Service
public class ProgramServiceImp implements ProgramService {

	   @Autowired
	   ProgramDao memberDao;
	   
	   
	   public List<ProgramVO> selectProgramAll() throws Exception{
	      List<ProgramVO> list = memberDao.selectProgramAll();
	      return list;
	   }

}
