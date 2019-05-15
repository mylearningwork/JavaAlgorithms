package com.sgsoftware.javademo;

class collage

{
	String CollegeName;
	String CollegeAddress;
	String NoOfDepartments;
	int NoOfStundents;
	int NoOfFaculty;
	
	collage()
	{
	CollegeName	= "NITS";
	CollegeAddress="Bangalore";
	NoOfDepartments="6 Depts";
	NoOfFaculty=50;
	NoOfStundents=500;
	
	System.out.println("CollegeName :" +CollegeName);
	System.out.println("CollegeAddress : "+CollegeAddress);
	System.out.println("NoOfDepartments : "+NoOfDepartments);
	System.out.println("NoOfFaculty : "+NoOfFaculty);
	System.out.println("NoOfStundents : "+NoOfStundents);
	System.out.println("---------------------------------------------------------");
	
	}
}

class Student

{
	String StrudentName;
	String StrudentAddress;
	String BrachName;
	String Year;
	int age;
	String Percentage;
	
	Student()
	{
	StrudentName	= "Raj";
	StrudentAddress="Bangalore";
	BrachName="CSE";
	Year="3rd Year";
	age=21;
	Percentage="75.52%";
	
	System.out.println("StrudentName :" +StrudentName);
	System.out.println("StrudentAddress : "+StrudentAddress);
	System.out.println("BrachName : "+BrachName);
	System.out.println("Year : "+Year);
	System.out.println("age : "+age);
	System.out.println("Percentage : "+Percentage);
	System.out.println("---------------------------------------------------------");
	
	}
}

class Library
{
	String LibrarianName;
	String NoOfBooksAvailable;
	int NoOfDeptsBooksAvailable;
	String OpeningTime;
	String ClosingTime;
	
	Library()
	{
		LibrarianName="Narasimha";
		NoOfBooksAvailable="600 Books";
		NoOfDeptsBooksAvailable=6;
		OpeningTime="9.30 AM";
		ClosingTime="5.00 PM";
		
		System.out.println("LibrarianName :" +LibrarianName);
		System.out.println("NoOfBooksAvailable : "+NoOfBooksAvailable);
		System.out.println("NoOfDeptsBooksAvailable : "+NoOfDeptsBooksAvailable);
		System.out.println("OpeningTime : "+OpeningTime);
		System.out.println("ClosingTime : "+ClosingTime);
		
		System.out.println("---------------------------------------------------------");
	}
	
}


class Sports
{
	String SportName;
	int NoOfPlayers;
	String MatchDuration;
	int HowManyTeamsParticipate;
	
	Sports()
	{
		SportName="Cricket";
		NoOfPlayers=22;
		MatchDuration="7 Hours";
		HowManyTeamsParticipate=2;
		
		System.out.println("SportName :" +SportName);
		System.out.println("NoOfPlayers : "+NoOfPlayers);
		System.out.println("MatchDuration : "+MatchDuration);
		System.out.println("HowManyTeamsParticipate : "+HowManyTeamsParticipate);
	}
	
}
public class CollegeDetails
{

	public static void main(String[] args) 
	{
		
		collage College = new collage();
		Student student = new Student();
		Library lib= new Library();
		Sports sport= new Sports();
	}

}
