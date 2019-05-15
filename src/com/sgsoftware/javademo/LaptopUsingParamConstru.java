package com.sgsoftware.javademo;

class Laptop
{
	String LaptopSize;
	String CompanyName;
	int Price;
	String ProcessorName;
	String RamSize;
	String HDDStorage;
	
	Laptop(String LS, String Companyname, int price, String PN, String RS, String HDD)
	{
		LaptopSize=LS;
		CompanyName=Companyname;
		Price=price;
		ProcessorName=PN;
		RamSize=RS;
		HDDStorage=HDD;
		
		System.out.println("LaptopSize is : "+LaptopSize);
		System.out.println("CompanyName is : "+CompanyName);
		System.out.println("Laptop price is : "+Price);
		System.out.println("ProcessorName is : "+ProcessorName);
		System.out.println("RamSize is : "+RamSize);
		System.out.println("HDDStorage is : "+HDDStorage);
		System.out.println("_____________________________________________________");
	}
}
public class LaptopUsingParamConstru {

	public static void main(String[] args) 
	{
		Laptop Dell = new Laptop("15 inches", "Dell", 50000, "Core i5", "8 GB", "500 GB");
		Laptop Lenovo = new Laptop("15 inches", "Lenovo", 70000, "Core i5", "16 GB", "1000 GB");
	}

}
