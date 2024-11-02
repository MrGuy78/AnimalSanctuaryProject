package com.skilldistillery.sanctuary.entities;

public class Platypus extends Animal {
	
	private static String noise = "What're you lookin at?";
		
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eat(int amount) {
		makeNoise();
		System.out.println("My diet of " + amount + " snails is a secret!");
	}
}
