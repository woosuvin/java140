package edu.java.exception06;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		for (int i = N; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

	}

}
