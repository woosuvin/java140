package edu.java.exception06;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		System.out.println(N);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			System.out.print(arr[i]);
		}
		
		int count = 0;
		
		int v = scanner.nextInt();
		
		for (int x : arr) {
			if (x == v) {
				count++;
			}
		}
		System.out.println(count);
	}

}
