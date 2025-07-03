package com.ujjwal.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ujjwal.sbean.Student;

public class StudentMarksUser {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ujjwal/cfg/ApplicationContext.xml");
		Student student = context.getBean("cal", Student.class);
		System.out.println(student);

	}

}
