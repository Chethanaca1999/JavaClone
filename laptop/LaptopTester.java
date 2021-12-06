package com.xworkz.clone.laptop;

public class LaptopTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Laptop lap=new Laptop();
		lap.setName("dell");
		lap.setCost(45000);
		lap.setRam(8);
		lap.setType("Company");
		
		 Object obj = lap.clone();
		 Laptop lap2=(Laptop)obj;
		 System.out.println(lap2.toString());
		 
		 
			 
			
		
		
	}
}
