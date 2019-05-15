//here we are avoiding hard code values, but if we want to run this program we need to create object for the constructor. let assume there are 100 constructors in program, so for 100 constructors we need to create 100 objects. so it will occupy huge memory. so this memory issue. to avoid this we will use methods passing arguments. 

package com.sgsoftware.javademo;

class Calculation2
{
	int x,y;
	public Calculation2(int x, int y)
	{
		this.x=x;
		this.y=y;
		
	}
	void addition()
	{
		int res;
		
		res=x+y;
		System.out.println("The addition value is :"+res);
	}
	void mult()
	{
		int res;
		
		res=x*y;
		System.out.println("The multiplication value is :"+res);
	}
}
public class Calculation2UsingMethods
{

	public static void main(String[] args) 
	{
		Calculation2 cal2 = new Calculation2(4, 5);
		cal2.addition();
		cal2.mult();
	}

}
