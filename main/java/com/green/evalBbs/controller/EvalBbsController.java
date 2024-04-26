package com.green.evalBbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.green.evalBbs.dao.IEvalBbsDao;
import com.green.evalBbs.dto.EvalBbsDto;

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
	@GetMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	@PostMapping("/write")
	public String write(EvalBbsDto dto) {
		dao.write(dto);
		return "redirect:list";
	}
}
