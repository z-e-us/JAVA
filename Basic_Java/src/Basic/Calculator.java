package Basic;
import java.util.Scanner;
public class Calculator{
public static void main(String[] args ){
	
	Scanner input = new Scanner(System.in);
	String c="yes";
	do{
		if (c.equals("No")||c.equals("no")||c.equals("N")||	c.equals("n")){
			break;
		}
		System.out.print("Enter first number:- ");
		int a = input.nextInt();
		System.out.print("Enter second number:- ");
		int b = input.nextInt();
		System.out.print("select Operation required:- ");
		char ch = input.next().charAt(0);
		switch(ch){
			case '+':
			System.out.println("Sum = "+(a+b));
			break;		
			case '-':
			System.out.println("Difference = "+(a-b));
			break;
			case '*':
			System.out.println("Product = "+(a*b));
			break;
			case '/':
			System.out.println("Quotient = "+(a/b));
			break;
			case '%':
			System.out.println("Remainder = "+(a%b));
			break;
			default:
			System.out.println("Select vailid operation!!!");

		}
		System.out.print("Do you want to solve another problem (Y/N):- ");
		c = input.next();
	}
	while(c.equals("Yes")||c.equals("yes")||c.equals("Y")||c.equals("y")||c.equals("No")||c.equals("no")||c.equals("N")||	c.equals("n"));
}
}