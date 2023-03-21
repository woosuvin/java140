package edu.java.inheritance08;

public class Rectangle extends Shape {
	// field
	private double width; // 직사각형의 가로 길이
	private double height; // 직사각형의 세로 길이
	
	// Implicit super constructor Shape() is undefined for default constructor.
	public Rectangle(String type, double width, double height) {
		super(type); // 상위 클래스의 argument를 갖는 생성자를 명시적으로 호출한 코드.
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return this.width * this.height;
	}

	@Override
	public double perimeter() {
		return (this.width + this.height) * 2;
	}

}
