package Basic;
import java.util.Scanner;
public class Mcal{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Mcal ob = new Mcal();
	System.out.println("Enter the first number -");
	int a = sc.nextInt();
	System.out.println("Enter the second number -");
	int b = sc.nextInt();
	System.out.println("SUM= " +(ob.sum(a,b)));
	System.out.println("DIFFERENCE = " +(ob.diff(a,b)));
	System.out.println("PRODUCT = " +(ob.pro(a,b)));
	System.out.println("DIVIDENT = " +(ob.div(a,b)));
	System.out.println("REMINDER = " +(ob.mod(a,b)));

}

public int sum(int a, int b){
	return (a+b);
}

public int diff(int a, int b){
	return (a-b);
}

public int pro(int a, int b){
	return (a*b);
}

public int div(int a, int b){
	return (a/b);
}

public int mod(int a, int b){
	return (a%b);
}
}