package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

public class AnimalSanctuaryApp {

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.run();

	}

	public void run() {
		while(true) {
			
			
			printMenu();
			System.out.println("Choose your zoological options: ");
			int choice = kb.nextInt();
			
			switch(choice) {
			case "1":
				System.out.println();
				
			case "2":
				System.out.println("");
				
			case "3":
				System.out.println();
				
			case "4":
				System.out.println();
				
			default:
				System.out.println("Not a valid choice.");
			}
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
