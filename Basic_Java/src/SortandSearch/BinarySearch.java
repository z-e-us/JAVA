package SortandSearch;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int f = 0;
		int l = a.length-1;
		int m;
		System.out.print("Enter Element to search:- ");
		int s = in.nextInt();
		while(f<=l) {
			m=(f+l)/2;
			if(a[m]==s) {
				System.out.println("Element Found at position "+(m+1));
				break;
			}
			else if(a[m]>s) {
				l=m-1;
			}
			else if(a[m]<s) {
				f=m+1;
			}
			
		}
		if(f>1)
			System.out.println("Element Not Found");
	}

}
