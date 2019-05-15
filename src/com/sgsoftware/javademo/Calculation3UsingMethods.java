package com.sgsoftware.javademo;

class Calculation3
{
	void addition(int x, int y)
	{
		int res=x+y;
		System.out.println("The addition value is :"+res);
	}
	void Mult(int x, int y)
	{
		int res=x*y;
		System.out.println("The mult value is :"+res);
	}
}
public class Calculation3UsingMethods
{

	public static void main(String[] args)
	{
		Calculation3 Cal = new Calculation3();
		Cal.addition(5,6);
		Cal.Mult(4, 5);
		
		Cal.addition(8, 8);
		Cal.Mult(2, 3);
	}

}
