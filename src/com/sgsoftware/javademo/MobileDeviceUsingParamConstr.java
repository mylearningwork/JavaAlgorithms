package com.sgsoftware.javademo;

class MobileDevice
{

	String ScreenSize;
	String CompanyName;
	int Price;
	String AndrioidVersion;
	String RamSize;
	String Storage;
	
	MobileDevice(String SS, String Companyname, int price, String AV, String RS, String storage)
	{
		ScreenSize=SS;
		CompanyName=Companyname;
		Price=price;
		AndrioidVersion=AV;
		RamSize=RS;
		Storage=storage;
		
		System.out.println("ScreenSize is : "+ScreenSize);
		System.out.println("CompanyName is : "+CompanyName);
		System.out.println("price is : "+Price);
		System.out.println("AndrioidVersion is : "+AndrioidVersion);
		System.out.println("RamSize is : "+RamSize);
		System.out.println("Storage is : "+Storage);
		System.out.println("_____________________________________________________");
	}

}
public class MobileDeviceUsingParamConstr {

	public static void main(String[] args)
	{
		MobileDevice Samsung = new MobileDevice("5 inches", "Samsung", 12000, "Lollipop", "2 GB", "16 GB");
		MobileDevice Motorola = new MobileDevice("4.5 inches", "Motorola", 10000, "Lollipop", "2 GB", "16 GB");
	}

}
