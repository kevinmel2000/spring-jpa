package com.mitrais.jpa;

import java.util.AbstractMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository emp;
	
	@RequestMapping(value="employees/{empId}/score", method = RequestMethod.GET)
	AbstractMap.SimpleEntry<String, Double> getEmployeeByFilter(@PathVariable long empId){
		//Employee employee = verifyEmployee(empId);
		double result = Math.random()*100;
		if (emp.findOne(empId) == null){
			throw new EmployeeNotFoundException();
		}else{
			return new AbstractMap.SimpleEntry<String, Double>("score",result);
		}
		
	}
	
}
