package Patterns_Java;

public class Dimond {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			if (i != 0)
				System.out.print(" ");

			if (i != 0 && i != 1)
				System.out.print("*");
			for (int k = 0; k <= i - 3; k++) {
				if (k != 2) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for (int k = 0; k <= i - 4; k++) {
				System.out.print(" ");
			}
			if (i != 0 && i != 1 && i != 2)
				System.out.print("*");
			if (i != 0 && i != 1)
				System.out.print(" ");
			if (i != 0)
				System.out.print("*");
			System.out.println();

		}
		for (int i = 0; i <= 4; i++) {
			for (int j = -1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			if (i != 4)
				System.out.print(" ");
			if (i != 4 && i != 3)
				System.out.print("*");
			for (int k = 2; k >= i; k--) {
				if (k != 2)
					System.out.print(" ");
			}
			for (int k = 2; k >= i + 1; k--) {
				if (k != 2)
					System.out.print(" ");
			}
			if (i != 4 && i != 3 && i != 2)
				System.out.print("*");
			if (i != 4 && i != 3)
				System.out.print(" ");
			if (i != 4)
				System.out.print("*");
			System.out.println();
		}
	}
}
