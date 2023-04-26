package com.kpmg.client;

import com.kpmg.service.EmployeeService;

public class EmployeeClienApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService service = new EmployeeService();
		service.createEmployee();
		service.deleteEmployee(101);
		service.updateEmployee();
		service.listEmployee();

	}

}
