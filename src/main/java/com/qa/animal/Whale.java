package com.qa.animal;

public class Whale extends Animal {
	private boolean swims;

	public Whale(int legs, String colour, String gender, boolean swims) {
		super(legs, colour, gender);
		this.swims = swims;
	}

	public Whale(int legs, String colour, String gender) {
		super(legs, colour, gender);
	}

	public boolean isSwims() {
		return swims;
	}

	public void setSwims(boolean swims) {
		this.swims = swims;
	}
	
	public void canSwim() {
		System.out.println("animal swims");
	}
	

}
