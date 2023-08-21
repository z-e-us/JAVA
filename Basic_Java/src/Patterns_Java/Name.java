package Patterns_Java;

public class Name {
	public static void main(String[] args) {
		for (int i = 0; i <= 8; i++) {
			// G Start
			for (int j = 2; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i - 6; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 0; j <= 3; j++) {
				if (i == 0 || i == 8) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if (i <= 4) {
				for (int j = 0; j <= i - 1; j++) {
					if (i != 0 && j != 3)
						System.out.print(" ");
				}
			} else {
				for (int j = 8; j >= i + 1; j--) {
					if (i == 5)
						System.out.print("*");
					else if (i != 8)
						System.out.print(" ");
				}
			}
			if (i <= 4) {
				for (int j = 0; j <= i - 2; j++) {
					if (i != 0 && j != 3)
						System.out.print(" ");
				}
			} else {
				for (int j = 8; j >= i + 2; j--) {
					if (i == 5)
						System.out.print("*");
					else if (i != 8)
						System.out.print(" ");

				}
			}
			if (i != 0 && i != 8 && i != 3 && i != 4) {
				System.out.print("*");
			} else {
				if (i != 0 && i != 8)
					System.out.print(" ");
			}
			// G end
			// Space between Start
			if (i <= 4) {
				for (int j = 4; j >= i + 1; j--) {
					System.out.print(" ");
				}
			} else {
				for (int j = 0; j <= i - 5; j++) {
					System.out.print(" ");
				}
			}
			for (int j = 2; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i - 6; j++) {
				System.out.print(" ");
			}
			// Space between end
			// O Start
			System.out.print("*");
			for (int j = 0; j <= 3; j++) {
				if (i == 0 || i == 8) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if (i <= 4) {
				for (int j = 0; j <= i - 1; j++) {
					if (i != 0 && j != 3)
						System.out.print(" ");
				}
			} else {
				for (int j = 8; j >= i + 1; j--) {

					System.out.print(" ");
				}
			}
			if (i <= 4) {
				for (int j = 0; j <= i - 2; j++) {
					if (i != 0 && j != 2)
						System.out.print(" ");
				}
			} else {
				for (int j = 8; j >= i + 2; j--) {
					System.out.print(" ");
				}
			}
			if (i != 0 && i != 8)
				System.out.print("*");
			// O end
			// Space between start
			for (int j = 2; j >= i - 1; j--) {
				System.out.print(" ");
			}
			if (i == 4) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i - 4; j++) {
				System.out.print(" ");
			}
			// Space between end
			// K Start
			System.out.print("*");
			for (int j = 7; j >= i; j--) {
				if (i == 0 || i == 1 || i == 2 || i == 3)
					System.out.print(" ");
			}
			if (i == 4) {
				for (int j = 0; j <= 4; j++) {
					System.out.print("*");
				}
			}
			for (int j = 0; j <= i - 1; j++) {
				if (i == 5 || i == 6 || i == 7 || i == 8)
					System.out.print(" ");
			}
			if (i != 4)
				System.out.print("*");
			// K End
			// Space between Start
			if (i <= 4) {
				for (int j = 1; j <= i + 1; j++) {
					System.out.print(" ");
				}
			} else {
				for (int j = 8; j >= i; j--) {
					System.out.print(" ");
				}
			}
			if (i == 6 || i == 7 || i == 8) {
				for (int j = 0; j <= i - 6; j++) {
					System.out.print(" ");
				}
			}
			// Space between end
			// U Start
			System.out.print("*");
			for (int j = 0; j <= 3; j++) {
				if (i == 8) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 0; j <= 4; j++)
				if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
					System.out.print(" ");
				}
			if (i == 6) {
				for (int j = 0; j <= 2; j++) {
					System.out.print(" ");
				}
			}
			if (i == 7) {
				System.out.print(" ");
			}
			if (i != 8)
				System.out.print("*");
			// U End
			// Space between start
			if (i == 6 || i == 7 || i == 8) {
				for (int j = 0; j <= i - 6; j++) {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// Space between end
			// L Start
			System.out.print("*");
			if (i == 8) {
				for (int j = 0; j <= 9; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j <= 9; j++) {
					System.out.print(" ");
				}
			}
			// L End
			// Space Between Start
			System.out.print(" ");
			// Space Between End
			// Dot Start
			if (i >= 7) {
				for (int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j <= 1; j++) {
					System.out.print(" ");
				}
			}
			// Dot End
			// Space Between Start
			System.out.print(" ");
			// Space Between End
			// G Start
			for (int j = 2; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i - 6; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 0; j <= 3; j++) {
				if (i == 0 || i == 8) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if (i <= 4) {
				for (int j = 0; j <= i - 1; j++) {
					if (i != 0 && j != 3)
						System.out.print(" ");
				}
			} else {
				for (int j = 8; j >= i + 1; j--) {
					if (i == 5)
						System.out.print("*");
					else if (i != 8)
						System.out.print(" ");
				}
			}
			if (i <= 4) {
				for (int j = 0; j <= i - 2; j++) {
					if (i != 0 && j != 3)
						System.out.print(" ");
				}
			} else {
				for (int j = 8; j >= i + 2; j--) {
					if (i == 5)
						System.out.print("*");
					else if (i != 8)
						System.out.print(" ");

				}
			}
			if (i != 0 && i != 8 && i != 3 && i != 4) {
				System.out.print("*");
			} else {
				if (i != 0 && i != 8)
					System.out.print(" ");
			}
			// G End
			// Space Between Start
			if (i <= 4) {
				for (int j = 4; j >= i + 1; j--) {
					System.out.print(" ");
				}
			} else {
				for (int j = 0; j <= i - 5; j++) {
					System.out.print(" ");
				}
			}
			// Dot Start
			// Space Between End
			if (i >= 7) {
				for (int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j <= 1; j++) {
					System.out.print(" ");
				}
			}
			// Dot End
			// Space Between Start
			System.out.print(" ");
			// Space Between End
			// I Start
			for (int j = 0; j <= 8; j++) {
				if (i == 0 || i == 8 || j == 4)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			// I End
			System.out.println();
		}
	}

}
