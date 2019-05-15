package com.sgsoftware.javademo;

public class OverLoading_Example
{  
	int Fobj;
	public int addition(int a, int b)
	{
		return a+b;
	}
	public float addition(float c, float d)
	{
		return c+d;
	}
	public static void main(String[] args) 
	{
		OverLoading_Example OE = new OverLoading_Example();
		OverLoading_Example OE1 = new OverLoading_Example();
		/*OE.addition(10, 5);
		OE.addition(20.5f, -17.5f);
		System.out.println(OE.addition(10, 5));
		System.out.println(OE.addition(20.5f, -17.5f));*/
		OE.Fobj=1;
		System.out.println(OE.Fobj);
		System.out.println(OE1.Fobj);
		
	}

}
