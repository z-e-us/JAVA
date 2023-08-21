package Task;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Atm b = new Atm();
		System.out.print("Enter your ATM Pin : ");
		b.setPin(sc.nextInt());
		System.out.print("Enter OTP : ");
		b.setOtp(sc.nextInt());
		b.Verificatoin(b.getPin(),b.getOtp());
	}
}
