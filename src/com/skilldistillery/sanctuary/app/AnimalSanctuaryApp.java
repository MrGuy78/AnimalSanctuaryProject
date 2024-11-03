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
			System.out.println("Choose your zoological options: ");
			int choice = kb.nextInt();
			
			switch(choice) {
			case "1":
				System.out.println(listAnimals());
				
			case "2":
				System.out.println(addAnimal());
				
			case "3":
				System.out.println(makeRounds());
				
			case "4":
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

	private void printMenu() {
		System.out.println("Choices");
		System.out.println("1: List all animals.");
		System.out.println("2: Add an animal.");
		System.out.println("3: ");
		System.out.println("4: Exit");
	}
	
	listAnimals() {
		
	}
}
