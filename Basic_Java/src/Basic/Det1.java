package Basic;
import java.util.Scanner;
public class Det1{
public static void main(String[] args){
	Det1 ob = new Det1();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter id:");
	String id= sc.nextLine();
	System.out.println("Enter name:");
	String name = sc.nextLine();
	System.out.println("Enter age:");
	String age = sc.nextLine();
	System.out.println("Enter phone:");
	String ph = sc.nextLine();
	System.out.println("Enter address:");
	String addr = sc.nextLine();
	ob.Details(id,name,age,ph,addr);
}

public void Details(String id,String name,String age,String ph,String addr){
	
	System.out.println("ID:"+id);
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Phone_No.:"+ph);
	System.out.println("Address:"+addr);
}
	
}