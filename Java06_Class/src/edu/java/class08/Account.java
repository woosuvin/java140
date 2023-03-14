package edu.java.class08;

/**
 * 은행 계좌 클래스.
 * 필드: 계좌번호, 잔액.
 * 메서드: 입금, 출금, 이체, 정보 출력.
 */
public class Account {
	//field
	int accountNo;
	double balance;
	
	// TODO: argument 2개를 갖는 생성자
	public Account(int accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
    /**
     * 입금(deposit)
     * 
     * @param amount 입금액(double).
     * @return 입금 후 잔액.
     */
	public double deposit(double amount) {
		System.out.println("입금액: " + amount);
		return balance += amount;
	}
	
    
    /**
     * 출금(withdraw)
     * 
     * @param amount 출금액(double).
     * @return 입금 후 잔액.
     */
	public double withdraw(double amount) {
		System.out.println("출금액: " + amount);
		return balance -= amount;
	}
    
    /**
     * 이체(transfer).
     * 
     * @param to 이체할 은행 계좌 객체(Accout 타입 객체).
     * @param amount 이체할 금액(double).
     * @return true.
     */
    // TODO
	public boolean transfer(Account to, double amount) {
		System.out.println("이체 계좌: " + to.accountNo);
		System.out.println(to.balance += amount);
		System.out.println("출금 계좌: " + accountNo);
		System.out.println(this.balance -= amount);
		return true;
	}
    
    /**
     * 정보 출력(printInfo).
     * 계좌 번호와 잔고를 출력.
     */
    //TODO
	public void printInfo() {
		System.out.println("계좌번호: " + accountNo + " 잔고: " + balance);
	}
}
