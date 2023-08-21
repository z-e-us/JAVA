package Oops;
import java.util.Scanner;
public class Cal1 implements Calculation {
Scanner sc = new Scanner(System.in);

	public int add() {
		System.out.println("Enter 2 numbers for addition");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		return c;
	}

	public int subtract() {
		System.out.println("Enter 2 numbers for substraction");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a-b;
		return c;
	}

}
