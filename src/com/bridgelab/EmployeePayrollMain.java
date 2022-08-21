package com.bridgelab;

import java.sql.SQLException;

public class EmployeePayrollMain {
	public static void main(String[] args) throws EmployeePayrollException, SQLException {
		EmployeePayrollDBService employeePayrollService = new EmployeePayrollDBService();
		System.out.println("-----Rerieve Employee Data From Database-----");
		employeePayrollService.retrieveData();
		System.out.println("\n-----Updated Basic Pay For Employee-----");
		employeePayrollService.updateSalary("Terisa", 3000000);
		System.out.println("\n-----Particular Salary Data Range-----");
		EmployeePayrollDBService.retrieveAllDataUsingPreparedStatemnt();
		System.out.println("\n-----Database Function For analysis By Gender-----");
		employeePayrollService.getSumOfSalaryByMaleAndFemale();
		System.out.println("\n-----Add New Employee-----");
		employeePayrollService.addEmployee();
	}

}
