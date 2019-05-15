package com.sgsoftware.inheritancedemo;

class Animal
{
	String colour="Black";
	String PetName;
	Animal(String PetName)
	{
		this.PetName=PetName;
		System.out.println("pet name is : "+PetName);

	}
	/*void animalName()
	{
		System.out.println("pet name is"+PetName);

	}*/
}
class Dog extends Animal
{

	String food;
	String colour;
	Dog(String PetName,String food,String colour) 
	{
		super(PetName);
		this.food=food;
		this.colour=colour;
		System.out.println("colour is : "+colour+" , food is : "+food);
		System.out.println("Parent class cons colour is : "+super.colour);
		
	}
	/*void displayAnimalDetails()
	{
		System.out.println("colour is : "+colour+" , food is : "+food);
		System.out.println("Parent class cons colour is : "+super.colour);
	}*/
	
}
class puppy extends Dog
{
   String PuppyName;
	    puppy(String PetName, String food, String colour, String PuppyName) 
	    {
	    	super(PetName, food, colour);
	    	this.PuppyName=PuppyName;
	    	System.out.println("Puppy name is : "+PuppyName);
	    }
	   /* void ShowPuppyName()
	    {
	    	System.out.println("Puppy name is : "+PuppyName);
	    }*/
   
	
}
public class MLIHProgWithParamCons
{

	public static void main(String[] args)
	{

		puppy Snoopy = new puppy("Dog", "Pedigree", "White","Snoopy");
		
	
	}

}
