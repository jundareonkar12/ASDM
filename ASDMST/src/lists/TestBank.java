package lists;

import static utils.BankValidationRules.parseNValidateDate;
import static utils.BankValidationRules.validateBalance;
import static utils.BankValidationRules.validateType;
import static utils.CollectionUtils.getAccountByNo;
import static utils.CollectionUtils.populateAccounts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.app.core.AccType;
import com.app.core.BankAccount;

import cust_exscs.BankHandlingException;
import custom_comp.BankAccountBalanceComparator;
import custom_comp.BankAccountDateBalComparator;

public class TestBank {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated AL from utils
			ArrayList<BankAccount> accts = populateAccounts();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Options 1: Create A/C \n " + "2 : Display all accts \n"
							+ "3 : A/C summary \n 4:Funds Transfer \n10 : Exit");
					System.out.println("Enter option");

					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter acct details no nm bal date type");
						accts.add(new BankAccount(sc.next(), sc.next(), validateBalance(sc.nextDouble()),
								parseNValidateDate(sc.next()), validateType(sc.next())));

						break;
					case 2:
						System.out.println("Account details");
						for (BankAccount a : accts)
							System.out.println(a);

						break;
					case 3:
						System.out.println("Enter acct no");
						System.out.println(getAccountByNo(sc.next(), accts));
						break;
					case 4:
						System.out.println("Enter src & dest acct no & transfer amount");
						BankAccount src = getAccountByNo(sc.next(), accts);
						BankAccount dest = getAccountByNo(sc.next(), accts);
						src.transferFunds(dest, sc.nextDouble());
						System.out.println("funds transferred...");
						break;
					case 5:
						System.out.println("Enter acct no to close a/c");
						if (!accts.remove(new BankAccount(sc.next())))
							throw new BankHandlingException("A/C closing failed : Invalid acct no ");
						System.out.println("A/c closed...");
						break;
					case 6:
						// 6. Sort the account as per account no
						// Collections ---
						// public static void sort(List<T> list)
						Collections.sort(accts);
						System.out.println("sorted accts a sper acct no");
						for (BankAccount a : accts)
							System.out.println(a);

						break;
					case 7 :
						//7. Sort the account as per account balance(w/o touching UDT)
						System.out.println("Accts sorted as per balance");
						//Collections.sort(l1,instance of the cls that imple Comparator<T>
						Collections.sort(accts,new BankAccountBalanceComparator());
						for (BankAccount a : accts)
							System.out.println(a);

						break;
					case 8:
						//8. Sort the account as per account creation date & balance
						System.out.println("Accts sorted as per date n balance");
						Collections.sort(accts, new BankAccountDateBalComparator());
						for (BankAccount a : accts)
							System.out.println(a);

						break;
					case 9: 
						//9. Apply interest to all specified type of a/cs (eg :saving or FD) 
						System.out.println("Enter account type to apply interest");
						AccType type=validateType(sc.next());
						for(BankAccount a : accts)
							if(type.equals(a.getAcType()))
								a.applyInterest();
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();// clear scanner's buffer till new line
			}
		}

	}

}
