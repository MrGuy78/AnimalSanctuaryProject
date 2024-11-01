package com.skilldistillery.sanctuary.entities;

public class ZombieDuck extends Animal {
	
	private static String noise = "I'm gonna quack your brains!";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	public void eat(int amount) {
		
	}
	
}
