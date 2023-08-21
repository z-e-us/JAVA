package Oops;

public class C extends B {
	public void Third() {
		System.out.println("I am Child");
	}
	public static void main(String[] args) {
		C child = new C();
		child.first();
		child.Second();
		child.Third();
	}
}
