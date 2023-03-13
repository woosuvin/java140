package edu.java.loop02;

public class LoopMain02 {

	public static void main(String[] args) {
		// 복합 할당 연산자: +=, -=, *=, /=, %=, ...
		int x = 10;
//		x = x + 1;
		x += 2;
		System.out.println("x=" + x);
		
		// System.out.println: print line. 출력하고 줄 바꿈.
		System.out.println("test");
		
		// System.out.print: 출력하고 줄 바꿈이 일어나지 않음. 출력이 끝난 위치에 커서 위치함.
	    System.out.print("test1");
	    System.out.print("test2");
	    System.out.println("test3");
	    
	    // 0 2 4 6 8 10
	    // 0~10 까지의 짝수들을 한 줄에 출력
	    // (1)
	    for (int n = 0; n <= 10; n += 2) {
	    	System.out.print(n + " ");
	    }
	    System.out.println(); // 줄바꿈
	    // (2)
	    for (int n = 0; n <= 5; n++) {
	    	System.out.print((2*n) + " ");
	    }
	    System.out.println();
	    // (3)
	    for (int n = 0; n <= 10; n++) {
	    	if (n % 2 ==0) {
	    		System.out.print(n + " ");
	    	}
	    }
	    System.out.println();
	}

}
