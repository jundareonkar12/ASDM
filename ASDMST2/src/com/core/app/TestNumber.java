package com.core.app;

import java.util.Scanner;

public class TestNumber {

	private int number;

	public TestNumber(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int StoreNumber() {

		

		System.out.println("Enter the no. ");
		Scanner sc = new Scanner(System.in);
		this.number = sc.nextInt();
		if (number <= 0)
			number = 0;
		else {
			if (number >= 100)
				number = 100;
			return number;
		}
		return number;
	}
}
