package Patterns_Java;

public class test {
	public static void main(String[] args) {
		for(int i =1;i<6;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print(" ");
			}
			if(i!=1&&i!=5) {
			for(int k=1;k<=6;k++) {
				if(k!=3&&k!=2&&k!=4&&k!=5) {
				System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			}
			else
				for(int k=1;k<=6;k++) {
					System.out.print("*");
				}
			System.out.println();
		}
	}

}
