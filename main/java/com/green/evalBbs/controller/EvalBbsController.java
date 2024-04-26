package com.green.evalBbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
=======
>>>>>>> 63199a069a013e52a6a706871cc9578d706af47d
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.green.evalBbs.dao.IEvalBbsDao;
<<<<<<< HEAD
import com.green.evalBbs.dto.EvalBbsDto;
=======
>>>>>>> 63199a069a013e52a6a706871cc9578d706af47d

@Controller
public class EvalBbsController {
	
	@Autowired
	private IEvalBbsDao dao;
	
	@RequestMapping("/")
	public String root() {
		return "index";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("list",dao.getList() );
		
		return "list";
	}
	
<<<<<<< HEAD
	@GetMapping("/detail")
	public String detail(@RequestParam("title") String title, Model model) {
		model.addAttribute("dto",dao.getDto(title));
		
		return "detail";
		
	}
	@GetMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	@PostMapping("/write")
	public String write(EvalBbsDto dto) {
		dao.write(dto);
		return "redirect:list";
	}
=======

>>>>>>> 63199a069a013e52a6a706871cc9578d706af47d
}
