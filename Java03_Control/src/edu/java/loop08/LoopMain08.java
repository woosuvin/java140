package edu.java.loop08;

public class LoopMain08 {

	public static void main(String[] args) {
		// 구구단 2단은 2x2까지, 3단은 3x3까지, 4단은 4x4까지, ... , 9단은 9x9까지
		
		
		// 1. for-for break사용
		for (int x = 2; x < 10; x++) {
			System.out.println("--- " + x + " 단 ---");
			for (int y = 1; y < 10; y++) {
				System.out.printf("%d X %d = %d\n", x, y, x*y);
				if (y == x) 
					break;
			} // end for (y)
		} // end for (x)
		
		System.out.println("\n===========\n");
		
		// 2. for-for break사용x
		for (int x = 2; x < 10 ; x++) {
			System.out.println("--- " + x + " 단 ---");
			for (int y = 1; y <= x; y++) {
				System.out.printf("%d X %d = %d\n", x, y, x*y);
			}
		}
		
		System.out.println("\n===========\n");
		
		// 3. while-while break사용
		int a = 2;
		while (a < 10) {
			System.out.println("--- " + a + " 단 ---");
			int b = 1;
			while (b < 10) {
				System.out.printf("%d X %d = %d\n", a, b, a*b);
				b++;
				if (a < b)
					break;  // 순서 중요
			}
			a++;	
		}
		
		System.out.println("\n===========\n");
		
		// 4. while-while break사용x
		a = 2;
		while (a < 10) {
			System.out.println("--- " + a + " 단 ---");
			int b = 1;
			while (b <= a) {
				System.out.printf("%d X %d = %d\n", a, b, a*b);
				b++;
			}
			a++;
		}
		
		

	}

}
