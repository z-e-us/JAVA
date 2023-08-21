import java.util.Scanner;
public class Switch{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Name");
String Name=sc.nextLine();
System.out.println("Enter your Age");
int Age=sc.nextInt();

switch(Age){
case 17:
System.out.println("Your are Eligible For voting Next year");
break;
case 15:
System.out.println("Your are Eligible For voting after 3 year");
break;
case 16:
System.out.println("Your are Eligible For voting After 2 year");
break;
default:
System.out.println("Your are Eligible For voting");
}
}
}