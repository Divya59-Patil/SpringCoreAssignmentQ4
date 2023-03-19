package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("collegeBean")
//use @Bean in Config class

@Component
public class College {
	
   @Value("${college.collegeName}")
	private String collegeName;
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	

//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}

	/*
	 * public College(Principal principal) { 
	 * this.principal = principal; 
	 * }
	 */
	
//	public void setPrincipal(Principal principal) {
//		System.out.println("Using setPrincipal method");
//		this.principal = principal;
//	}
	
	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println(collegeName);
		System.out.println("testing this method");
	}
}
