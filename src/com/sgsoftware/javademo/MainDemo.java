package com.sgsoftware.javademo;

class Human
{
	String FirstName;
	String LastName;
	int Age;
	String City;
}

class DomesticAnimal
{
	String BreedName;
	String QtyOfMilkProviders;
	String TyprOfGrassEat;
}

class Birds
{
	int NoOfWings;
	String FeatherColor;
}
public class MainDemo
{

	public static void main(String[] args)
	{
		Human Sachin = new Human();
		Sachin.FirstName="Sachin";
		Sachin.LastName="Tendulkar";
		Sachin.Age=45;
		Sachin.City="Bangalore";
		
		System.out.println("Sachin First name is :"+Sachin.FirstName);
		System.out.println("Sachin First name is :"+Sachin.LastName);
		System.out.println("Sachin First name is :"+Sachin.Age);
		System.out.println("Sachin First name is :"+Sachin.City);
		System.out.println("---------------------------------------------------------");
		//------------------------------------------------------------------
		DomesticAnimal Cow= new DomesticAnimal();
		Cow.TyprOfGrassEat="GreenGrass";
		Cow.BreedName="Jersey";
		Cow.QtyOfMilkProviders="10 Litres";
		
		System.out.println("What type of food cow eat :"+Cow.TyprOfGrassEat);
		System.out.println("Cow breed name is :"+Cow.BreedName);
		System.out.println("Qty of milk provide :"+Cow.QtyOfMilkProviders);
		System.out.println("---------------------------------------------------------");
		//-------------------------------------------------------------------------
		
		Birds Crow = new Birds();
		Crow.NoOfWings=2;
		Crow.FeatherColor="Black color";
		
		System.out.println("No of wings it have :"+Crow.NoOfWings);
		System.out.println("Feather color is:"+Crow.FeatherColor);
		
	}

}
