package com.sgsoftware.javademo;

public class AssignOddNums91To71ToSDAReadEltsReverseOrder
{

	public static void main(String[] args)
	{
		int l=0;
		int c=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		int a[]= new int[11];
		for (int i = c; i >= d; i--)
		{
			if (i%2==1) 
			{
				System.out.println(" "+i);
				a[l++]=i;  //assigning the elts to an single dimension array
			}
			
		}
		
		System.out.println("___________________________________________");
		System.out.println("Reading the Elts from array");
		
		for (int j = 0; j < a.length; j++)
		{
			System.out.println(" "+a[j]);
			
		}
		
		System.out.println("___________________________________________");
		System.out.println("Reading the Elts from array in reverse order");
		
		for (int j = a.length-1; j>=0; j--) 
		{
			System.out.println(" "+a[j]);
		}
	}

}
