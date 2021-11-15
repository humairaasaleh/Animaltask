package com.qa.animal;

public class Elephant extends Animal {
	private boolean trunk;

	public Elephant(int legs, String colour, String gender, boolean trunk) {
		super(legs, colour, gender);
		this.trunk = trunk;
	}

	public Elephant(int legs, String colour, String gender) {
		super(legs, colour, gender);
	}

	public boolean isTrunk() {
		return trunk;
	}

	public void setTrunk(boolean trunk) {
		this.trunk = trunk;
	}

	public void hasTrunk() {
		if (trunk = true) {
			System.out.println("Animal has trunk");
		} else {
			System.out.println("No trunk");
		}
	}

}
