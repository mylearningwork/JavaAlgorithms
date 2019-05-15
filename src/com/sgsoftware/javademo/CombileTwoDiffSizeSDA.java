package com.sgsoftware.javademo;

public class CombileTwoDiffSizeSDA {

	public static void main(String[] args) 
	{
		
		int a[]= {2,3,5,6,2,3};
		int b[]= {4,5,2,3,3,4,5};
		int c[]= new int[];
		
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
		
	}

}
