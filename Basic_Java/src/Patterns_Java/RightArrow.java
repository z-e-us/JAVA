package Patterns_Java;

public class RightArrow {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i < 5) {
				for (int j = 0; j <= i; j++) {
					System.out.print(" ");
				}
			} else {
				for (int j = 5; j >= i - 5; j--) {
					System.out.print(" ");
				}
			}
			System.out.print("*");
			for (int j = 0; j <= 4; j++) {
				if (i == 0 || i == 10 || i == 5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
