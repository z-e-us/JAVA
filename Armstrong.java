import java.util.Scanner;
public class Armstrong{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:- ");
int num = sc.nextInt();
int copy=num,digit=0,sumpower=0;
while(num!=0){
num=num/10;
digit++;
}
num=copy;
while(num!=0){
sumpower=sumpower+(int)(Math.pow(num%10,digit));
num=num/10;
}
if(sumpower==copy)
System.out.println("The number is Armstrong");
else
System.out.println("The number is not Armstrong"); 
}
}