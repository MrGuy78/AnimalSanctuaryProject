package com.skilldistillery.sanctuary.entities;

public class Attendant {

	public void makeRounds(Animal[] animals) {
		for (int a = 0; a < animals.length; a++) {
			if (animals[a] != null) {
				System.out.println("I'll feed " + animals[a].getName() + " all the goods.");
				animals[a].eat(10);

			}

			else if (animals[a] == null) {
				System.out.println("No one's home. Moving on... ");
			}
		}
		System.out.println("All done. Time for a break.");
	}

}
