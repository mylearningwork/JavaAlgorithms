package com.sgsoftware.javademo;

public class ObjectCreation {

	String FirstName;
	String LastName;
	int Age;
	String City;
	
	public static void main(String args[])
	{
		ObjectCreation Sachin = new ObjectCreation();
		Sachin.FirstName="Sachin";
		Sachin.LastName="Tendulkar";
		Sachin.Age=45;
		Sachin.City="Bangalore";
		
		System.out.println("Sachin First name is :"+Sachin.FirstName);
		System.out.println("Sachin First name is :"+Sachin.LastName);
		System.out.println("Sachin First name is :"+Sachin.Age);
		System.out.println("Sachin First name is :"+Sachin.City);
		
		
	}
}
