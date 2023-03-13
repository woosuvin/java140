package edu.java.loop09;

import java.util.Random;

public class LoopMain09 {

	public static void main(String[] args) {
        /* 문제 1. 아래와 같이 출력하세요.
        *
        **
        ***
        ****
        *****
      */
     
		for (int a = 1; a <= 5; a++) { // 줄 수
			for (int b = 1; a >= b; b++) {  // 별 출력할 횟수
				System.out.print("*");
			} 
			System.out.println();
		} 
		
		// Ctrl + Shift + F : 코드 포맷팅(자동 정렬)
		
		System.out.println("\n==========\n");
		
		int line = 1;
		while (line <= 5) {
			int count = 1;
			while (count <= line) {
				System.out.print("*");
				count++;
			}
			System.out.println();
			line++;
		}
		
		System.out.println("\n==========\n");
		
     /* 문제 2. 아래와 같이 출력하세요.
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
      */
		
		for (int a = 1; a <= 5; a++) {
			for (int b = 0; a > b; b++ ) {
				System.out.print("*");
			} 
			System.out.println();
		}
		for (int a = 5; a > 1; a--) {
			for (int b = 1; a > b; b++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		
		System.out.println("\n==========\n");
		
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; x >= y; y++) {
				System.out.print("*");
			}
			System.out.println();
		} // 1~5
//		for (int x = 4; x >=1; x--) {
//			for (int y = 1; x >= y; y++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		} // 4~1
		for (int x =1; x <= 4; x++) {
			for (int y = 4; x <= y; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
				
		System.out.println("\n==========\n");
		
		for (int x = 6; x <= 9; x++) {
			for (int y = 4; y >= x - 5; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n==========\n");
		
		for(int x = 1; x <= 9; x++) {
			if (x <= 5) { // *을 하나씩 늘려나감.
				for (int y = 1; y <= x; y++) {
					System.out.print("*");
				}
			} else { // *을 하나씩 줄여나감.
				for (int y = 4; y >= x - 5; y--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n==========\n");

     /* 문제 3. 주사위 2개를 던졌을 때 나오는 주사위 눈을 (x, y) 형식으로 출력하세요.
        두 눈의 합이 5가 되면 출력을 멈추세요.
        힌트: Random 타입의 nextInt(start, end) 메서드를 사용. (1, 7) 무한루프, 적절한 순간에 break
        힌트 1: Random 타입의 nextInt(start, end) 메서드를 사용.
        힌트 2 무한 루프: for ( ; ; ) {...}, while (true) {...}
        출력 결과 예시:
        (2, 4)
        (6, 1)
        (3, 3)
        (4, 1)
      */

		Random random = new Random();	
//		System.out.printf("(%d, %d)\n", x, y);
		
		while (true) {
			int x = random.nextInt(1, 7);
			int y = random.nextInt(1, 7);
			System.out.printf("(%d, %d) ", x, y);
			if (x + y == 5) {
				break;
			}
		}
		
		System.out.println("\n==========\n");
		
		for ( ; ; ) {
			int a = random.nextInt(1, 7);
			int b = random.nextInt(1, 7);
			System.out.printf("(%d, %d) ", a, b);
			if (a + b == 5) {
				break;
			}
		}
		
		System.out.println("\n==========\n");
		
		// int x = random.nextInt(6) + 1; -> 0~5 + 1
		// int x = random.nextInt(1, 7); -> 1~6
		
		for(;;) { // 무한반복문, = while(true) {
			int dice1 = random.nextInt(6) + 1;
			int dice2 = random.nextInt(6) + 1;
			System.out.printf("(%d, %d) ", dice1, dice2);
			if (dice1 + dice2 == 5) {
				break;
			}
		}
		
		
		
		
		
	}

}
