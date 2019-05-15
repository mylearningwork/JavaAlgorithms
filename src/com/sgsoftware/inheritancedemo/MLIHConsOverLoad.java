package com.sgsoftware.inheritancedemo;

class ParentC
{
	String FirstName;
	String LastName;
	int age;
	String Profession;
	ParentC(String FN, String LN)
	{
		FirstName=FN;
		LastName=LN;

	//System.out.println("First name is :"+FirstName+ " , Last name is : "+LastName);
	
	}
	ParentC(int ag, String PFession)
	{
		age=ag;
		Profession=PFession;

	//System.out.println(" age is : "+age+" , Profession is : "+Profession);
	
	}
	ParentC(String FN, String LN,int age,String PFession)
	{
		System.out.println("First name is :"+FN+ " , Last name is : "+LN+" , age is : "+age+" , Profession is : "+PFession);
	}
	/*void displayDetails(String FirstName, String LastName, int age , String Profession)
	{
		System.out.println("First name is :"+FirstName+ " , Last name is : "+LastName+" , age is : "+age+" , Profession is : "+Profession);
	}*/
}
class child1 extends ParentC
{
    
	child1(String FN, String LN,int age,String PFession) 
	{
		
		super(FN, LN,age,PFession);
		//System.out.println("age is "+age+" , profession is "+PFession);
		
	}
	child1(int age, String PFession) 
	{
		super(age,PFession);
		//System.out.println("age is "+age+" , profession is "+PFession);
	}
	
	
}
class child2 extends child1
{
	
	child2(String FN, String LN,int age, String PFession) 
	{
		super(FN, LN,age,PFession);
		//System.out.println("age is "+age+" , profession is "+PFession);
		
	}
	child2(int age, String PFession) {
		super(age, PFession);
		//System.out.println("age is "+age+" , profession is "+PFession);
		// TODO Auto-generated constructor stub
	}

	void child2subclass()
	{
		//System.out.println("this is child2subclass");
	}
}
public class MLIHConsOverLoad 
{

	public static void main(String[] args) 
	{
		child2 ch2 = new child2("ab", "cd", 18, "Student");
		//child2 ch3 = new child2(18, "Student");
		ch2.child2subclass();
		//ch2.displayDetails("raj", "sek", 18, "Student");
		/*ch3.child2subclass();
		ch3.displayDetails();*/
	}

}
