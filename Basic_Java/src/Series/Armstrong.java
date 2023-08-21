package Series;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :- ");
	int num = sc.nextInt();
	int copy=num , count=0,sum=0,rem=0;
	while(num>0) {
		num=num/10;
		count++;
	}
	num=copy;
	while(num>0) {
		rem = num%10;
		sum = (int) (sum + Math.pow(rem, count));
		num=num/10;
	}
	if (sum == copy) {
		System.out.println(copy +" is Armstrong number");
	}
	else {
		System.out.println(copy +" is not Armstrong number");
	}
}
}
