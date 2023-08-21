package Task;

public class Accounts {
	String account_no;
	String name;
	int balance;
	int otp;
	int pin;

	Accounts(String a, String n, int b, int ot, int pi) {
		account_no = a;
		name = n;
		balance = b;
		otp = ot;
		pin = pi;
	}

	public String getAccount() {
		return account_no;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int getOtp() {
		return otp;
	}

	public int getPin() {
		return pin;
	}
}
