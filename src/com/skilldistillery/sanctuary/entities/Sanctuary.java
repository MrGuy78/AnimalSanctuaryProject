package com.skilldistillery.sanctuary.entities;

public class Sanctuary {
	
	private Animal [] sanctuaryAnimals = new Animal[5];
	private Attendant attendant = new Attendant();
	
	
	public void listAnimals() {
		System.out.println();
	}
	
	public void startAttendantsRounds() {
		attendant.makeRounds(sanctuaryAnimals);
	}
	//set attendant
	//listAnimals method
	//addAnimal method
	
	//startAttendantRounds = makeRounds

}
