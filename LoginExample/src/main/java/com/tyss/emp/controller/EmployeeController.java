package com.tyss.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
//	@Autowired
//	@
//	private EmployeeDao dao;
	
	@GetMapping("/search")
	public String searchEmployee(ModelMap map) {
		
		return "seachForm";
	}

}
