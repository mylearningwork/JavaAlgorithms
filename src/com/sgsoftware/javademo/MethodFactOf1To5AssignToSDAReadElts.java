package com.sgsoftware.javademo;
class FactOf1To5AssignToSDAReadElements
{
	void MethodFactOf1To5AssignToSDAReadElements(int n)
	{
		int b=1,i=0,l=0;
		int a[]= new int[n];
		for (i = 1; i<=n; i++) 
		{

			b=b*i;
			
		System.out.println("Factorial of "+i+ " is "+b);
			
            a[l++]=b;
             
		}
		System.out.println("___________________________________________________");
		
		System.out.println("Read elts in reverse order");
		for (int j = 0; j < a.length; j++)
		{
			System.out.println(" "+a[j]);
		}
	
	}
}
public class MethodFactOf1To5AssignToSDAReadElts
{

	public static void main(String[] args) 
	{
	   
		FactOf1To5AssignToSDAReadElements FactOf1To5 = new FactOf1To5AssignToSDAReadElements();
		FactOf1To5.MethodFactOf1To5AssignToSDAReadElements(6);
		
	}

}
