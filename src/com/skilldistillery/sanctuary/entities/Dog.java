package com.skilldistillery.sanctuary.entities;

public class Dog extends Animal {
	
	private static String noise = "Woof Woof";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eat(int amount) {
		System.out.println("Really? " + amount + " cheeses for me!");
	}
}
