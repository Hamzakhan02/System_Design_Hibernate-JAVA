package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class EmployeeUpdate {
	
	public static void main(String[] args) {
//		Employee employee=new Employee();
		
		EmployeeService employeeService=new EmployeeService();
		
		Employee e1= employeeService.updateEmployee(3,"hamza@hahk");
		
		System.out.println(e1.getEmail());
		
		
		
		
		
	}

}
