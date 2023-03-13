package edu.java.array03;

public class ArrayMain03 {

	public static void main(String[] args) {
		// Ex 1. 
		// 정수(int)10개를 저장할 수 있는 배열 선언.
		// 배열에 순서대로 0, 2, 4, 6, 8, 10, ... , 18을 저장.
		// 배열의 원소들을 한 줄로 출력.
		
		/*
		   int[] numbers = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
		for (int n : numbers) {
			System.out.print(n + " ");
		}
		*/
		
		/*
		int[] numbers = new int[10];
		
		for (int n : numbers) {
			for (int x=0; x<20; x+=2) {
				System.out.print(n);
			}
		}
		*/
		
		int[] evens = new int[10];
				
		for (int i = 0; i < evens.length; i++) {
			evens[i] = i * 2;
		}
		
		for (int x : evens) {
			System.out.print(x + " ");
		}		
		
		System.out.println();
		
		// Ex 2. 
		// boolean 10개를 저장할 수 있는 배열 선언.
		// 배열에 순서대로 true, false, true, false, ... , false 저장.
		// 배열의 원소들을 한 줄로 출력.
		
		
		/*
		boolean[] a = new boolean[10];
		
		for (int i = 0; i < a.length; i+=2) {
			a[i] = true;
		} 
		for (int i = 1; i < a.length; i+=2) {
			a[i] = false;
		}

		for (boolean x: a) {
			System.out.print(x + " ");
		}
		*/
		
		boolean[] text = new boolean[10];
		
		for (int i = 0; i < text.length; i++) {
			if (i % 2 == 0) {
				text[i] = true;
			} else {  // else 블록 생략 가능
				text[i] = false;
			}
		}
		for (boolean b : text) {
			System.out.print(b + " ");
		}
		
		
		
	}

}
