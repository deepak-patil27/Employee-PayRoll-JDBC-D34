package com.bridgelab;

import java.sql.Date;
import java.time.LocalDate;

public class EmployeePayrollData {
	
	private int id;
    private String name;
    private String gender;
    private double salary;
    private Date start_date;

    public EmployeePayrollData(int id, String name, String gender, double salary, Date start_date) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.start_date = start_date;
    }

    public EmployeePayrollData(int employeeId, String name2, double salary2, LocalDate startDate) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", start_date=" + start_date +
                '}';
    }

}
