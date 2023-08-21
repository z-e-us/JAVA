package Patterns_Java;

public class LeftArrow {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i < 5) {
				for (int j = 5; j >= i + 1; j--)
					System.out.print(" ");
			} else {
				for (int j = 0; j <= i - 6; j++)
					System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 0; j <= 5; j++) {
				if (i == 0 || i == 5 || i == 10)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
