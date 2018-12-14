package com.example.demo;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudResource {
	@RequestMapping("st")
	public List<Stud> getStud()
	{
		List<Stud> st=new ArrayList<>();
		
		Stud s1=new Stud();
		s1.setName("varun");
		s1.setRno(51);
		
		Stud s2=new Stud();
		s2.setName("karan");
		s2.setRno(68);
		
		st.add(s1);
		st.add(s2);
		
		return st;
	}

}
