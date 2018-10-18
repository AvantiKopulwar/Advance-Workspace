package com.javabykiran;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
	Student student = (Student)context.getBean("stu");
	System.out.println(student);
	
	XYZ xy=(XYZ)context.getBean("xyz"); 
	xy.m1();
	xy.m2();
}
}
