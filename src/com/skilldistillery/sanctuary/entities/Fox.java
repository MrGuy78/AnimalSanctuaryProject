package com.skilldistillery.sanctuary.entities;

public class Fox extends Animal {
	
	private static String noise = "Ringdingding";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eat(int amount) {
		makeNoise();
		System.out.println("Here comes " + amount + " chocolate cakes!");
	}

}
