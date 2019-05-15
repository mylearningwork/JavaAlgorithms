package com.sgsoftware.javademo;

public class SubstractionTwoMatrix2D {

	public static void main(String[] args) 
	{

		int a[][]= {{6,7},{3,4}};
		int b[][]= {{2,2},{3,2}};
		int c[][]= new int[2][2];
		int i,j;
		System.out.println("The first matrix value is");
		for (i=0;i<a.length;i++)
		{
			
			for (j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("The second matrix value is");
		for (i=0;i<b.length;i++)
		{
			for (j=0;j<b[i].length;j++)
			{
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
		System.out.println("The addition matrix value is");
		for (i=0;i<c.length;i++)
		{
			for (j=0; j<c[i].length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
		//want to know how to write in for each loop
		/*for(int d:c)
		{
			System.out.print(" "+d);
			
		}*/

	
		
	}

}
