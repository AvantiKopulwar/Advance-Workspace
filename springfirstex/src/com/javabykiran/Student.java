package com.javabykiran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Student {
@Value("${unameVal}")
String  uname;

@Autowired(required=false)
@Qualifier(value="address")
Address address;
@Override
public String toString() {
	return "Student [uname=" + uname + ", address=" + address + "]";
}
}
