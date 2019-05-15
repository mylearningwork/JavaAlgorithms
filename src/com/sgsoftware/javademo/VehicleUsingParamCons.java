package com.sgsoftware.javademo;


class Vehicle
{
	String VehicleType;
	String VehCompanyName;
	String Mileage;
	int Price;
	int ModelNo;
	
	Vehicle(String VT, String CompanyName, String mileage, int Cost, int MN)
	{
		VehicleType=VT;
		VehCompanyName=CompanyName;
		Mileage=mileage;
		Price=Cost;
		ModelNo=MN;
		
		System.out.println("VehicleType is : "+VehicleType);
		System.out.println("VehCompanyName is : "+VehCompanyName);
		System.out.println("Howmany kms mileage it will give : "+Mileage);
		System.out.println("Price is : "+Price);
		System.out.println("ModelNo is : "+ModelNo);
		System.out.println("___________________________________________________________________");
	}
	
}

public class VehicleUsingParamCons {

	public static void main(String[] args) 
	{
		Vehicle TwoWheeler = new Vehicle("TwoWheeler", "Honda", "60 KMS", 60000, 2013);
		Vehicle FourWheeler = new Vehicle("FourWheeler", "Hyundai", "16 KMS", 800000, 2013);
	}

}
