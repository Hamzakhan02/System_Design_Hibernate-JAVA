package com.jsp.employee.controller;

import java.util.List;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class EmployeeGetAll {
	
	public static void main(String[] args) {
		
		EmployeeService employeeService=new EmployeeService();
		List<Employee> employee=employeeService.getAll();
           
         for(Employee f: employee) {
  			System.out.println("======================");
  			System.out.println(f.getId());
  			System.out.println(f.getName());
  			System.out.println(f.getCno());
  			System.out.println(f.getEmail());
  			System.out.println("=======================");
         }
         
         
         

		
		
	}

}
