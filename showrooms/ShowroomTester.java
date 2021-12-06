package com.xworkz.clone.showrooms;

public class ShowroomTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		ShowRoom show=new ShowRoom();
		show.setName("chethana tar");
		show.setPlace("rarajinagar");
		show.setCapacity(15);
		show.setType("jeep showroom");
		
		Object obj=show.clone();
		ShowRoom show1=(ShowRoom)obj;
		System.out.println(show1.toString());
	}

}
