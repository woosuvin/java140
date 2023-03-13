package edu.java.loop10;

import java.util.Scanner;

public class LoopMain10 {

	public static void main(String[] args) {
		// 교재 연습문제 7번
		
		
		boolean run = true; // 프로그램을 계속 실행할 지, 종료할 지를 결정할 변수.
		int balance = 50000; // 은행 예금 잔고.
		Scanner scanner = new Scanner(System.in); // 괄호 안에 System.in 써줘야됨.
		
		while (run) { // 무한루프
			System.out.println("---------------------------------------");
			System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------------");
			System.out.print("선택>>> ");
			
			int menu = scanner.nextInt();
			
			switch (menu) {
			case 1: 
				System.out.print("예금액: ");
				int money = scanner.nextInt();
				balance += money; // balance = balance + money;
				break;
			case 2:
				System.out.print("출금액: ");
				int money2 = scanner.nextInt();
				balance -= money2; // balance = balance - money2;
				break;
			case 3: 
				System.out.println("잔고: " + balance);
				break;
			case 4:
				run = false; 
				break; // switch문을 종료. 
			default:
				System.out.println("-메뉴를 잘못 입력했습니다. 다시 선택하세요.-");
			}
			
		}

		System.out.println("프로그램 종료");
		
		

	}

}
