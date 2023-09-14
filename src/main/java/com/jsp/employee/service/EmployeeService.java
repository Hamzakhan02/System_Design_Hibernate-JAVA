package com.jsp.employee.service;

import java.util.List;

import com.jsp.employee.controller.EmployeeUpdate;
import com.jsp.employee.dao.EmployeeDao;

import com.jsp.employee.dto.Employee;

public class EmployeeService {
   
	EmployeeDao employeeDao=new EmployeeDao();
	Employee employee=new Employee();
	EmployeeUpdate employeeUpdate=new EmployeeUpdate();
	
	
	 public Employee saveEmployee(Employee employee) {
		 
		 return employeeDao.saveEmployee(employee);
		 
	 }
	 
	 
	 public Employee getEmployee(int id) {
		 return employeeDao.getEmployee(id);
	 }
	 
	 public boolean deleteEmployee(int id) {
		  boolean s=   employeeDao.deleteEmployee(id);
		  return s;
	 }
	 
	 public Employee updateEmployee(int id,String email) {
		 Employee employee=employeeDao.getEmployee(id);
		 employee.setEmail(email);
		 return employeeDao.updateEmployee(employee);
		  
	 }
	 
	 public  List getAll() {
		  return employeeDao.getAll();
	 }
	 
	 
}
