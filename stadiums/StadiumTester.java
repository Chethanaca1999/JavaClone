package com.xworkz.clone.stadiums;

public class StadiumTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Stadiums sta=new Stadiums();
		sta.setName("edenGarden");
		sta.setPlace("Kolkatta");
		sta.setStrength(80000);
		sta.setType("cricket Stadium");
	
		
		
		Object obj=sta.clone();
		Stadiums sta2=(Stadiums)obj;
		System.out.println(sta2.toString());
	}

}
