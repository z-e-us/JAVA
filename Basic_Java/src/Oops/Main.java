package Oops;

public class Main extends Ab {
	public static void main(String[] args) {
		Main s = new Main();
		
		Calculation c1 = new Cal1();
		s.show(2);
		System.out.println(c1.add());
		System.out.println(c1.subtract());
		
		Calculation c2 = new Cal2();
		s.show(3);
		System.out.println(c2.add());
		System.out.println(c2.subtract());	
		}


	public void show(int a) {
			System.out.println("Calculation of "+ a + " numbers");
	}

}
