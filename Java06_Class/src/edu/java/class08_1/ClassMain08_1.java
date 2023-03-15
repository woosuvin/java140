package edu.java.class08_1;

public class ClassMain08_1 {

	public static void main(String[] args) {
		Account account1 = new Account(1111, 10000); // 계좌 생성
		account1.printInfo(); // 계좌 정보 출력
		
		Account account2 = new Account(2222, 10000); // 두번째 계좌 생성
		
		// 입금
		double balance = account1.deposit(1000); // account1 에 1000원 입금
		System.out.println("잔액: " + balance); // 입금 후 잔액
		
		// 출금
		account1.withdraw(20000); // 5000원 출금
		account1.printInfo();
		
		// 이체
		account1.transfer(account2, 20000); // acc1 -> acc2 5000원 이체, this - acc1, to - acc2
		account1.printInfo(); // 이체 후 acc1 계좌 정보
		account2.printInfo(); // 이체 후 acc2 계좌 정보
		
	}

}
