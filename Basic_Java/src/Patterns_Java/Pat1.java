package Patterns_Java;
public class Pat1{
public static void main(String[] args){
	for (int i=1;i<=7;i++){
		for (int j=1;j<=i;j++){
			System.out.print("*");
		}
		for (int j=7;j>=i;j--){
			System.out.print("_");
		}
		for (int j=6;j>=i;j--){
			System.out.print("_");
		}
		for (int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	for (int k=1;k<=15;k++){
			System.out.print("*");
	}
}
}