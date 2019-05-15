package com.sgsoftware.javademo;

class Fibonacci
{
	int n,b,count,Fibo;
	
	Fibonacci(int n,int b, int Count)
	{
		this.n=n;
		this.b=b;
		count=Count;
		System.out.println(n);
		System.out.println(b);
		
		for (int i = 0; i < count; i++) 
		{
			Fibo=n+b;
			System.out.println(Fibo);
			n=b;
			b=Fibo;
			
		}
	}
}

public class FibonacciUsingCons {

	public static void main(String[] args)
	{
		Fibonacci Fib = new Fibonacci(0, 1, 8);
	}

}
