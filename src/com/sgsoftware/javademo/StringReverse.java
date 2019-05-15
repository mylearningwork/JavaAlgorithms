package com.sgsoftware.javademo;

class StringRev
{
	String a="Raja";
  //  char ch[]=a.toCharArray();
	void RevString()
	{
		for (int i = a.length()-1; i >=0; i--)
		{
			System.out.print(a.charAt(i));
			
		}
	}

	
}
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRev SR= new StringRev();
		SR.RevString();
	}

}
