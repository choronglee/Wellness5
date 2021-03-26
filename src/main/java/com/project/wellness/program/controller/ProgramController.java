package com.project.wellness.program.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.wellness.program.service.ProgramService;
import com.project.wellness.program.vo.ProgramVO;

@Controller
public class ProgramController {

	   @Autowired
	   ProgramService programService;
	   
	   @RequestMapping(value="mypage.do",method=RequestMethod.GET)
	   public String selectProgram(Model model) throws Exception {
	      
	      List<ProgramVO> list = programService.selectProgram();
	      model.addAttribute("ProgramList", list);
	      
	      return "mypage";
	   }
}
