package Series;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int num = sc.nextInt();
		int copy = num,digit=0,rev=0;
		while(copy>0) {
			digit=copy%10;
			rev=rev*10+digit;
			copy=copy/10;
		}
		if(rev == num) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}
	}
}
