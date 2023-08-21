package Basic;
import java.util.Scanner;
public class St{
public static void main(String[] args){
	Scanner input = new Scanner("System.in");
	String sb;
	System.out.print("Enter the string:- ");
	sb = input.nextLine();
	System.out.print("Enter Required operation:- ");
	String o = input.nextLine();
	switch(o){
		case "index" : 
			System.out.println ("Find index of :- ");
			String i = input.nextLine();
			System.out.println("The index of "+ i +" is "+sb.indexOf(i));
			break;
		case "endwith" :
			System.out.println ("Is the string end with :- ");
			String e = input.nextLine();
			if(sb.endsWith(e)==true){
			System.out.println("The string ends with"+ e);
			}
			break;
}
}
}