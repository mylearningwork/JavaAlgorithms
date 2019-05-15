package com.sgsoftware.javademo;

class FindGivenNumPrimeOrNot
{
	void PrimeOrNot(int n)
	{

		
		int m, flag=0;
		
		m=n/2;
		for (int i = 2; i <= m; i++)
		{
			if (n%i==0)
			{
				flag=1;
				break;
			}
			
		}
		if (flag==1) 
		{
			System.out.println("The given num is not prime number");
		}
		else 
		{
			System.out.println("The given num is prime number");
		}
	
		
	}
}

public class FindGivenNumPrimeOrNotUsingMethods 
{

	public static void main(String[] args)
	{
		FindGivenNumPrimeOrNot Prime = new FindGivenNumPrimeOrNot();
		Prime.PrimeOrNot(13);
	}

}
