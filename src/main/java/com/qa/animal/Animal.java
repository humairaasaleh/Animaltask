package com.qa.animal;

public class Animal implements Eats {

	private int legs;
	private String colour;
	private String gender;

	public void legsNumber() {
		System.out.println("Animal has" + legs +" legs");
	}

	public void whichGender() {
		if (gender == "male") {
			System.out.println("animal is male");
		} else {
			System.out.println("animal is female");
		}

	}

	public Animal(int legs, String colour, String gender) {
		super();
		this.legs = legs;
		this.colour = colour;
		this.gender = gender;
	}

	public Animal() {
		super();
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Animal [legs=" + legs + ", colour=" + colour + ", gender=" + gender + "]";
	}

	public void food() {
		System.out.println("Eats");
		
	}

}
