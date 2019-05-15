package com.sgsoftware.javademo;

public class EmployeeDetails {
	
	String EmployeeName;
	String DeptName;
	int EmpSalary;
	int EmpBonus;

	public static void main(String[] args) 
	{
		EmployeeDetails Emp= new EmployeeDetails();
		
		Emp.EmployeeName="Kumar";
		Emp.DeptName="Accounts";
		Emp.EmpSalary=40000;
		Emp.EmpBonus=10000;
		
		System.out.println("Employee Name : "+Emp.EmployeeName);
		System.out.println("Employee Dept : "+Emp.DeptName);
		System.out.println("Employee salary : "+Emp.EmpSalary);
		System.out.println("Employee Bonus : "+Emp.EmpBonus);

	}

}
