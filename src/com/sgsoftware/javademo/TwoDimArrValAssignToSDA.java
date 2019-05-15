package com.sgsoftware.javademo;

public class TwoDimArrValAssignToSDA {

	public static void main(String[] args)
	{
		int a[][]={{2,5},{6,7}};
		int l=0;
		int b[]=new int[4];
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				//System.out.print(" "+a[i][j]);
				b[l++]=a[i][j];
				
			}
			
		}
		
		for (int k = 0; k < b.length; k++) 
		{
			System.out.println(""+b[k]);
		}
		
	}

}
