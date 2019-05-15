package com.sgsoftware.javademo;

class Metro
{
	String SourceStationName;
	String DestinationStName;
	int Travelcharge;
	
	
	Metro(String SSN, String DSN, int price)
	{
		SourceStationName=SSN;
		DestinationStName=DSN;
		Travelcharge=price;
		
		System.out.println("SourceStationName is : "+SourceStationName);
		System.out.println("DestinationStName is : "+DestinationStName);
		System.out.println("Travel ticket amount is : "+Travelcharge);
	}
	
}


public class MetroUsingParamConstru {

	public static void main(String[] args) 
	{
		
		Metro MetroTrain = new Metro("Vijayanagar", "Bayappanahalli", 30);
	}

}
