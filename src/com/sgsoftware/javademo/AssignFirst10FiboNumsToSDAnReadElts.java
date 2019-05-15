package com.sgsoftware.javademo;
class AssignFirst10FiboNumsToSDAnReadElementsinSameOrder
{
	void AssignFirst10FiboNumsToSDA(int count, int Arr[])
	{
		int n=0,b=1,Fibo,l=0;
		//System.out.println(n);
		//System.out.println(b);
		
		for (int i = 1; i <=count; i++) 
		{
			System.out.println(n);
			
			Arr[l++]=n;
			Fibo=n+b;
			n=b;
			b=Fibo;
			
		}
		System.out.println();
		for (int j = 0; j < Arr.length; j++)
		{
			System.out.println(Arr[j]);
		}
	
	}
}

public class AssignFirst10FiboNumsToSDAnReadElts 
{

	public static void main(String[] args)
	{

		int SDA[]=new int [10];
		AssignFirst10FiboNumsToSDAnReadElementsinSameOrder Fibo = new AssignFirst10FiboNumsToSDAnReadElementsinSameOrder();
		Fibo.AssignFirst10FiboNumsToSDA(10, SDA);
		
	}

}
