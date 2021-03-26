package com.project.wellness.program.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.wellness.program.dao.ProgramDao;
import com.project.wellness.program.vo.ProgramVO;

@Service
public class ProgramServiceImp implements ProgramService {

	   @Autowired
	   ProgramDao programDao;
	   
	   @Override
	   public List<ProgramVO> selectProgram() throws Exception {
		   
	      List<ProgramVO> list = programDao.selectProgram();
	      return list;
	   }
}
