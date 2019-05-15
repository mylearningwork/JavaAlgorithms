package com.sgsoftware.inheritancedemo;

class SameMethodNameSuper
{
	/*void display(String city)
	{
		System.out.println("The city name is "+city);
	}*/
	void display(int a, int b)
	{
		int c =a+b;
		System.out.println(c);
	}
}
class SameMethodNameSub extends SameMethodNameSuper
{
	SameMethodNameSub(String place)
	{
		//super.display(place);
		super.display(10, 5);
	}
	/*void display(String state)
	{
		System.out.println("The state name is "+state);
	}*/
	void display(double c, double d)
	{
		double e=c+d;
	}
}
public class SameMethodNameIH 
{

	public static void main(String[] args) 
	{
		SameMethodNameSub SameMethod = new SameMethodNameSub("Bangalore");
		//SameMethod.display("Karnataka");
		SameMethod.display(20, 10);
		// TODO Auto-generated method stub

	}

}
