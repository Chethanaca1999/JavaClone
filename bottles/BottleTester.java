package com.xworkz.clone.bottles;

public class BottleTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Bottle bot= new Bottle();
		bot.setBrand("Bisleri");
		bot.setType("plastic");
		bot.setCost(20);
		bot.setQuantity(1);
		
		Object obj=bot.clone();
			
			Bottle bot2=(Bottle)obj;
			System.out.println(bot2.toString());
		
		
		
	}
}
