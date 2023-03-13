package edu.java.array09;

import java.util.Random;

public class ArrayMain09 {

	public static void main(String[] args) {
        // 1차원 정수(int) 배열 3개를 갖는 2차원 배열을 선언.
		int[][] array = new int [3][];
		
        // 첫번째 배열에는 난수 2개, 두번째 배열에는 난수 3개, 세번째 배열에는 난수 4개 저장.
        // 저장하는 난수의 범위는 0 이상 100 이하.
		array[0] = new int [2];
		array[1] = new int [3];
		array[2] = new int [4];
		
		Random random = new Random();
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(101);
			}
		}
		
        // 2차원 배열의 원소들을 출력.
		for (int group[] : array) {
			for (int n : group) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
        // 2차원 배열의 모든 원소들의 합을 계산하고 출력.
		int sum = 0;
		for (int group[] : array) {
			for(int n : group) {
				sum += n;
			}
		}
		System.out.println("sum = " + sum);
		
        // 2차원 배열의 모든 원소들의 평균을 계산하고 출력.
		double avg = sum / 9.0;
		System.out.println("avg = " + avg);
		
        // 최댓값을 찾고 출력.
		int max = array[0][0];
		for (int group[] : array) {
			for (int x : group) {
				if (max < x) {
					max = x;
				}
			}
		}
		System.out.println("max = " + max);
		
        // 최솟값을 찾고 출력.
		int min = array[0][0];
		for (int group[] : array) {
			for (int x : group) {
				if (min > x) {
					min = x;
				}
			}
		}
		System.out.println("min = " + min);
		

		

		

		

		

		

		

		
		
		
		

	}

}
