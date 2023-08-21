package Basic;
//method calcuator to show all operatin including modules in java.
import java.util.Scanner;
public class NCal{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	NCal ob = new NCal();
	System.out.println("Enter the first number -");
	int a = sc.nextInt();
	System.out.println("Enter the second number -");
	int b = sc.nextInt();
	System.out.println("SUM"+ (a+b));
	System.out.println("DIFFERENCE  "+(a-b));
	System.out.println("PRODUCT  "+ (a*b));
	System.out.println("DIVIDENT  "+ (a/b));
	System.out.println("REMINDER "+ (a%b));
}
}
