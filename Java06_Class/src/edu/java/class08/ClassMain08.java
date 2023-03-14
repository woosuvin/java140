package edu.java.class08;

public class ClassMain08 {

	public static void main(String[] args) {
		Account account1 = new Account(110468, 50000);
		Account account2 = new Account(444410, 10000);
		
		
		System.out.println(account1.deposit(5000));
		
		System.out.println(account1.withdraw(3000));
		
		account1.transfer(account2, 20000);
		
		account1.printInfo();
	}

}
