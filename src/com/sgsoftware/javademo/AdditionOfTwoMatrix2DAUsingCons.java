package com.sgsoftware.javademo;

class AdditionOfTwoMatrix2DA
{
	AdditionOfTwoMatrix2DA(int a[][],int b[][],int c[][])
	{
		
		System.out.println("Reading elts from first 2DA matrix");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("Reading elts from second 2DA matrix");
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
		System.out.println("The result from addition of two mtrix");
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++) 
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
	}
}
public class AdditionOfTwoMatrix2DAUsingCons
{

	public static void main(String[] args)
	{

		int d[][]= {{2,3},{5,4}};
		int e[][]= {{5,7},{1,4}};
		int f[][]= new int[2][2];
		AdditionOfTwoMatrix2DA ADDTwo2DA = new AdditionOfTwoMatrix2DA(d,e,f);
	
	}

}
