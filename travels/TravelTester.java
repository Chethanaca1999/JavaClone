package com.xworkz.clone.travels;

public class TravelTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Travels tra = new Travels();
		tra.setName("V R L");
		tra.setOwner("vijay sankeshwar");
		tra.setMainBranch("kaengeri");
		tra.setNoOfVehicles(1000);
		
		Object obj=tra.clone();
		Travels tra1=(Travels)obj;
		System.out.println(tra1.toString());
	}

}
