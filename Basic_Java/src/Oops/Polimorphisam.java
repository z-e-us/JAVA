package Oops;

public class Polimorphisam {
//overloading
	public void sum(int a,int b) {
		int c = a+b;
		System.out.println("Sum of "+ a+"+"+b+"="+c);
	}
	public void sum(String a,String b) {
		String c = a+b;
		System.out.println("Sum of Strings "+ a+"+"+b+"="+c);
	}
public static void main(String[] args) {
	Polimorphisam poli = new Polimorphisam();
	poli.sum(5,6);
	poli.sum("Hello", "java");
}
}
