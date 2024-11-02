package com.skilldistillery.sanctuary.entities;

public class Sasquatch extends Animal {
	
	private static String noise = "I'm invisible!";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eat(int amount) {
		makeNoise();
		System.out.println("And I love eating " + amount + " human livers!");
	}
	
}
