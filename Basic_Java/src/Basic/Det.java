package Basic;
import java.util.Scanner;
public class Det{
public static void main(String[] args){
	Det ob = new Det();
	ob.details();
}

public void details(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter id:");
	int id = sc.nextInt();
	sc.nextLine();
	System.out.print("Enter name:");
	String name = sc.nextLine();
	System.out.print("Enter age:");
	int age = sc.nextInt();
	sc.nextLine();
	System.out.print("Enter phone number:");
	String ph = sc.nextLine();
	System.out.print("Enter Address:");
	String addr = sc.nextLine();
	System.out.println("ID:"+id);
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Phone_No.:"+ph);
	System.out.println("Address:"+addr);
}
	
}