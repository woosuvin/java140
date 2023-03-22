package edu.java.interface03;

// 자바는 다중 상속을 제공하지 않음. 2개 이상의 클래스를 상속할 수 없음.
class A {}
class b {}
class C extends A {}
// class D extends A, B {} -> 문법 오류. 다중상속 안됨.

// 클래스에서 구현하는 인터페이스의 개수는 제한이 없음.
interface E {}
interface F {}
class G implements E, F {} // 2개 인터페이스를 구현하는 클래스
class H extends A implements E, F {} // 1개 클래스를 상속하고 2개 인터페이스를 구현하는 클래스

// 인터페이스는 다른 인터페이스를 확장(상속)할 수 있음.
// 자바에서 클래스는 단일 상속만 가능하지만, 인터페이스는 다중 상속이 가능!
interface I extends E, F {}

// 인터페이스는 클래스를 확장할 수 없음.
// interface J extends A {} -> 문법 오류. 상위 인터페이스는 인터페이스만 가능.


interface Buyer {
	void buy(); // public abstract 메서드
	
	default void register() { // default (인스턴스) 메서드
		System.out.println("구매자 등록");
	}
}


interface Seller {
	void sell(); // public abstract 메서드
	
	default void register() { // default (인스턴스) 메서드
		System.out.println("판매자 등록");
	}
}

class User implements Buyer {
	@Override
	public void buy() {
		System.out.println("구매~");
	}
}

public class InterfaceMain03 {

	public static void main(String[] args) {
		User user1 = new User();
		user1.register();
		user1.buy();
	}

}
