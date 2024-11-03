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
		do(keepGoing) {
			
			printMenu();
			System.out.println("Choose your zoological option: ");
			int choice = kb.nextInt();
			
			switch(choice) {
			case 1:
				listAnimals();
				
			case 2:
				System.out.println("What type of animal would you like to add? ");
				String type = kb.next();
				if(type == "Sasquatch") {
					
				}
				else if(type == "ZombieDuck") {
					
				}
				else if(type == "Fox") {
					
				}
				else if(type =="Dog") {
					
				}
				else if(type == "Platypus") {
					
				}
				else {
					System.out.println("Those don't live in our sanctuary. Try Tiger Bob's.");
				}
				addAnimal();
				
			case 3:
				makeRounds();
				
			case 4:
				System.out.println("Thanks for visiting!");
				keepGoing = false;
				break;
		
			default:
				System.out.println("Not a valid choice.");
			}
			while(keepGoing = true) {
				
			}
		

		kb.close();
	}
	}

	private void printMenu() {
		System.out.println("Choices");
		System.out.println("1: List all animals.");
		System.out.println("2: Add an animal.");
		System.out.println("3: Have the Attendant start his rounds.");
		System.out.println("4: Exit");
	}

	public static void listAnimals() {

	}

	public static void addAnimal() {

	}

	public static void makeRounds() {

	}
}
