package com.syne.api.demo;

public class Apple {
	
	private String color;
	private Double weight;

	public Apple(String color, Double weight) {
		this.color = color;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple{color:" + this.getColor() + ",weight:" + this.getWeight() + "}";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
}
