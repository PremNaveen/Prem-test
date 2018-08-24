package com.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StudentController {
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String Student(){
		return "home.jsp";
	}
@RequestMapping("/addstudent")
public String Add(Student student)

{
	repo.save(student);
	return "home.jsp";
}
}
