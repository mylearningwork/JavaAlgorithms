package com.sgsoftware.javademo;

public class UniversityDetails 
{

	String UniversityName;
	String UniversityAddress;
	String CoursesOffering;
	String CollegeType;
	
	public static void main(String[] args)
	
	{
		UniversityDetails University = new UniversityDetails();
		
		University.UniversityName="Venkateswara";
		University.UniversityAddress="Tirupati";
		University.CoursesOffering="ECE, CSE, IT";
		University.CollegeType="Engineering";
		
		System.out.println("University Name : "+University.UniversityName);
		System.out.println("University Address : "+University.UniversityAddress);
		System.out.println("Courses offering : "+University.CoursesOffering);
		System.out.println("College Type : "+University.CollegeType);
		
	}

}
