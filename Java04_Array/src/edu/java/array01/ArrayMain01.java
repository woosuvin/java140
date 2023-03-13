package edu.java.array01;

public class ArrayMain01 {

	public static void main(String[] args) {
		// 배열(array): 같은 타입의 데이터 여러개를 하나의 변수 이름으로 저장하기 위한 메모리 공간.
        // 인덱스(index): 배열에서 데이터가 저장된 위치를 나타내는 정수.
		//                배열의 인덱스는 0부터 시작.
		// 배열의 마지막 인덱스는 (배열 원소 개수 - 1).
		// 모든 배열은 배열의 길이(배열의 원소 개수)를 알려주는 length 속성을 가지고 있음.
		
		// 정수(int) 4개를 저장할 수 있는 배열 선언, 초기화.
		int[] scores = new int[4]; // 정수 4개를 저장할 수 있는 배열을 새로 만들겠다. [] -> int가 여러개 있다.
		
		// 배열의 특정 인덱스에 원소 저장(재할당)
		scores[0] = 100; // 100을 score 0번에 저장.
		scores[1] = 90;  // 90을 score 1번에 저장.
		scores[2] = 0;
		scores[3] = 50;
		
		// 배열의 특정 인덱스에 저장된 원소의 값 읽기
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		
		System.out.println("length = " + scores.length);
		
		for (int i = 0; i < scores.length; i++) {  // i = index, 인덱스는 배열의 길이보다 작을 때까지
			System.out.println(scores[i]);
		}
		
		System.out.println("-------------------------------");
		
		// 배열 선언 초기화 방법 2
		int[] numbers = {100, 90, 0, 50, 80};  // 중괄호 안 쉼표로 원소 구별됨. length는 {}중괄호 안 갯수로 결정됨.
		for (int i=0; i < numbers.length; i++) { 
			System.out.println(numbers[i]);
		}
		
		numbers[2] = 99; // 2번 인덱스의 값을 변경.
		for (int i=0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("-------------------------------");
		
		// 향상된 for문(enhanced for statement). for-each 구문. -> 배열 원소 변경 불가
		for (int x : numbers) { // 배열에서 꺼낸 원소를 저장하기 위한 변수 선언. (변수 선언 : 배열 이름)
			System.out.println(x);
		} 
		
	
		
		
		
		
		
	}

}
