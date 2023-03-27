package edu.java.list02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class ListMain02 {

	public static void main(String[] args) {
		// 정수를 저장하는 LinkedList 타입 객체 생성.
		// List의 원소 타입은 자바의 기본 타입을 사용할 수 없음! List<int> (x)
		// 기본 타입 대신에 Wrapper 클래스를 사용해야 함! List<Integer> (o)
		LinkedList<Integer> numbers = new LinkedList<>();
		
		// LinkedList와 ArrayList는 원소 추가(add)/삭제(remove)/검색(get) 메서드 이름과 사용법이 동일.
		
		// 리스트 numbers에 [0, 100) 0이상 100미만 범위의 정수 난수 20개 저장.
		Random random = new Random();
		
		for (int i = 0; i < 20; i++) {
//			numbers.add(random.nextInt(100));
			numbers.add((int)(Math.random()*100));
		}
		
		// 리스트 numbers의 내용 출력.
		System.out.println(numbers);
	
		// 홀수들만 저장할 LinkedList 변수(odds) 선언, 객체 생성.
		LinkedList<Integer> odds = new LinkedList<>();
		
		// numbers의 정수들 중 홀수들만 odd에 저장.
//		for (int i = 0; i < numbers.size(); i++) {
//			if (numbers.get(i) % 2 == 1) {
//				odds.add(numbers.get(i));
//			}
//		}
		for (Integer x : numbers) { // 리스트 numbers의 원소들을 처음부터 끝까지 순회하면서
			if (x % 2 == 1) {
				odds.add(x);
			}
		}
		
		// 리스트 odds의 내용을 출력.
		System.out.println(odds);
		
		// LinkedList 변수(evenSquares) 선언, 객체 생성.
		LinkedList<Integer> evenSquares = new LinkedList<>();
		
		// evenSquares에는 numbers의 숫자들 중 짝수들의 제곱을 저장.
//		for (int i = 0; i < numbers.size(); i++) {
//			if (numbers.get(i) % 2 == 0) {
//				evenSquares.add(numbers.get(i) * numbers.get(i));
//			}
//		}
		for (Integer x : numbers) {
			if (x % 2 == 0) {
				evenSquares.add(x * x);
			}
		}
		
		// 리스트 evenSquares의 내용을 출력.
		System.out.println(evenSquares);
		
		// Iterator 사용.
		Iterator<Integer> itr = evenSquares.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
