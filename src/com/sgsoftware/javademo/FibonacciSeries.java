package com.sgsoftware.javademo;

public class FibonacciSeries 

{
	
	public static void main(String[] args)
	{
		int n=0,b=1,count=10,Fibo;
		System.out.println(n);
		System.out.println(b);
		
		for (int i = 0; i < count; i++) 
		{
			Fibo=n+b;
			System.out.println(Fibo);
			n=b;
			b=Fibo;
			
		}
	}

	

}
