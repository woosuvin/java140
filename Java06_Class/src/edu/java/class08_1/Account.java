package edu.java.class08_1;

/**
 * 은행 계좌 클래스.
 * 필드: 계좌번호, 잔액.
 * 메서드: 입금, 출금, 이체, 정보 출력.
 */
public class Account {
	// field
	int accountNo; // 계좌번호
	double balance; // 잔고
	
	// 생성자 constructor (argument 2개)
	public Account(int accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	// method
    /**
     * 입금(deposit)
     * 
     * @param amount 입금액(double).
     * @return 입금 후 잔액.
     */
	public double deposit(double amount) {
		this.balance += amount;
		return this.balance;
	}
	
    /**
     * 출금(withdraw)
     * 
     * @param amount 출금액(double).
     * @return 입금 후 잔액.
     */
	public double withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
		} else {
			System.out.println("출금 불가 (잔액 부족)");
		}
		return this.balance;
	}
	
    /**
     * 이체(transfer).
     * 
     * @param to 이체할 은행 계좌 객체(Accout 타입 객체). account라는 클래스의 객체가 to라는 변수로 전달된다.
     * @param amount 이체할 금액(double).
     * @return true.
     */
	public boolean transfer(Account to, double amount) {
//		this.balance -= amount; (1) 내 계좌에서 출금 
//		to.balance += amount; (2) 상대 계좌에 입금
		if (this.balance >= amount) {
		this.withdraw(amount);
		to.deposit(amount);
		} else {
			System.out.println("이체 불가 (잔액 부족)");
		}
		return true;
	}
	
    /**
     * 정보 출력(printInfo).
     * 계좌 번호와 잔고를 출력.
     */
	public void printInfo() {
		System.out.printf("계좌 번호: %d, 잔액: %f \n", this.accountNo, this.balance);
	}
	
}
