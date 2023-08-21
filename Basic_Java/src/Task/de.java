package Task;
import java.util.Scanner;
public class de {
public static void main(String[] args) {
	String c;
	int i=1;
	do {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your name:-");
	String name = sc.next();
	System.out.print("Enter Your email:- ");
	String email = sc.next();
	System.out.print("Enter Your Phone:- ");
	String phone = sc.next();
	if(i>10) {
	System.out.print("Enter Your Refferal code:- ");
	String code = sc.next();
	}
	System.out.print("Do you want to fill another data (Y/N):- ");
	c = sc.next();
	i++;
}
while(c.equals("Yes")||c.equals("yes")||c.equals("Y")||c.equals("y"));
	
}
}
