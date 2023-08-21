package Oops;

public class Cm implements Am,Bm {

	public void age() {
		System.out.println("My name is Gokul");
		
	}

	public void name() {
		System.out.println("I am 23 years old");
		
	}
public static void main(String[] args) {
	Cm in = new Cm();
	in.age();
	in.name();
}
}
