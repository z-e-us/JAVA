package Basic;

import java.util.Scanner;

public class CuEx extends Exception {
	CuEx(String str) {
		super(str);
	}

	public static void Show(int age, String place, String name) throws CuEx {
		if (age >= 18) {
			throw new CuEx(name + " eligible to vote at " + place);
		} else if (age == 17) {
			throw new CuEx(name + " eligible to vote next year at " + place);
		} else {
			throw new CuEx(name + " not eligible to vote at " + place);
		}
	}

	public static void main(String[] args) {
		System.out.println("Applicatoin to check your eligibility to vote");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name:-");
			String name = sc.next();
			System.out.println("Enter age:-");
			int age = sc.nextInt();
			System.out.println("Enter Place:-");
			String place = sc.next();
			Show(age, place, name);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Thank you for using the application");
		}
	}
}
