package com.sgsoftware.inheritancedemo;

class Animals1
{
	int age=4;
	Animals1()
	{
		System.out.println("This is animal class");
	}
	void age()
	{
		System.out.println("The animal in super class age is "+age);
	}
	
}
class Tiger extends Animals1
{
	int age=3;
	void showAge()
	{
		super.age();
		System.out.println("The tiger age is"+age);
		
	}
}
class Lion extends Animals1
{
	
	void lion()
	{
		
		System.out.println("This is parent lion class");
		
	}
}
class Cheetah extends Tiger
{
	void lionChild()
	{
		System.out.println("This is Cheetah class");
	}
}
public class HybridInheritance {

	public static void main(String[] args)
	{
		Cheetah CH = new Cheetah();
		CH.lionChild();
		CH.showAge();

	}

}
