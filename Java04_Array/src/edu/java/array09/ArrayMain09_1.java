package edu.java.array09;

import java.util.Random;

public class ArrayMain09_1 {

	public static void main(String[] args) {
		// 1차원 정수(int) 배열 3개를 갖는 2차원 배열을 선언.
		int[][] numbers = new int[3][];
		
		// 첫번째 배열에는 난수 2개, 두번째 배열에는 난수 3개, 세번째 배열에는 난수 4개 저장.
		// 저장하는 난수의 범위는 0 이상 100 이하.
//        numbers[0] = new int[2];
//        numbers[1] = new int[3];
//        numbers[2] = new int[4]; // 규칙 있음. 반복문 사용 가능.
		
		Random random = new Random();
		
        for (int i = 0; i < numbers.length; i++) {
        	numbers[i] = new int[i + 2];
        	for (int j = 0; j < numbers[i].length; j++) {
        		numbers[i][j] = random.nextInt(101);
        	}
        }
        
        // 2차원 배열의 원소들을 출력.
        for (int[] arr : numbers) {
        	for (int x : arr) {
        		System.out.print(x + "\t");
        	}
        	System.out.println();
        }
		
        // 2차원 배열의 모든 원소들의 합을 계산하고 출력.
        int sum = 0; // 배열의 원소들의 합을 저장하기 위한 변수
        int count = 0; // 배열의 원소들의 개수를 저장하기 위한 변수
        for (int[] arr : numbers) {
        	for (int x : arr) {
        		sum += x; // 배열에서 읽은 값은 합계에 더함.
        		count++; // 배열의 원소 개수는 1 증가.
        	}
        }
       System.out.println("sum = " + sum);
       System.out.println("count = " + count);
        
       // 2차원 배열의 모든 원소들의 평균을 계산하고 출력.
       double avg = (double)sum / count;
       System.out.println("average = " + avg);
       
       // 최댓값 찾고 출력.
       int max = numbers[0][0]; // 최댓값을 배열의 [0,0] 위치의 원소라고 가정
       for (int[] arr : numbers) { // 2차원 배열의 원소인 1차원 배열들에 대해서
    	   for (int x : arr) { // 그 1차원 배열의 각 원소(정수)들에 대해서
    		   max = (x > max) ? x : max; // 삼항연산자 사용    		   
    	   }
       }
       System.out.println("max = " + max);
       
       // 최솟값 찾고 출력.
       int min = numbers[0][0];
       for (int[] arr : numbers) {
    	   for (int x : arr) {
    		   min = (min > x) ? x : min;
    	   }
       }
       System.out.println("min = " + min);
       
       
        

        
        
        
        
	}

}
