package com.sgsoftware.stringDemo;

class ReverseStringUsingSubStr
{
	String Rev;
	String RevString;
	void StrRev(String str)
	{
		
		for (int i=str.length()-1 ; i>=0; i--)
		{
			Rev=str.substring(i,i+1);
			//RevString+=Rev;
			System.out.print(Rev);
			
		}
		
	}
}

public class StringDemo2 {

	public static void main(String[] args)
	{
		ReverseStringUsingSubStr RS1 = new ReverseStringUsingSubStr();
		RS1.StrRev("programming");
	}

}
