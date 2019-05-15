package com.sgsoftware.stringDemo;

class StringLenFind
{
	int c=0;
	
	void StrLen(String str)
	{
		try
		{
		for (int i = 0; i >=0; i++)
		{
			str.charAt(i);
			c=c+1;
			
		}
		
				
	    }
		catch(Exception e)
		{
			
			//e.printStackTrace();
		}
		System.out.println(c);
	}
}

public class StringLengthFind {

	public static void main(String[] args) 
	{
		StringLenFind SLF = new StringLenFind();
		SLF.StrLen("abcdefghijklm");
	}

}
