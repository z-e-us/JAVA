package Patterns_Java;

public class Pattern5 {
	public static void main(String[] args) {
		for (int i=0;i<=8;i++) {
			for (int k=1;k<=i;k++) {
				System.out.print("_");
			}
			for (int j=0;j<=14-(i*2);j++) {
				System.out.print("*");
			}
			for (int k=1;k<=i;k++) {
				if(k!=8)
				System.out.print("_");
			}
			System.out.println();
		}
		for (int i=0;i<=7;i++) {
			for (int k=6;k>=i;k--){
				System.out.print("_");
			}
			for (int j=14;j>=14-(i*2);j--) {
				System.out.print("*");
			}
			for (int k=6;k>=i;k--) {
				System.out.print("_");
			}
			System.out.println();
		}
		
	}

}
