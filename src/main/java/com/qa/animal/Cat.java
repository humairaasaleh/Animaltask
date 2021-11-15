package com.qa.animal;

public class Cat {
	private String type;

	public Cat(String type) {
		super();
		this.type = type;
	}

	public Cat() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void meows() {
		System.out.println("meow");
	}

}
