package tester;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.core.BankAccount;

import cust_exscs.BankHandlingException;

public class JunitTester {
	
BankAccount bk = new BankAccount("123", "Nitin", 3000);
BankAccount bk1 = new BankAccount("124", "Nitin1", 5000);
BankAccount bk2;
	@Before
	public void setUp() throws Exception {
		System.out.println("Before testing");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After testing");
	}

	/*
	 * @Test public void testWithdraw() { fail("Not yet implemented"); }
	 */

	@Test
	public void testWithdraw1() {
		try {
			bk.withdraw(400);
			assertEquals(2600.0f,bk.getBalance(),0);
		} catch (BankHandlingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test(expected = BankHandlingException.class)
	public void testWithdraw2() throws BankHandlingException{
			bk.withdraw(50000.67);
			assertEquals(2499,bk.getBalance(),0);	
	}
	@Test
	public void testdeposit() {
		bk.deposit(5000);
		assertEquals(8000, bk.getBalance(),0);
	}
	@Test
	public void testtransferFunds() {
		try {
			bk1.transferFunds(bk,2000);
			assertEquals(3000.0f,bk1.getBalance(),0);
		} catch (BankHandlingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testtransferFunds1() {
		try {
			bk.transferFunds(bk1,2000);
			assertEquals(1000.0f,bk.getBalance(),0);
		} catch (BankHandlingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test(expected = BankHandlingException.class)
	public void testtransferFunds2() throws BankHandlingException{
		
			bk.transferFunds(bk2,2000);
			assertEquals(3000.0f,bk2.getBalance(),0);
		
		}
}
