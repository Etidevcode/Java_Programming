package com.etienne;




public class Main {

	public static void main(String[] args) {

		Account etiAccount  = new Account("Etienne");
		etiAccount.deposit(1000);
		etiAccount.withdraw(500);
		etiAccount.withdraw(-200);
		etiAccount.deposit(-20);
		etiAccount.calculateBalance();
		etiAccount.balance = 5000;

		System.out.println("Balance on account is " + etiAccount.getBalance());
		etiAccount.transactions.add(4500);
		etiAccount.calculateBalance();
	}
}
