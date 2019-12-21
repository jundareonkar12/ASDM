package utils;

import java.util.ArrayList;
import static utils.BankValidationRules.*;

import com.app.core.BankAccount;

import cust_exscs.BankHandlingException;

public class CollectionUtils {
	// a static method to return sample account in AL
	public static ArrayList<BankAccount> populateAccounts() {
		ArrayList<BankAccount> l1 = new ArrayList<>();
		try {

			l1.add(new BankAccount("bob-001", "abc", validateBalance(16000), parseNValidateDate("1-8-2018"),
					validateType("saving")));
			l1.add(new BankAccount("bob-008", "abc5", validateBalance(5000), parseNValidateDate("11-2-2019"),
					validateType("saving")));
			l1.add(new BankAccount("bob-003", "abc7", validateBalance(15000), parseNValidateDate("1-8-2018"),
					validateType("current")));

			l1.add(new BankAccount("bob-006", "abc4", validateBalance(150000), parseNValidateDate("21-3-2019"),
					validateType("current")));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return l1;
	}

	// write a static method to fetch acct details by acct no
	public static BankAccount getAccountByNo(String accNo, ArrayList<BankAccount> list) throws BankHandlingException {
		int index = list.indexOf(new BankAccount(accNo));
		if (index == -1)
			throw new BankHandlingException("Invalid acct no!!!!!");
		return list.get(index);
	}

}
