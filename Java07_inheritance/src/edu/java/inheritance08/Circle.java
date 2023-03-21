package edu.java.inheritance08;

public class Circle extends Shape {
	// field
	private double radius; // 원의 반지름
	
	// Implicit super constructor Shape() is undefined for default constructor.
	public Circle (String type, double radius) { 
		super(type);
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * this.radius * this.radius; // Math.PI: 3.14
	}
	
	@Override
	public double perimeter() {
		return Math.PI * 2 * this.radius;
	}
}
