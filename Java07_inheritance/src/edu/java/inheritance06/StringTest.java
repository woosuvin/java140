package edu.java.inheritance06;

public class StringTest {

	public static void main(String[] args) {
		// 상수(constant): final로 선언된 변수.
		// 리터럴(literal): 만들어진 값.
		final int x = 1; // x: 상수  1: 정수 리터럴
		
		String s1 = "hello"; // s1: 변수  "hello": 문자열 리터럴
		String s2 = "hello"; // 같은 문자열이므로 주소값 재사용
		System.out.println(s1 == s2); 
		// -> true: JVM은 같은 문자열 리터럴은 두 번 생성하지 않음.
		
		String s3 = new String("hello"); // 새로운 String 객체 만듦 주소값 다름
		String s4 = new String("hello"); // 새로운 String 객체 만듦 주소값 다름
		System.out.println(s3 == s4); 
		// -> false: 생성자는 호출할 때마다 새로운 객체를 heap 메모리에 새롭게 생성.
		
		System.out.println(s3.equals(s4)); // equals는 문자열을 비교. true
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
