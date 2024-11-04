package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

import com.skilldistillery.sanctuary.entities.Sanctuary;

public class AnimalSanctuaryApp {
	private Sanctuary sanctuary = new Sanctuary();

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.run();

	}

	public void run() {
		boolean keepGoing = true;
		do {

			printMenu();
			System.out.println("Choose your zoological option: ");
			int choice = kb.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Read 'em and weep, Joe Exotic!");
				listAnimals();

			case 2:
				System.out.println("What type of animal would you like to add? ");
				String type = kb.next();
				if (type.equals("Sasquatch") || type.equals("sasquatch")) {

				} else if (type.equals("ZombieDuck") || type.equals("zombieduck")) {

				} else if (type.equals("Fox") || type.equals("fox")) {

				} else if (type.equals("Dog") || type.equals("dog")) {

				} else if (type.equals("Platypus") || type.equals("platypus")) {

				} else {
					System.err.println("Those don't live in our sanctuary. Try Tiger Bob's.");
				}
				addAnimal();

			case 3:
				makeRounds();

			case 4:
				System.out.println("Thanks for visiting!");
				keepGoing = false;
				break;

			default: //should loop back to main menu
				System.out.println("Not a valid choice.");
			}
			kb.close();

		} while (keepGoing = true);

	}

	private void printMenu() {
		System.out.println("**** Choices ****");
		System.out.println("1: List all animals.");
		System.out.println("2: Add an animal.");
		System.out.println("3: Have the Attendant start his rounds.");
		System.out.println("4: Exit");
	}

	public static void listAnimals() {
		//iterate thru array
	}

	public static void addAnimal() {
		//iterate thru array

	}

	public static void makeRounds() {
		//iterate thru array

	}
}
