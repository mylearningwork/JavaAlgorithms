package com.sgsoftware.javademo;

class ReadEltsFrom2DArrayRevorder
{
	ReadEltsFrom2DArrayRevorder(int a[][])
	{
		System.out.println("Reading Elts From 2D Array");
		for (int i = 0; i<a.length;i++) 
		{
			for (int j = 0; j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("_______________________________________");
		System.out.println("Elts From 2D Array in reverse order");
		
		for (int i = a.length-1; i >=0;i--) 
		{
			for (int j = a[i].length-1; j >=0; j--)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}


public class ReadEltsFrom2DArrayRevorderUsingCons 
{

	public static void main(String[] args)
	{
		int a[][]={{2,6},{5,4}};
		ReadEltsFrom2DArrayRevorder REadEltsRev2DA = new ReadEltsFrom2DArrayRevorder(a);
	}

}
