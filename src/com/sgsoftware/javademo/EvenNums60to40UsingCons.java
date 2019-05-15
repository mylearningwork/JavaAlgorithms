package com.sgsoftware.javademo;


class EvenNums60to40
{
	int StartingNo;
	int EndingNo;
	
	EvenNums60to40(int SN,int EN)
	{
		StartingNo=SN;
		EndingNo=EN;
		for (int i = StartingNo; i >=EndingNo; i--) 
		{
			if (i%2==0) 
			{
				System.out.println("Even nums : "+i);
			}
			
		}
	}
}
public class EvenNums60to40UsingCons {

	public static void main(String[] args)
	{
		EvenNums60to40 EN60To40 = new EvenNums60to40(60,40);
	}

}
