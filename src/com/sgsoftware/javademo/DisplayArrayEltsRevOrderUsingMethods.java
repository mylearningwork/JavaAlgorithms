package com.sgsoftware.javademo;

class DisplayArrayEltsRevOrder
{
	void DisplayArrayElts(String colors[])
	{
		for (int i = colors.length-1; i >=0; i--) 
		{
			System.out.println(" "+colors[i]);
		}
	}
}
public class DisplayArrayEltsRevOrderUsingMethods
{

	public static void main(String[] args) 
	{
		String KK[]={"white","Red","Green","Yellow"};
		
		DisplayArrayEltsRevOrder DisEltsRev = new DisplayArrayEltsRevOrder();
		DisEltsRev.DisplayArrayElts(KK);;
	}

}
