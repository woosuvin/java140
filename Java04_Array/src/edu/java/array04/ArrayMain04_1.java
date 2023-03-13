package edu.java.array04;

import java.util.Random;

public class ArrayMain04_1 {

	public static void main(String[] args) {
		// 선생님 풀이
		
		// 정수 5개를 저장할 수 있는 배열을 선언. []
		int[] numbers = new int[5];
		
		// 0 이상 9 이하의 정수 난수 5개를 배열에 저장.
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {  // 원소가 배열 저장됨 (아래에서 다른 변수로 다시 저장하면 다른값 나옴)
			numbers[i] = random.nextInt(10);
		}
		
		// 배열의 내용을 출력.
		for (int x : numbers) { 
			System.out.print(x + " ");
		}
		System.out.println();
		
		// 배열의 모든 원소의 합을 계산하고 출력. 합계 계산할 변수 선언
		int sum = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i]; // sum = sum + numbers[i];
////			System.out.println("sum = " + sum); -> 계산 중간과정 확인 가능
//		}
//		System.out.println("sum = " + sum); // 마지막 결과 확인 가능
		
		for (int x : numbers) {
			sum += x;
		}
		System.out.println("sum = " + sum);
		
		// 배열 원소들의 평균을 double 타입을 계산하고 출력.
		double avg = (double) sum / numbers.length; // sum 값 casting 후 원소의 길이만큼 나눔.
		System.out.println("avg = " + avg);
		
		// 배열의 원소들 중 최댓값을 찾고 출력.
		int max = numbers[0]; // 배열의 첫번째(인덱스 0번 위치의) 원소를 최댓값이라고 가정.
		for (int x : numbers) { // 배열 numbers의 모든 원소들을 순서대로 반복하면서
			if (x > max) { // 배열에서 읽은 값이 max보다 크다면
				max = x; // max의 값을 x로 변경.
			}
		}
		System.out.println("max = " + max);
		
		
		// 배열의 원소들 중 최솟값을 찾고 출력.
		int min = numbers[0]; // 배열의 첫번째 원소를 최솟값이라고 가정.
		for (int x : numbers) { // 배열의 모든 원소들을 순서대로 반복하면서
			if (x < min) { // 배열에서 읽은 값이 min보다 작다면
				min = x; // min의 값을 x로 변경
			}
		}
		System.out.println("min = " + min);
		
		
		
		
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = random.nextInt(10);
//		}
//		
//		for (int a : numbers) { 
//			System.out.print(a + " ");
//		}
//		System.out.println();
//		
//		max = numbers[0];
//		for (int z : numbers) {
//			if (z > max) {
//				max = z;
//			}
//		}
//		System.out.println("max = " + max);
		
		
	}

}
