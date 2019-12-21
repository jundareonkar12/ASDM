package custom_comp;

import java.util.Comparator;

import com.app.core.BankAccount;

public class BankAccountDateBalComparator implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		System.out.println("in compare : date & bal");
		int ret=o1.getCreationDate().compareTo(o2.getCreationDate());
		if(ret != 0)
			return ret;
		return ((Double)o1.getBalance()).compareTo(o2.getBalance());
	}

}
