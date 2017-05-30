package com.car;

import java.io.Serializable;

public class Car implements Serializable {
	private int wheels;
	private String color;
	private int power;
	
	public Car(int wheels, String color, int power) {
		super();
		this.wheels = wheels;
		this.color = color;
		this.power = power;
	}
	
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override	
	public String toString(){
		return "Car [" + "Wheels= " +wheels + ", Color= " +color + ", Power= " +power  + "]";
		
	}

	
	

}
