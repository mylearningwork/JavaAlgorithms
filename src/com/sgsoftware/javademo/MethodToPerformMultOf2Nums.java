package com.sgsoftware.javademo;

class MethodToPerformMultOf2Numbers
{
	void MethodToPerformMultOf2Nos(int a[][], int b[][], int c[][])
	{

		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("_________________________________________________");
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b[i].length; j++)
			{
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
		System.out.println("_________________________________________________");
		
		System.out.println(" The Resultant array is :");
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c[i].length; j++)
			{
				 for (int k = 0; k < c[i].length; k++)
	                {
	                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
	                    
	                }
				 System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}

	
	}
}
public class MethodToPerformMultOf2Nums
{

	public static void main(String[] args) 
	{
		int d[][]={{2,4},{5,2}};
		int e[][]={{2,4},{5,2}};
		int f[][]= new int[2][2];
		
		MethodToPerformMultOf2Numbers MultOfMatrix = new MethodToPerformMultOf2Numbers();
		MultOfMatrix.MethodToPerformMultOf2Nos(d, e, f);
	}

}
