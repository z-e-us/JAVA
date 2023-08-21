package Series;

import java.util.Scanner;

public class Peterson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int num = sc.nextInt();
		int copy = num,fact=1,sum=0,rem=0;
		while(num>0) {
			rem=num%10;
			fact=1;
			for(int i=rem;i>=1;i--) {
				fact*=i;
			}
			sum+=fact;
			num=num/10;
		}
		if (sum==copy) {
			System.out.println("Peterson number");
		}else {
			System.out.println("Not peterson number");
		}
	}
}
