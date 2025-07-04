package com.ujjwal.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ujjwal.sbean.Students;

public class StudentMarksUser {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ujjwal/cfg/ApplicationContext.xml");
		Students student = context.getBean("cal", Students.class);
		System.out.println(student);

	}

}
