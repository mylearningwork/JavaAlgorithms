package com.sgsoftware.javademo;



public class EltsReverse2D

{
	public static void main(String[] args) 
	{
	int a[][]= {{3,5},{6,7}};
	
	for(int i=0;i<a.length;i++)
	{
		for (int j = 0; j < a[i].length; j++)
		{
			System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
	
	System.out.println("The resultant matrix is :");
	for(int i=a.length-1;i>=0;i--)
	{
		for (int j = a[i].length-1; j >=0; j--)
		{
			System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
	
	}

}
