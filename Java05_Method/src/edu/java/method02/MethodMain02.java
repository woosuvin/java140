package edu.java.method02;

import java.util.Random;

public class MethodMain02 {

	
	
	public static void main(String[] args) {
		// argument를 가지고 리턴값이 있는 메서드 작성/호출 연습
		
		// 같은 클래스 안에서 작성한 메서드인 경우에는 메서드 이름으로만 호출하면 됨.
		double result = add(1.72, 2.65); // 메서드 호출. argument: 1, 2.
		System.out.println(result);
		
		double result2 = subtract(5, 2);
		System.out.println(result2);
		
		double result3 = multiply(4, 2);
		System.out.println(result3);
		
//		double result4 = divide(8, 4);
//		System.out.println(result4);
		System.out.println(divide(9, 3));
		
//		boolean result5 = isEven(2);
//		System.out.println(result5);
		System.out.println(isEven(1));
		
//		for (int x : makeArray(3)) {
//			System.out.print(x + "\t");
//		}
		int[] array = makeArray(5);
		for (int x: array) {
			System.out.print(x + "\t");
		}
	}

	/**
	 * 실수 2개를 전달받아서, 그 덧셈 결과를 리턴하는 메서드
	 * @param x 실수(double) 타입
	 * @param y 실수(double) 타입
	 * @return x + y
	 */
	public static double add(double x, double y) {
		
		// 메서드 정의(선언)
		// 메서드 수식어 - public static
		// 메서드 리턴 타입 - double
		// 메서드 이름 - add
		// 파라미터(parameter) - double x, double y
		
		return x + y; // 리턴 문장. x + y -> 리턴값.
	}
	
    /**
     * subtract
     * 숫자 2개를 전달받아서, 뺄셈의 결과를 반환.
     * @param x double.
     * @param y double.
     * @return x - y.
     */
	public static double subtract(double x, double y) {
		return x - y;
	}
    
    /**
     * multiply
     * 숫자 2개 전달받아서 곱셈 결과를 반환.
     * @param x double.
     * @param y double.
     * @return x * y.
     */
    public static double multiply(double x, double y) {
    	return x * y;
    }
    
    /**
     * divide
     * 숫자 2개를 전달받아서, 나눗셈 결과를 반환.
     * @param x double.
     * @param y double.
     * @return x / y.
     */
    public static double divide(double x, double y) {
    	return x / y;
    }
    
    /**
     * isEven
     * 정수가 짝수인 지 아닌 지를 리턴하는 메서드.
     * @param n 짝수인 지 홀수인 지 검사할 정수.
     * @return n이 짝수이면 true, 그렇지 않으면 false.
     */
    public static boolean isEven(int n) {
    	return n % 2 == 0;
    	
//    	if (n % 2 == 0) {
//    		return true;
//    	} else {
//    		return false;
//    	}
    	
//    	return (n % 2 == 0) ? true : false;
    }
    
    /**
     * makeArray
     * argument로 전달된 배열의 길이 크기의 정수 배열을 생성하고,
     * 임의의 난수들로 배열을 초기화해서 리턴하는 함수.
     * @param length 배열의 길이. 양의 정수.
     * @return length개의 난수들로 초기화된 정수 배열.
     */
    public static int[] makeArray(int length) {
    	Random random = new Random();
    	int[] array = new int [length];
    	for (int i = 0; i < array.length; i++) { // i < length; 가능
    		array[i] = random.nextInt();
    	} 
    	return array;
    }
}
