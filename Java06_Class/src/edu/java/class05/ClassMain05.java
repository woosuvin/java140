package edu.java.class05;

public class ClassMain05 {

	public static void main(String[] args) {
		// 기본 생성자를 이용한 Rectangle 객체 생성
		Rectangle rect1 = new Rectangle();
		System.out.println(rect1);
		System.out.println("가로: " + rect1.width + ", 세로: " + rect1.height);
		
		rect1.width = 3; // 생성된 rect1 직사각형 객체의 가로 길이(width)를 변경
		rect1.height = 5.5; // 생성된 rect1 직사각형 객체의 세로 길이(height)를 변경
		
		System.out.println("둘레: " + rect1.perimeter());
		System.out.println("넓이: " + rect1.area());
		
		// argument를 갖는 생성자를 이용한 객체 생성
		Rectangle rect2 = new Rectangle(4, 5);
		System.out.println("가로: " + rect2.width + ", 세로: " + rect2.height);
		
		System.out.println("둘레: " + rect2.perimeter());
		System.out.println("넓이: " + rect2.area());

	}

}
