package com.project.wellness.program.service;

import java.util.List;

import com.project.wellness.program.vo.ProgramVO;

public interface ProgramService {

	public List<ProgramVO> selectProgram() throws Exception;
}
