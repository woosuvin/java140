package edu.java.lambda02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LambdaMain02 {

	public static void main(String[] args) {
		Random random = new Random();
		
//		ArrayList<Integer> numbers = new ArrayList<>();
//		for (int i = 0; 1 < 10; i++) {
//			numbers.add(random.nextInt(100));
//		}
//		System.out.println(numbers);
//		
//		for (Integer x : numbers) {
//			System.out.print(x + " ");
//		}
//		
//		numbers.forEach(x -> System.out.print(x + " "));
		
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(100));
		}
		numbers.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		
		// list numbers에서 짝수들만 선택해서 새로운 리스트에 저장하고 출력.
		ArrayList<Integer> evens = new ArrayList<>();
		for (Integer x : numbers) {
			if (x % 2 == 0) {
				evens.add(x);
			}
		}
		System.out.print(evens);
		System.out.println();
		
		List<Integer> evens2 = numbers.stream() // 리스트의 원소들이 순서대로 흘러가는 통로
				.filter(x -> x % 2 == 0)        // 조건을 만족하는 원소들만 필터링
				.toList();                      // 필터링된 결과를 리스트로 만듦
		System.out.print(evens2);
		System.out.println();
		// filter 메서드의 argument:
		// parameter 1개이고, return 타입이 boolean인 functionalInterface 객체를 전달.
		
		
		// list numbers에서 홀수들의 제곱을 저장하는 리스트를 만들고 출력.
		ArrayList<Integer> oddSquares = new ArrayList<>();
		for (Integer x : numbers) {
			if (x % 2 == 1) {
				oddSquares.add(x * x);
			}
		}
		System.out.println(oddSquares);
		
		List<Integer> oddSquares2 = numbers.stream() // 리스트의 원소들이 순서대로 흘러가는 통로
				.filter(x -> x % 2 == 1)             // 조건을 만족하는 원소들만 필터링
				.map(x -> x * x)                     // 값을 다른 값으로 매핑(변환)
				.toList();                           // 결과를 리스트로 저장
		System.out.println(oddSquares2);
		// map 메서드의 argument:
		// parameter 1개이고, return값이 있는(void가 아닌) FunctionalInterface 객체.
		
		
		// 리스트 languages에서 5글자 이상인 문자열을 소문자로 변환한 문자열을 원소로 갖는 리스트를 만들고 출력.
		List<String> languages = Arrays.asList("Java", "SQL", "JavaScript", "Python");
		
		List<String> result = languages.stream().filter(x -> x.length() >= 5).map(x -> x.toLowerCase()).toList();
		System.out.println(result);
		
		List<String> result2 = new ArrayList<>();
		for (String x : languages) {
			if (x.length() >= 5) {
				result2.add(x.toLowerCase());
			}
		}
		System.out.println(result2);
		
	}

}
