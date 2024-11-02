package com.skilldistillery.sanctuary.entities;

public class Sanctuary {
	
	private Animal [] sanctuaryAnimals = new Animal[5];
	private Attendant attendant = new Attendant();
	
	
	public void listAnimals(Animal[] sanctuaryAnimals) {
		for (Animal animal : sanctuaryAnimals) {
			System.out.println(animal.getName());
		}
	}
	
	public void startAttendantsRounds() {
		attendant.makeRounds(sanctuaryAnimals);
	}
	//listAnimals method
	
	private void addAnimal(Animal animal) {
		for(int i = 0; i < sanctuaryAnimals.length; i++) {
			if(sanctuaryAnimals[i] == null) {
				sanctuaryAnimals[i] = animal;
				break;
			}
		}
	}

}
