package com.sgsoftware.stringDemo;

class ReverseString
{
	char Rev;
	void StrRev(String str)
	{
		
		for (int i = str.length()-1; i >=0; i--)
		{
			Rev=str.charAt(i);
			System.out.print(Rev);
		}
	}
}

public class StringDemo1 {

	public static void main(String[] args) 
	{
		ReverseString RS = new ReverseString();
		RS.StrRev("programming");
	}

}
