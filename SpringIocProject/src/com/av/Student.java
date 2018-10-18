package com.av;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.javabykiran.Address;

public class Student {
	@Value("Avanti")
	String  name;
    @Autowired(required=true)
	@Qualifier(value="address")
	Address address;
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
}
