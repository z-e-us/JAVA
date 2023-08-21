package Basic;

import java.util.Scanner;

public class Ex {
	public void check (int age,String place,String name) throws ArithmeticException{
		if (age>= 18) {
			throw new ArithmeticException(name+" is eligible to vote at "+place);
		}
		if (age== 16) {
			throw new ArithmeticException(name+" is  eligible to vote at "+place+" next year");
		}
		if (age<= 16) {
			throw new ArithmeticException(name+" is not eligible to vote at "+place);
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
		
		Ex obj = new Ex();
		obj.check(age,place,name);
		}
		catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Thank you for using the application");
		}
		
	}
}
