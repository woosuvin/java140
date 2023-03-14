package edu.java.class06;

public class ClassMain06 {

	public static void main(String[] args) {
		// 기본 생성자 호출
		Circle circle1 = new Circle();
		circle1.printInfo();
		
		circle1.radius = 1;
		
		circle1.printInfo();
		circle1.perimeter();
		circle1.area();
		
		// argument 갖는 생성자 호출
		Circle circle2 = new Circle(4);
		circle2.printInfo();
		circle2.perimeter();
		circle2.area();

	}

}
