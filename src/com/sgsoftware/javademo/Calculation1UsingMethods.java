
//working with methods, but here drawback is that we are hard coding the values
package com.sgsoftware.javademo;

class Calculation1
{
	void addition()
	{
		int x,y,res;
		x=5;
		y=10;
		res=x+y;
		System.out.println("The addition value is :"+res);
	}
	void mult()
	{
		int x,y,res;
		x=20;
		y=3;
		res=x*y;
		System.out.println("The multiplication value is :"+res);
	}
}
public class Calculation1UsingMethods 
{

	public static void main(String[] args) 
	{
		Calculation1 Cal = new Calculation1();
		Cal.addition();
		Cal.mult();
	}

}
