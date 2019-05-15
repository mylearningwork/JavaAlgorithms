package com.sgsoftware.inheritancedemo;

class CompanyDetails
{
	String CompanyName="IBM";
	CompanyDetails()
	{
		System.out.println("The company name "+CompanyName);
	}
}
class Employee extends CompanyDetails
{
	String EmpName;
	int EmpId;
	Employee(String EmpName, int EmpId)
	{
		this.EmpName=EmpName;
		this.EmpId=EmpId;
		System.out.println("Emp Name is "+EmpName+" , Emp id is "+EmpId);
		
	}
	/*void displayEmpDetails()
	{
		System.out.println("Emp Name is "+EmpName+" , Emp id is "+EmpId);
	}*/
}
class EmployeeDetails extends Employee
{
    String EmpDept;
    int EmpAge;
    int EmpSal;
	EmployeeDetails(String EmpName, int EmpId, String EmpDept, int EAge, int ESal) 
	{
		super(EmpName, EmpId);
		this.EmpDept=EmpDept;
		EmpAge=EAge;
		EmpSal=ESal;
		
	}
	void displayAllDetails()
	{
		System.out.println("Emp dept is : "+EmpDept+" , Emp age is : "+EmpAge+" , Emp sal is "+EmpSal);
	}
	
}
public class MLIH_Immediate_SubClass_ParamCons 
{

	public static void main(String[] args)
	{
		EmployeeDetails ED = new EmployeeDetails("Raj", 03413, "Tester", 28, 40000);
		ED.displayAllDetails();
		//ED.displayEmpDetails();
	}

}
