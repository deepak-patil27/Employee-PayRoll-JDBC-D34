package com.bridgelab;

public class EmployeePayrollMain {
	public static void main(String[] args) throws EmployeePayrollException {
        EmployeePayrollDBService employeePayrollService = new EmployeePayrollDBService();        
        employeePayrollService.retrieveData();
	}

}