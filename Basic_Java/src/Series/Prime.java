package Series;
import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number - ");
	int count =0;
	int num = sc.nextInt();
	for (int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
	}
	if (count==2) {
		System.out.println("PRIME");
	}
	else {
		System.out.println("COMPOSITE");
	}
}
}
