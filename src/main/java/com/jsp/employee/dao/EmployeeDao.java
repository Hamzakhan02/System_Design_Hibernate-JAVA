package com.jsp.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.employee.dto.Employee;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hamza");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();
   
	Employee employee = new Employee();

	public Employee saveEmployee(Employee employee) {

		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();

		return employee;

	}

	public Employee getEmployee(int id) {

		Employee employee = entityManager.find(Employee.class, id);
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getCno());
		return employee;

	}

	public boolean deleteEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, id);

		if (employee != null) {

			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			return true;

		} else {
			System.out.println("id not found ");
			return false;

		}

	}

	public Employee updateEmployee(Employee employee) {
//		 Employee employee= entityManager.find(Employee.class,id);

	    if(employee!=null) {
		

			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
			
	    }
	    return employee;

	}
	
	public  List getAll() {
		
		String sql="SELECT e FROM Employee e";
		
		Query query = entityManager.createQuery(sql);
		
		List<Employee> employees= query.getResultList();
			
		return employees;
			
			
			
			
		}
		
		
	}


