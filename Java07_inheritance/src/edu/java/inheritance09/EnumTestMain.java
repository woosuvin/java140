package edu.java.inheritance09;

// enum:
// (1) 열거형 상수(들)을 정의하는 특별한 종류의 클래스.
// (2) java.lang.Enum 클래스를 상속하는 특별한 하위 클래스.
// (3) field, constructor, method를 선언(정의)할 수 있음.

class Test {
	public static final Test AM = new Test("오전");
	public static final Test PM = new Test("오후");
	
	private String meaning;
	
	private Test(String meaning) {
		this.meaning = meaning;
	}
}

enum Time { 
	// 열거형 상수 선언
	AM("오전"), PM("오후");
	// -> enum 타입의 열거형 상수들은 enum 타입으로 생성된 객체!
	
	// field
	private String meaning;
	
	// constructor -> enum 생성자는 반드시 private!
	private Time(String meaning) {
		this.meaning = meaning;
	}
	
	// method
	public String getMeaning() {
		return this.meaning;
	}
}


public class EnumTestMain {

	public static void main(String[] args) {
		Time t = Time.PM; // Time이라는 타입의 static final 변수이다.
		System.out.println(t); // am.toString()의 리턴값을 출력.
		System.out.println(t.name()); // Enum 클래스에서 상속받은 메서드
		System.out.println(t.ordinal()); // Enum 클래스에서 상속받은 메서드
		System.out.println(Time.values()); // Enum 클래스에서 상속받은 static 메서드
		Time[] times = Time.values();
		for (Time x : times) {
			System.out.println(x + ":" + x.getMeaning()); // -> AM:오전 PM:오후
		}
		
	}

}
