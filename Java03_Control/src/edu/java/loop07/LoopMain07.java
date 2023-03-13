package edu.java.loop07;

public class LoopMain07 {

	public static void main(String[] args) {
		// 2중 반복문
		for (int dan = 2; dan < 10; dan++) {
			System.out.println("--- " + dan + " 단 ---");
			for (int n = 1; n < 10; n++) {  // <- 이 조건을 만족할 때 까지 반복 후 첫 for문으로 돌아감.
//				System.out.println(dan + " x " + n + " = " + (dan * n));
				System.out.printf("%d x %d = %d\n", dan, n, dan * n);  //%d 정수, %f 실수, %S 문자열, \n 줄바꿈
			} // end for (n)
		} // end for (dan)
		
		System.out.println("\n==========\n");
		
		// while문을 사용한 구구단 출력
		
		/*int dan = 2;
		while (dan < 10) {
			System.out.println("---" + (dan) + "단---");
			dan++;                                      -> 여기서 조건 변경
			int n = 1;
			while (n < 10) {
				System.out.printf("%d X %d = %d\n", dan, n, (dan*n));
				n++;
			}
		}*/
		
		
		/*int dan = 1;
		while (dan < 9) {
			System.out.println("---" + (dan+1) + "단---"); ->
			dan++;
			int n = 1;
			while (n < 10) {
				System.out.printf("%d X %d = %d\n", dan, n, (dan*n));
				n++;
			}
		}*/
		
		
		int dan = 2;
		while (dan < 10) {
			System.out.println("--- " + dan + " 단 ---");
			int n = 1;
			while (n < 10) {
				System.out.printf("%d X %d = %d\n", dan, n, (dan*n));
				n++;
			}
			dan++;
		}
		
		System.out.println("\n==========\n");
		
		// 선생님 풀이
		int x = 2;
		while (x < 10) {
			System.out.println("--- " + x + " 단 ---");
			
			// 구구단 출력
			int y = 1;
			while (y < 10) {
				System.out.printf("%d X %d = %d\n", x, y, (x*y));
				y++;
			}
			
			x++;
		}
		
		
		

		}

	}


