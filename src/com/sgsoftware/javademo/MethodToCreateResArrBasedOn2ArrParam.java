package com.sgsoftware.javademo;
class MethodToCreateResArrBasedOn2ArrParameters
{
	void MethodToCreateResArrBasedOn2ArrParm(int a[][], int b[][],int c[][])
	{
		/*for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("_________________________________________________");
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b[i].length; j++)
			{
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
		System.out.println("_________________________________________________");
		*/
		System.out.println(" The Resultant array is :");
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c[i].length; j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}

	}
}

public class MethodToCreateResArrBasedOn2ArrParam {

	public static void main(String[] args) 
	{
		int d[][]={{2,4},{5,2}};
		int e[][]={{2,4},{5,2}};
		int f[][]= new int[2][2];
		
		MethodToCreateResArrBasedOn2ArrParameters ResArray = new MethodToCreateResArrBasedOn2ArrParameters();
		ResArray.MethodToCreateResArrBasedOn2ArrParm(d, e, f);
	}

}
