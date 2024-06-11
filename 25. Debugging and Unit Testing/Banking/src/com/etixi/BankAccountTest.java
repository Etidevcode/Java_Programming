package com.etixi;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BankAccountTest {

	private BankAccount account;
	private static int count;

	@org.junit.BeforeClass
	public static void beforeClass() {
		System.out.println("This executes before any test cases. Count = " + count++);
	}

	@org.junit.Before
	public void setup() {
		account = new BankAccount("Etienne","KOA", 1000.00, BankAccount.CHECKING);
		System.out.println("Running a test ....");
	}
	@org.junit.Test
	public void deposit() throws Exception{
		// fail("This test has yet to be implement");
		//BankAccount account = new BankAccount("Etienne","KOA", 1000.00, BankAccount.CHECKING);
		double balance = account.deposit(200.00, true);
		assertEquals(1200.00, balance, 0);
	}

	@org.junit.Test
	public void withdraw_branch() throws Exception {
		// fail("This test has yet to be implement");
		double balance = account.withdraw(600.00, true);
		assertEquals(400.00, balance, 0);

	}

	@org.junit.Test(expected =  IllegalArgumentException.class)
	public void withdraw_notBranch() throws Exception {
		/*try {
			account.withdraw(600.00, false);
			fail("Should have thrown an IllegalArgumentException");
		} catch (IllegalArgumentException e) {

		}*/
		account.withdraw(600.00, false);
		fail("Should have thrown an IllegalArgumentException");
		//double balance = account.withdraw(600.00, false);
		//assertEquals(400.00, balance, 0);
	}
	@org.junit.Test
	public void getBalance_deposit() throws Exception{
		// fail("This test has yet to be implement");
		//
		// BankAccount account = new BankAccount("Etienne","KOA", 1000.00, BankAccount.CHECKING);
		account.deposit(200.00, true);
		assertEquals(1200.00, account.getBalance(), 0);
	}

	@org.junit.Test
	public void getBalance_withdraw() throws Exception{
		// fail("This test has yet to be implement");
		// assertEquals(20, 21);
		// BankAccount account = new BankAccount("Etienne","KOA", 1000.00, BankAccount.CHECKING);
		account.withdraw(200.00, true);
		assertEquals(800.00, account.getBalance(), 0);
	}

	@org.junit.Test
	public void isChecking_true() {
		//BankAccount account = new BankAccount("Etienne","KOA", 1000.00, BankAccount.CHECKING);
		assertTrue("The account is NOT  a checking account",account.isChecking());

	}

	@org.junit.AfterClass
	public static void afterCalss() {
		System.out.println("This executes after any test cases. Count = " + count++);
	}

	@org.junit.After
	public void tearddown() {
		System.out.println("Count = " + count++);
	}

}

