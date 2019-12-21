package test_enums;

import static test_enums.Test.*;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter favourite color : " + "Choose among " + Arrays.toString(Colors.values()));
			Colors c = Colors.valueOf(sc.next());
			switch (c) {
			case RED:
				System.out.println("red");
				break;
			case BLUE:
				System.out.println("blue");
				break;

			case GREEN:
				System.out.println("green @ "+c.ordinal());
				break;


			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
