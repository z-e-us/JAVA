package Oops;

public class C2 extends B {
	public void Fourth() {
		System.out.println("I am second child");
	}
	public static void main(String[] args) {
		C2 child = new C2();
		child.first();
		child.Second();
		child.Fourth();
	}
}
