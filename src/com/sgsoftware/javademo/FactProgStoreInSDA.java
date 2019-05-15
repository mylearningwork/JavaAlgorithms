package com.sgsoftware.javademo;

public class FactProgStoreInSDA {

	public static void main(String[] args) 
	{

		
		int n=1,b=1,i=0,l=0;
		int a[]= new int[5];
		
			for (i = 1; i<=n; i++) 
			{

				b=b*i;
				n++;
				if (n==7) 
				{
					break;
				}
				System.out.println("Factorial of "+i+ " is "+b);
				//System.out.println("___________________________________________________");

				//a[i]=b;

                a[l++]=b;
                 
			}
			
			for (int j = 0; j < a.length; j++)
			{
				System.out.println(" "+a[j]);
			}
		
	
	}

}
