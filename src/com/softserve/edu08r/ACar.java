package com.softserve.edu08r;

public abstract class ACar {
	private double maxSpeed;

	public ACar() {
		System.out.println("public ACar()");
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public abstract void carRides();
}
