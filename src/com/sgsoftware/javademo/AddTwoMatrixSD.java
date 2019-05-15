package com.sgsoftware.javademo;

public class AddTwoMatrixSD {

	public static void main(String[] args)
	{
		int a[]= {2,3,5,6};
		int b[]= {4,5,2,3};
		int c[]= new int[4];
		
		System.out.println("Elements of first array");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(" "+a[i]);
		}
		System.out.println("Elements of second array");
		for (int i = 0; i< b.length; i++)
		{
			System.out.println(" "+b[i]);
		}
		System.out.println("Elements of the Resultant array");
		for (int i = 0; i < c.length; i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(" "+c[i]);
		}
		System.out.println("Elements in the Reverse order of the Resultant array");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(" "+c[i]);
		}

	}

}
