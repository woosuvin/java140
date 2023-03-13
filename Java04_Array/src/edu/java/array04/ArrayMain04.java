package edu.java.array04;

import java.util.Random;

public class ArrayMain04 {

	public static void main(String[] args) {
		// 정수 5개를 저장할 수 있는 배열을 선언. []
		// 0 이상 9 이하의 정수 난수 5개를 배열에 저장. for문
		// 배열의 내용을 출력.
		// 배열의 모든 원소의 합을 계산하고 출력. 합계 계산할 변수 선언
		// 배열 원소들의 평균을 double 타입을 계산하고 출력.
		
//		int[] numbers = new int[5];
//		
//		Random random = new Random();
//		
//		
//		for (int i = 0; i < numbers.length; i++) {
//			int x = random.nextInt(10);
//			numbers[i] = x;
//		}
//		for (int a : numbers) {
//			System.out.print(a + " ");
//		}
//		System.out.println();
//		
//		int sum = 0;
//		
//		
//		for (int a = 0; a < numbers.length; a++) {
//			
//			System.out.println(sum + " = " + sum + " + " + numbers[a]);
//			sum = sum + numbers[a];
//
//		}
//		System.out.print(sum);
//		
//		System.out.println();
//		
//		double avg = sum / 5.0;
//		System.out.println(avg);
		
		/*
		numbers[0] = random.nextInt(10);
		numbers[1] = random.nextInt(10);
		numbers[2] = random.nextInt(10);
		numbers[3] = random.nextInt(10);
		numbers[4] = random.nextInt(10);
		
		int sum = 0;
		for (i=0; i < numbers.length; i++) {
			sysout
		}
		*/		
		
		int[] numbers = new int[5];
		Random random = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(10);
		}
		for (int n : numbers) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		
		int sum = 0;
		for (int n : numbers) {
			sum += n;
		}
		System.out.println("sum = " + sum);
		
		double avg = sum / 5.0;
		System.out.println("avg = " + avg);
		
		

	}

}
