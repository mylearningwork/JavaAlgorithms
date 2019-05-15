package com.sgsoftware.javademo;

class ResultOf10thTableAssigntoSDAReadInReverseOrder 
{
	void ResultOf10thTableAssigntoSDAReadInRevOrder(int n,int a[])
	{
		int result,l=0;
		for (int i = 1; i <=10; i++) 
		{
			result=n*i;
			System.out.println(result);
			a[l++]=result;
		}
		System.out.println("__________________________________________________");
		System.out.println("Reading the elements from array in reverse order");
		for (int i = a.length-1; i >=0; i--)
		{
			System.out.println(" "+a[i]);
		}
	}
	
}

public class MethodResultOf10thTableAssigntoSDAReadInRev 
{

	public static void main(String[] args)
	{
		int n=5,result,l=0;
		int a[]= new int[10];
		ResultOf10thTableAssigntoSDAReadInReverseOrder Result10thtab = new ResultOf10thTableAssigntoSDAReadInReverseOrder();
		Result10thtab.ResultOf10thTableAssigntoSDAReadInRevOrder(9, a);
	}	

}
