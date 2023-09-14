package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeService;

public class EmployeeDelete {
	public static void main(String[] args) {
		
	 EmployeeService employeeService=new EmployeeService();
	 
	 boolean s= employeeService.deleteEmployee(2);
	 System.out.println(s);
		
	}

}
