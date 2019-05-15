package com.sgsoftware.interfaceDemo;

interface abc
{
	void DisplayA();
	void DisplayB();
}

class test
{
	//System.out.println("The city nam eis bangalore");
	void displayCity()
	{
		System.out.println("The city nam eis bangalore");
	}
}
class xyz extends test implements abc
{
	int a,b;
	xyz(int A, int B)
	{
		a=A;
		b=B;
	}
	@Override
	public void DisplayA() 
	{
		System.out.println("The a value is : "+a);
	}
	@Override
	public void DisplayB()
	{
		System.out.println("The b value is : "+b);
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args)
	{
		xyz ID = new xyz(10, 5);
		ID.DisplayA();
		ID.DisplayB();
		ID.displayCity();
		
	}

}
