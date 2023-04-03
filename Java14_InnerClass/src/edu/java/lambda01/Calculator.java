package edu.java.lambda01;

public class Calculator {
	
	// 중첩 인터페이스
	@FunctionalInterface // 함수형 인터페이스: 추상 메서드가 오직 1개인 인터페이스
	public interface Calculable { 
		double calculate(double x, double y);
//		void test(); -> 에너테이션을 붙여서 메서드가 하나라고 선언했기 때문에 에러.
	}
	
	// field
	private double x;
	private double y;
	
	// constructor
	public Calculator (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// method
	public double calculate(Calculable calc) { // argument가 계산해주는 값을 return
		return calc.calculate(x, y);
	}
	
	
}
