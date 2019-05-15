package com.sgsoftware.inheritancedemo;

class SameVarSuperClass

{
	String city;
	void showcity()
	{
		System.out.println("the city name in super class "+city);
	}
}
class SameVarSubClass extends SameVarSuperClass
{
	String city;
	SameVarSubClass(String cityName)
	{
		super.city=cityName;
	}
	void displayCity()
	{
		System.out.println("the city name in sub class "+city);
	}
}
public class SameVarName {

	public static void main(String[] args) 
	{
		SameVarSubClass samevar = new SameVarSubClass("Blr");
		samevar.city="Hyd";
		samevar.showcity();
		samevar.displayCity();
	}

}
