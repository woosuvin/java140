package edu.java.loop06;

public class LoopMain06 {

	public static void main(String[] args) {
		// do-while 반복문
		int n = 1;
		do {
			System.out.print(n + "\t");
			n++;
		} while (n <= 10); // 세미콜론 필수
		
		System.out.println();
		
		/*
		do {
		    int n = 1;                 -> 중괄호 안에서만 사용 가능, while 조건식에 사용x.
			System.out.print(n + "\t");
			n++;
		} while (n <= 10);
		
		int n;
		do {
		    n = 1;                     -> 무한루프.
			System.out.print(n + "\t");
			n++;
		} while (n <= 10);
		
	    int n = 1;
		do {
			n++;                       -> 2 ~ 11 출력됨.
			System.out.print(n + "\t");
		} while (n <= 10);
		*/
		
		// do-while문은 반복 여부를 검사하기 전에 무조건 블록을 한 번 실행함!!
		// for문, while문은 블록 실행 전 반복 여부를 먼저 검사하고, 조건이 참이면 블록을 실행함!!
		
		n = 1;
		while (n > 5) {               // 검사를 먼저 함, false이므로 끝. 
			System.out.print(n + "\t");
			n++;
		}
		System.out.println();
		
		n = 1;
		do {
			System.out.println(n + "\t");
			n++;
		} while (n > 5);     // 2는 5보다 크지 않으므로 false, 1만 출력하고 끝.
		System.out.println();
		
		
	}

}
