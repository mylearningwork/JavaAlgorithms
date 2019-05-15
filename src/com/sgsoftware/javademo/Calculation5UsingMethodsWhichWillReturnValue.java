package com.sgsoftware.javademo;

class Calculation5
{
	int addition(int x, int y)
	{
		int res=x+y;
		return res;
	}
	int sub(int x, int y)
	{
		return(x-y);
	}
	void mult()
	{
		int a=addition(5,4);
		int b=sub(8, 5);
		int res=a*b;
		System.out.println("The multiplication value is : "+res);
	}
}

public class Calculation5UsingMethodsWhichWillReturnValue 
{

	public static void main(String[] args) 
	{
		Calculation5 cal = new Calculation5();
		int a=cal.addition(10,12);
		System.out.println("The addition value is : "+a);
		int b=cal.sub(5, 3);
		System.out.println("The sub value is : "+b);
		cal.mult();
	}

}
