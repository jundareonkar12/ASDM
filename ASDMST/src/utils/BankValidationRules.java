package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.app.core.AccType;

import cust_exscs.BankHandlingException;

public class BankValidationRules {
	public static final double MIN_BAL;
	// SDF
	public static SimpleDateFormat sdf;
	public static Date endDate;
	static {
		MIN_BAL = 1000;
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			endDate = sdf.parse("31-12-2019");
		} catch (ParseException e) {
			System.out.println("err in static inin block" + e);
		}
	}

	// validate balance rule
	public static double validateBalance(double bal) throws BankHandlingException {
		if (bal < MIN_BAL)
			throw new BankHandlingException("Insufficient funds!!!!");
		return bal;
	}

	// validate a/c type
	public static AccType validateType(String type) throws IllegalArgumentException {
		return AccType.valueOf(type.toUpperCase());
	}

	// accept date in string form -- convert it in Date & validate it.
	public static Date parseNValidateDate(String s) throws ParseException, BankHandlingException {
		// conversion from string --->Date
		Date d = sdf.parse(s);
		// validation rule : date must not be after end of curnt yr
		if (d.after(endDate))
			throw new BankHandlingException("Invalid date ");
		return d;
	}
}
