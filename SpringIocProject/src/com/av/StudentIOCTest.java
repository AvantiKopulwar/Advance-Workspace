package com.av;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentIOCTest {

	public static void main(String[] args) {
    ApplicationContext act= new ClassPathXmlApplicationContext("spiocstudent.xml");
    Student stud = (Student)act.getBean("student");
    System.out.println(stud);
	}

}
