package com.sgsoftware.javademo;

public class AddTwoMatrix2D 

{
	
	public static void main(String args[])
	
	{
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{2,2},{5,6}};
		int c[][]= new int[2][2];
		int i,j;
		/*System.out.println("The first matrix value is");
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
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}*/
		
		
//---------------------------------------------------------------------------------------------------------		
		//want to know how to write in for each loop
		/*for(int d:c)
		{
			System.out.print(" "+d);
			
		}*/
//---------------------------------While loop-----------------------------------------------------------------------------
		System.out.println("The first matrix value is");
		i=0;
		while(i<a.length)
		{
			j=0;
			while(j<a[i].length)
			{
				System.out.print(" "+a[i][j]);
				j++;
			}
			i++;
			System.out.println();
		}
		System.out.println("The second matrix value is");
		 i=0;
			while(i<b.length)
			{
				j=0;
				while(j<b[i].length)
				{
					System.out.print(" "+b[i][j]);
					j++;
				}
				i++;
				System.out.println();
			}
			
		
		System.out.println("The addition matrix value is");
		i=0;
		while(i<c.length)
		{
			j=0;
			while (j<c[i].length)
			{
				
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(" "+c[i][j]);
				j++;
			}
			System.out.println();
			i++;
		}
		
		//--------------------------------Do-While loop-----------------------------------------------------------------------------
				System.out.println("The first matrix value is");
				i=0;
				do
				{
					j=0;
					do
					{
						System.out.print(" "+a[i][j]);
						j++;
					}while(j<a[i].length);
					i++;
					System.out.println();
				}while(i<a.length);
				
				  System.out.println("The second matrix value is");
				   i=0;
					do
					{
						j=0;
						do
						{
							System.out.print(" "+b[i][j]);
							j++;
						}while(j<b[i].length);
						i++;
						System.out.println();
					}while(i<b.length);
					
				
				System.out.println("The addition matrix value is");
				i=0;
				do
				{
					j=0;
					do
					{
						
						c[i][j]=a[i][j]+b[i][j];
						System.out.print(" "+c[i][j]);
						j++;
					}while (j<c[i].length);
					System.out.println();
					i++;
				}while(i<c.length);
	}
}
