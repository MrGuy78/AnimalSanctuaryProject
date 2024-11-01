package com.skilldistillery.sanctuary.entities;

public class Animal {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println("NOISE!!");
	}
	
	public void eat(int amount) {
		System.out.println("Consuming " + amount + " foods.");
	}

}
