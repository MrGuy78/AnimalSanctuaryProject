package com.skilldistillery.sanctuary.entities;

public class ZombieDuck extends Animal {
	
	private static String noise = "I'm gonna quack your brains!";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eat(int amount) {
		System.out.println("Oh! You're feeding me " + amount + " snails? Nom nom nom");
	}
	
}
