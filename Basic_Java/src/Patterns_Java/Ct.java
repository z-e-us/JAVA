package Patterns_Java;

public class Ct {
	public static void main(String[] args) {
		for (int i = 0; i <= 26; i++) {
			if (i <=4)
				for (int j = 15; j >= i; j--) {
					System.out.print(" ");
				}
			if (i > 4 && i <= 11)
				for (int j = 18; j >= i; j--) {
					System.out.print(" ");
				}
			if (i > 11 && i < 20) 
				for (int j = 23; j >= i; j--) {
					System.out.print(" ");
				}
			if (i <=4)
				for (int j = 0; j<=i; j++) {
					System.out.print("*");
				}
			if (i <=4)
				for (int j = 1; j<=i; j++) {
					System.out.print("*");
				}
			if (i > 4 && i <= 11)
				for (int j = 3; j <= i; j++) {
					System.out.print("*");
				}
			if (i > 4 && i <= 11)
				for (int j = 4; j <= i; j++) {
					System.out.print("*");
				}
			if (i > 11 && i < 20) 
				for (int j = 8; j <= i; j++) {
					System.out.print("*");
				}
			if (i > 11 && i < 20) 
				for (int j = 9; j <= i; j++) {
					System.out.print("*");
				}
			if(i>=20) {
				for (int j = 0; j <= i; j++) {
					if(j>13 && j<19)
						System.out.print("*");
					else {
						System.out.print(" ");
					}
				}
				
			}
			
			System.out.println();
		}
	}
}
