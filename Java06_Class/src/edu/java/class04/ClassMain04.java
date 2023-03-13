package edu.java.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		// 기본 생성자를 사용해서 Product 타입의 객체 생성.
		Product product1 = new Product();
		product1.printProductInfo();
		product1.setProductPrice(2000);
		
		// argument 3개를 갖는 생성자를 호출해서 Product 타입의 객체를 생성.
		Product product2 = new Product(980605, "커피", 1500);
		product2.printProductInfo();
		product2.setProductPrice(3000);
		
		// argument 2개를 갖는 생성자를 호출해서 Product 타입의 객체를 생성.
		Product product3 = new Product(980605, "커피");
		product3.printProductInfo();
		product3.setProductPrice(4000);
//		product3.setProductPrice(1500);
//		product3.printProductInfo();
	}

}
