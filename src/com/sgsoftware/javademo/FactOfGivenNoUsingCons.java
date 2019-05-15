package com.sgsoftware.javademo;

class FactOfGivenNo
{
	int n;
	FactOfGivenNo(int number, int b)
	{
	
		n=number;
		//int n=5,b=1;
		for (int i = 1; i<=n; i++) 
		{
			
			b=b*i;
			
		}
		System.out.println(b);
	
	}
}

public class FactOfGivenNoUsingCons 
{

	public static void main(String[] args) 
	{
		FactOfGivenNo Fact = new FactOfGivenNo(5, 1);
	}

}
