package com.sgsoftware.stringDemo;

class ReverseStringUsingToCharArr
{
	char[] Rev;
	void StrRev(String str)
	{
		
		for (int i = str.length()-1; i >=0; i--)
		{
			Rev=str.toCharArray();
			System.out.print(Rev[i]);
		}
	}
}

public class StringDemo3 {

	public static void main(String[] args)
	{
		ReverseStringUsingToCharArr RS3 = new ReverseStringUsingToCharArr();
		RS3.StrRev("Hello");
	}

}
