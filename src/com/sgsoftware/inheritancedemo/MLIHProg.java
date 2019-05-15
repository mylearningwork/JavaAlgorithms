package com.sgsoftware.inheritancedemo;

class Animals
{
	
	Animals()
	{
		
		System.out.println("This is animals class");

	}
}
class Dogs extends Animals
{

	Dogs() 
	{
		System.out.println("This is dogs class");
	}
	
	
}
class puppys extends Dogs
{
  
	    puppys() 
	    {
	    	
	    	System.out.println("this is Puppy class");
	    }
	
}
public class MLIHProg 
{

	public static void main(String[] args) 
	{
		puppys Snoopy = new puppys();
		
	}

}
