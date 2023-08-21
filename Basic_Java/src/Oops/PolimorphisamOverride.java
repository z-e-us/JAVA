package Oops;

public class PolimorphisamOverride extends Polimorphisam {

		public void sum(int a,int b) {
			int c = a+b;
			System.out.println("Sum of "+ a+"+"+b+"="+c);
			super.sum(40,58);
		}
	public static void main(String[] args) {
		PolimorphisamOverride poliride = new PolimorphisamOverride();
		poliride.sum(11, 5);
	}
}
