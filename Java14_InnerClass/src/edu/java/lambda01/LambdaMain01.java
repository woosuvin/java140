package edu.java.lambda01;

import edu.java.lambda01.Calculator.Calculable;

public class LambdaMain01 {

	public static void main(String[] args) {
		// Calculator 타입의 객체 생성
		Calculator calc = new Calculator(1, 2); // 계산기
		// Calculable 인터페이스 구현클래스 타입의 객체 생성
		Calculable adder = new CalcAdder(); // 덧셈 도구
		// 생성된 객체를 calculate 메서드의 argument로 전달.
		double result = calc.calculate(adder); // 계산기에 덧셈 넘김
		System.out.println("result = " + result);
		
		
		// 지역 (내부) 클래스
		class Subtractor implements Calculable {
			@Override
			public double calculate(double x, double y) {
				return x - y;
			}
		}
		Calculable subtractor = new Subtractor(); // 지역 클래스 객체 생성. 
		result = calc.calculate(subtractor); // 
		System.out.println("result = " + result);
		
		
		// 익명 클래스 객체 생성
		Calculable multiplier = new Calculable() {
			@Override
			public double calculate(double x, double y) {
				return x * y;
			}
		};
		result = calc.calculate(multiplier);
		System.out.println("result = " + result);
		
		
		result = calc.calculate(new Calculable() {
			@Override
			public double calculate(double x, double y) {
				return x / y;
			}
		});
		System.out.println("result = " + result);
		
		
		// 람다 표현식(lambda expression): 익명 클래스를 간단하게 표현하는 방법. 함수 표기법.
		result = calc.calculate((x, y) -> x / y); // (x, y) -> {return x / y}
		System.out.println("result = " + result);
		// 어떤 값들이 전달이 되면 무슨 일을 할 지 화살표로 전달이 되는 것.
		
		/*
		 * 람다 표현식 - 함수 표기법
		 * 클래스 정의와 객체 생성을 동시에 하는 익명 클래스를 간단히 작성하기 위한 문법.
		 * 함수형 인터페이스(FunctionalInterface)만 람다 표현식으로 작성할 수 있음.
		 * - 함수형 인터페이스: 추상 메서드를 오직 하나만 갖는 인터페이스.
		 * 람다 표현식 문법:
		 *  (parameter 선언, ...) -> {메서드 코드};
		 * 람다 표현식의 파라미터 선언에서는 타입을 생략해도 됨. (인터페이스에서 이미 선언되어 있기 때문에)
		 * 람다 표현식의 body{}가 문장이 하나만 있는 경우에는 중괄호{}를 생략할 수 있음.
		 * 람다 표현식의 body가 return 문장만 있는 경우에는 중괄호와 return 키워드를 모두 생략하고 return값만 표기해도 됨.
		 *  (parameter 선언, ...) -> 리턴 값
		 * 람다 표현식에서 parameter가 1개인 경우에는 괄호()를 생략할 수 있음.
		 *  parameter -> {}
		 *  parameter -> 리턴 값
		 */
		
	}

}
