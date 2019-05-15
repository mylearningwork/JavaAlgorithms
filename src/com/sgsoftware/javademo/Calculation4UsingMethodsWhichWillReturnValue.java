package com.sgsoftware.javademo;
class Calculation4
{
	int Addition(int x, int y)
	{
		int res=x+y;
		return res;
	}
	int Sub(int x, int y)
	{
		return(x-y);
	}
	void mult(int x, int y)
	{
		int res=x*y;
		System.out.println("The mult value is : "+res);
	}
}
public class Calculation4UsingMethodsWhichWillReturnValue 
{

	public static void main(String[] args) 
	{
		Calculation4 cal = new Calculation4();
		int a=cal.Addition(7, 5);
		System.out.println("The addition value is : "+a);
		cal.mult(12, 5);
		int b=cal.Sub(3, 2);
		System.out.println("The Substraction value is : "+b);
	}

}
