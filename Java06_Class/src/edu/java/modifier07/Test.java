package edu.java.modifier07;

public class Test {
	// 인스턴스 필드 : static 사용 x
	int x; 
	
	// static 필드 / 프로그램 실행하는 순간 메모리에 생기는 변수
	static int y;
	
	// 인스턴스 메서드
	public void printInfo() {
		System.out.println("--- instance method ---");
		System.out.println("x = " + this.x); // this. 생략 가능
		System.out.println("y = " + Test.y); // -> 인스턴스 메서드는 static 필드/메서드를 사용할 수 있음. test. 생략 가능
		System.out.println("-----------------------");
	}

	public static void printStaticInfo() { // 수식어 순서는 상관없으나 !리턴타입은 메서드이름 앞에 위치!
		System.out.println("---- static method ----");
//		System.out.println("x = " + x); -> static 메서드에서 인스턴스 필드/메서드를 사용할 수 없기 때문에.
		System.out.println("y = " + y);
		System.out.println("-----------------------");
	}
}
