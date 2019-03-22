package com.github.joselume;

public class Application {
	private String name;	
	
	public String open () {
		return "Opening application " + this.name;
	}
	public String close () {
		return "Closing application " + this.name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
