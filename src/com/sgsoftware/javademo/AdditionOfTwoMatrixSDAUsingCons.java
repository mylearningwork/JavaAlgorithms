
package com.sgsoftware.javademo;

class AdditionOfTwoMatrixSDA
{
	AdditionOfTwoMatrixSDA(int a[],int b[],int c[])
	{
		
		System.out.println("Reading elts from first SDA matrix");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(" "+a[i]);
		}
		System.out.println("Reading elts from second SDA matrix");
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(" "+b[i]);
		}
		System.out.println("The result from addition of two mtrix");
		for (int i = 0; i < c.length; i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(" "+c[i]);
		}
	}
}

public class AdditionOfTwoMatrixSDAUsingCons {

	public static void main(String[] args) 
	{
		int d[]= {2,3,5,4};
		int e[]= {5,7,1,4};
		int f[]= new int[4];
		AdditionOfTwoMatrixSDA ADDTwoSDA = new AdditionOfTwoMatrixSDA(d,e,f);
	}

}
