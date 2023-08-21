package Series;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
	int n1=0;
	int n2=1;
	int n3;
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the length of series:-");
	int nu=in.nextInt();
	for (int i=1;i<=nu;i++) {
	System.out.print(n1+", ");
	n3 = n1+n2;
	n1=n2;
	n2=n3;
	}
	}
}
