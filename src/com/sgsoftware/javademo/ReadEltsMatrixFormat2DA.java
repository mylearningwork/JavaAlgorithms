package com.sgsoftware.javademo;

public class ReadEltsMatrixFormat2DA {

	public static void main(String[] args)
	{
		int a[][]= {{2,4},{5,8}};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}

}
