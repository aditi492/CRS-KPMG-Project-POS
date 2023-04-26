package com.kpmg.service;

public class EmployeeService {
	
	//All the service must be declared
	
		public void createEmployee() {
			System.out.println("Employee is created");
		}
		
		public void deleteEmployee(int empId) {
			System.out.println("Employee deleted here by id :" + empId);
		}
		
		public void updateEmployee() {
			System.out.println("Employee updated");
		}
		
		public void listEmployee() {
			System.out.println("Employee list");
		}

}
