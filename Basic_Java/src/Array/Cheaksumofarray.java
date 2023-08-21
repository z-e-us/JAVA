package Array;

import java.util.Iterator;

public class Cheaksumofarray {
public static void main(String[] args) {
	int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	for (int i = 0;i<a.length;i++) {
		for(int j =i+1;j<a.length;j++) {
			if(a[i]+a[j]==17) {
				System.out.println("The sum of "+ a[i]+" + "+a[j]+" is 17");
			}
		}
	}
}
}
