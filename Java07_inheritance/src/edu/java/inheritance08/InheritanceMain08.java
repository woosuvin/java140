package edu.java.inheritance08;

public class InheritanceMain08 {

	public static void main(String[] args) {
//		Shape shape = new Shape("직사각형"); -> Cannot instantiate the type Shape. 추상클래스는 생성자를 호출할 수 없음. 객체를 생성할 수 없음.
		
		// 내 풀이
//		Rectangle r1 = new Rectangle("직사각형", 2, 3);
//		r1.draw();
//		
//		Circle c1 = new Circle("원", 4);
//		c1.draw();
		
		
		// 선생님 풀이
		Shape[] shapes = { // 배열 안에서 객체 생성
				new Rectangle("직사각형", 3, 4), 
				new Circle("원", 10)
		};
		
		for(Shape s : shapes) {
			s.draw(); // Shape 클래스에서 만든 메서드. 
		}
		
		
		
	}

}
