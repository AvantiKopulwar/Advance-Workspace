package com.javabykiran;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AOP {
	
	@Before("execution(* com.javabykiran.XYZ.m1())")
	void logging() {
		System.out.println("1111");
	}

	@After("execution(* com.javabykiran.XYZ.m2())")
	void logging2() {
		System.out.println("2222");
	}
}
