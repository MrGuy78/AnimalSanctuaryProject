package com.skilldistillery.sanctuary.entities;

public class Attendant {

	public void makeRounds(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println("I'll feed " + animals[i].getName() + " all the goods.");
				animals[i].eat(10);
			}

			else if (animals[i] == null) {
				System.out.println("No one's home. Moving on... ");
			}
		}
		System.out.println("All done. Time for a break.");
	}

}
