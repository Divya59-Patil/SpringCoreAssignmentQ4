package com.seleniumexpress.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//because I remove component annotation in college class 
@ComponentScan(basePackages="com.seleniumexpress.college") 
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

	/*
	 * @Bean 
	 * public Teacher mathTeacherBean() { 
	 *   return new MathTeacher(); 
	 * }
	 * 
	 * @Bean 
	 * public Principal principalBean() {
	 *   return new Principal(); 
	 * }
	 * 
	 * //for constructor
	 * 
	 * @Bean 
	 * public College collegeBean() { 
	 * College college = new College(principalBean()); 
	 * return college; 
	 * }
	 * 
	 * 
	 * //using setter
	 * 
	 * @Bean 
	 * public College collegeBean() { 
	 * College college = new College();
	 * college.setPrincipal(principalBean()); 
	 * college.setTeacher(mathTeacherBean());
	 * return college; 
	 * }
	 */
}
