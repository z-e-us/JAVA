package Series;

import java.util.Scanner;

public class Automorphic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int num = sc.nextInt();
		int copy = num, digits =0,sq=num*num;
		while(num>0) {
			num=num/10;
			digits++;
		}
		if(sq%Math.pow(10,digits)==copy) {
			System.out.println("The number is Automorphic");
		}else {
			System.out.println("The number is not Automorphic");
		}
	}
}
