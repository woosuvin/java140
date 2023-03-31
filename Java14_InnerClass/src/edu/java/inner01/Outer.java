package edu.java.inner01;

public class Outer {
	// field
	private int x;
	private String s;
	private int y;
	
	// constructor
	public Outer(int x, String s, int y) {
		this.x = x;
		this.s = s;
		this.y = y;
	}
	
	// method
	@Override
	public String toString() {
		return String.format("Outer (x = %d, s = %s, y = %d)", this.x, this.s, this.y);
	}
	
	// static이 아닌 멤버 내부 클래스(인스턴스 내부 클래스)
	public class Inner {
		// field
		private int y;
		
		// constructor
		public Inner(int y) {
			this.y = y;
		}
		
		// method
		public void printInfo() {
			System.out.println("--- Inner Class ---");
			System.out.println("y = " + y); // 내부 클래스(Inner)의 멤버 y. (this.y)
			System.out.println("Outer x = " + x); // 내부 클래스는 외부 클래스의 멤버들을 사용할 수 있다. 외부 클래스가 가진 객체를 내부 클래스에서 접근할 수 있다.
			System.out.println("Outer s = " + Outer.this.s);
			System.out.println("Outer y = " + Outer.this.y); // 바깥 클래스에서 생성된 y.
		} 
		
	} // end Inner
		
} //end Outer
