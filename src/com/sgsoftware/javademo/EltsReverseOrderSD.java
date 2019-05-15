package com.sgsoftware.javademo;

public class EltsReverseOrderSD {
	
	
	public static void main(String[] args)
	{
		
		int a[]= {2,3,5,6};
		
		int i=0;
		
		while(i<a.length)
		{
			System.out.println(" "+a[i]);
			i++;
			
		}
		System.out.println("____________________________________________________ ");
		System.out.println("elts in reverse order");
		
		i=a.length-1;
		while(i>=0)
		{
			System.out.println(" "+a[i]);
			i--;
			
		}
	}

}
