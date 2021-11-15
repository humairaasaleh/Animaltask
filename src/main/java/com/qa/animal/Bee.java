package com.qa.animal;

public class Bee extends Animal implements Stings{
	private boolean flies;

	public void stings() {
		System.out.println("Animal stings");
		
	}

	public Bee(int legs, String colour, String gender, boolean flies) {
		super(legs, colour, gender);
		this.flies = flies;
	}

	public Bee(int legs, String colour, String gender) {
		super(legs, colour, gender);
	}

	public boolean isFlies() {
		return flies;
	}

	public void setFlies(boolean flies) {
		this.flies = flies;
	}

}
