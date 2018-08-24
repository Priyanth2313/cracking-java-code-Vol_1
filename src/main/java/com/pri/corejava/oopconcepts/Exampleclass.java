package com.pri.corejava.oopconcepts;

public class Exampleclass {

	protected String carName;
	protected float carDisplacement;
	
	int carType = 3;
	
	public boolean carInsurance() {
		return false;
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public float getCarDisplacement() {
		return carDisplacement;
	}
	public void setCarDisplacement(float carDisplacement) {
		this.carDisplacement = carDisplacement;
	}

}
