import java.util.Scanner;

public class Demo{
public static void main (String[] args){

Scanner input = new Scanner(System.in);
Demo ob = new Demo();
System.out.print("Enter the name: ");
String name = input.nextLine();
System.out.print("Enther the age: ");
int age = input.nextInt();
System.out.print("Enther the method want to use(if,sw): ");
String ch = input.next();
switch(ch){
case "if":{
ob.cif(age);
break;
}
case "sw":{
ob.csw(age);
break;
}
}

}
void cif(int age){
if (age>=18){
System.out.print("You are eligible");
}
else if (age == 17){
System.out.print("You can vote next year");
}
else{
System.out.print("not eligible");
}
}
void csw(int age){
switch(age){
case 18:
System.out.print("You are eligible");
break;
case 17:
System.out.print("You can vote next year");
break;
default:
System.out.print("not eligible");
break;
}
}
}