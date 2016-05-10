package com.ssasystem.service;

import javax.xml.bind.JAXBElement;

import com.ssa.hraprotocol.EmployeeType;
import com.ssa.hraprotocol.ObjectFactory;

public class HRMService {
	
	public JAXBElement<String> addEmployee(EmployeeType employee) {
		System.out.println("Added employee:"+employee.getFname());
		ObjectFactory objectFactory = new ObjectFactory();
		JAXBElement<String> jaxbElement = objectFactory.createAddEmployeeResponse("EMP_1000");
		return jaxbElement;
	}

}
