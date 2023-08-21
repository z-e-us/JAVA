package Oops;
import java.util.Scanner;
public class DetailsMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
Details obj = new Details();
System.out.println("Enter the name: ");
obj.setName(sc.next());
System.out.println("Enter the name: ");
obj.setPhone_no(sc.next());

System.out.println("The name is "+ obj.getName()+" and the phone number is "+obj.getPhone_no());
	}
}
