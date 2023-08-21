package Series;

import java.util.Scanner;

public class PrimeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of array");
		int le = sc.nextInt();
		int[] a = new int[le];
		System.out.print("Enter the elements of array:-");
		for (int i = 0; i < le; i++) {
			a[i]=sc.nextInt();
		}
		int count = 0, f = 0, h = 0;
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				f++;
			} else {
				h++;
			}
		}
		int[] prime = new int[f];
		int[] comp = new int[h];
		f = 0;
		h = 0;
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				prime[f] = a[i];
				f++;
			} else {
				comp[h] = a[i];
				h++;
			}
		}
		System.out.print("PRIME NUMBERS :- ");
		for (int j = 0; j < prime.length; j++) {
				System.out.print(prime[j] + ", ");
		}
		System.out.println();
		System.out.print("COMPOSITE NUMBERS :- ");
		for (int j = 0; j < comp.length; j++) {
				System.out.print(comp[j] + ", ");
		}

	}
}
