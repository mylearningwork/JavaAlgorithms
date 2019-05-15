package com.sgsoftware.javademo;

class ReadEltsFromArrayRevorder
{
	ReadEltsFromArrayRevorder(int a[])
	{
		
		System.out.println("Elts in reverse order");
		for (int i = a.length-1; i >=0;i--) 
		{
			System.out.println(" "+a[i]);
		}
	}
}

public class ReadEltsFromArrayRevorderUsingCons 
{

	public static void main(String[] args)
	{
		int a[]={2,6,5,4};
		ReadEltsFromArrayRevorder REadEltsRev = new ReadEltsFromArrayRevorder(a);
	}

}
