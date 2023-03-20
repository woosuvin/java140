package edu.java.inheritance06;

class T {
	@Override // java.lang.object 클래스에서 상속한 toString 메서드를 override.
	public String toString() {
		// 객체를 문자열로(to String) 변환해서 리턴.
		return "T 타입 인스턴스";
	} // toString: printf를 보기 좋게 출력하기 위해 사용.
}

public class InheritanceMain06 {

	public static void main(String[] args) {
		// java.lang.object 클래스: 자바의 최상위 클래스.
		// 자바의 모든 클래스는 object의 protected 또는 public 멤버(메서드)를 오버라이드를 상속받아서
		// 사용 가능하고, 재정의(override) 할 수 있음.
		// object 클래스의 메서드 재정의: toString, equals, hashCode, ...
		
		// System.out.println(object x):
		// argument로 전달된 객체의 toString() 메서드가 리턴하는 문자열을 콘솔창에 출력.
		// 클래스를 정의할 때, toString() 메서드를 override해서 원하는 문자열이 출력될 수 있도록 할 수 있음.
		
		T t = new T();
		System.out.println(t);
		
		
		Point pt1 = new Point();
		System.out.println("pt1: " + pt1);
		// -> Point 클래스에서 toString() 메서드를 override하지 않으면,
		//    object 클래스에서 상속받은 toString() 메서드가 리턴하는 문자열을 콘솔창에 출력.
		// -> Point 클래스에서 toString() 메서드를 override(재정의) 하면,
		//    println은 Point 클래스에서 재정의된 toString 메서드가 리턴하는 문자열을 콘솔창에 출력.
		
		Point pt2 = new Point(0, 0);
		System.out.println("pt2: " + pt2);
		
		System.out.println("== 연산자: " + (pt1 == pt2));
		// == 연산자는 지역변수 pt1의 값과 pt2의 값을 비교.
		// 클래스 타입의 지역변수가 저장하는 값은 객체가 생성된 heap의 주소.
		System.out.println("equals 메서드: " + pt1.equals(pt2)); 
		// -> equals: 두 객체가 같은지 다른지 재정의하기 위한 메서드. 
		// -> equals() 메서드를 override하면, 두 객체가 같은지에 대한 정의를 새로 내릴 수 있음. 
		System.out.println(pt1.getClass());
		
		System.out.println("pt1 hashCode: " + pt1.hashCode());
		System.out.println("pt2 hashCode: " + pt2.hashCode());
		// -> equals가 true를 리턴하는 두 객체(pt1, pt2)는 hashCode() 리턴 값이 같다!		
		
		String s1 = new String("안녕하세요.");
		String s2 = new String("안녕하세요.");
		System.out.println("== 연산자: " + (s1 == s2));
		// -> 두 문자열이 생성된 주소값들을 비교.
		System.out.println("equals 메서드: " + s1.equals(s2));
		// -> java.lang.String클래스는 equals()를 override(재정의)하고 있음.
		// -> 문자열의 내용이 같은 지를 비교하도록 재정의.
		
		// 문자열을 비교할 땐 ==연산자 말고 equals를 쓰자.
		
	}

}
