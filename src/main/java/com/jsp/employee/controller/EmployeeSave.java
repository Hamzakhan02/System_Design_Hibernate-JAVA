package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class EmployeeSave {
	
	public static void main(String[] args) {
		
		
		EmployeeService employeeService=new EmployeeService();
		Employee employee=new Employee();
//		 employee.setId(1);
		 employee.setEmail("Ayesha@gmail");
    	 employee.setName("Ayesha");
    	 employee.setCno(84989852);
    	
    	 
		employeeService.saveEmployee(employee);
		
		
	}

}
