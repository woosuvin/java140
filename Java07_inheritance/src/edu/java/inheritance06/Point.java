package edu.java.inheritance06;

import java.util.Objects;

public class Point {
	// field
	private int x;
	private int y;
	
	// constructor (1) 기본, (2) argument 2개
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter setter
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	@Override
//	public String toString() {
//		return "Point(x=" + x + ", y=" + y + ")";
//	}
	
//	// toString override: "Point(x=0, y=0)"
	public String toString() {
//		return "Point(x= " + x + ", y= " + y + ")";
		String s = String.format("Point(x=%d, y=%d)", this.x, this.y); // 문자열을 만들어서 만들어진 문자열을 리턴해줌.
		return s;
	}

	@Override
	// hashCode() 메서드는 반드시 int 타입을 리턴.
	// equals()가 true를 리턴하는 두 객체는 hashCode()의 리턴값이 같아야 함.
	public int hashCode() {
//		return Objects.hash(x, y);
		return x * 100 + y * 10;
	}

	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) // point 객체 주소값과 obj 객체 주소값이 같으면
//			return true;
//		if (obj == null) // obj 객체의 주소값이 없으면
//			return false;
//		if (getClass() != obj.getClass()) // 클래스 이름이 다르면
//			return false;
//		Point other = (Point) obj; // 클래스 이름이 같으면 -> casting 할 수 있음.
//		return x == other.x && y == other.y;
//	}
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Point) { // obj가 Point 타입의 인스턴스이면
			Point other = (Point) obj; // 안전한 타입 변환(casting)
			result = (this.x == other.x) && (this.y == other.y);
		}
		return result;
	}
	
	// equals를 override 하면 hashCode도 override 해줘야 함.
	
	
	
}
