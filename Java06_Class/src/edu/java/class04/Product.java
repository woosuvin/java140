package edu.java.class04;

// 클래스의 멤버들:
// (1) 필드(멤버 변수)
// (2) 생성자
// (3) 메서드
public class Product {
	// 필드
	int productId; // 상품 아이디(코드)
	String productName; // 상품 이름
	int productPrice; // 상품 가격
	
	// 생성자: 
	// (1) 기본 생성자
	public Product () {}
	
	// (2) argument 3개를 갖는 생성자
	public Product (int productId, String productName, int productPrice) {
		this.productId = productId; // this. -> 필드와 parameter를 구분.
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	// (3) productId, productName을 argument로 갖는 생성자 , 기본값 0
	public Product (int productId, String productName) {
		this(productId, productName, 0); // this. -> 같은 클래스 내 다른 생성자 의미.
	}
	
	
	// 메서드:
	// (1) printProductInfo: 상품의 모든 정보를 콘솔에 출력
	public void printProductInfo () {
		System.out.printf("ID: %d, NAME: %s, PRICE: %d \n", 
				this.productId, this.productName, this.productPrice);
		// 필드가 지역 변수 이름과 혼동되지 않으며 this 생략 가능.
	}
	
	
	// (2) setProductPrice: 상품의 가격을 전달받은 값으로 변경하는 메서드 (리턴 아님!! 변경만 하는 것)
	public void setProductPrice (int productPrice) {
		System.out.printf("ID: %d, NAME: %s, PRICE: %d \n", productId, productName, productPrice);
//		this.productPrice = productPrice;
	}
	
	
}
