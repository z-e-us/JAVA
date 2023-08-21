package Series;

public class PrimeNumfrom1to1000 {
public static void main(String[] args) {
	int count = 0, f = 0, h = 0;
	for (int i = 1; i <=1000; i++) {
		count = 0;
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				count++;
			}
		}
		if (count == 2) {
			f++;
			System.out.print(i+", ");
		} else {
			h++;
		}
}
	System.out.println();
	System.out.print("The no of prime numbers form 1 ti 1000 is "+f);
}
}
