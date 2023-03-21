package edu.java.inheritance08;

public abstract class Shape {
	// field
	protected String type;
	
	// constructor - 추상 클래스의 생성자는 하위 클래스에서만 호출할 수 있음.
	protected Shape(String type) {
		this.type = type;
	}
	
	// method 
	public abstract double area(); // 도형의 넓이를 리턴.
	public abstract double perimeter(); // 도형의 둘레 길이를 리턴.
	
	// final method (바디를 갖는) - 하위 클래스에서 override(재정의)하지 못하도록 하기 위해서. (abstract는 final 불가능)
	public final void draw() {
		String info = String.format("%s: 넓이= %f, 둘레=%f", this.type, area(), perimeter()); // 추상메서드도 호출 가능.
		System.out.println(info);
		// 하위 클래스에서 넓이, 둘레가 구현됐을 것이라고 가정하고 만드는 메서드
	}
	
}
