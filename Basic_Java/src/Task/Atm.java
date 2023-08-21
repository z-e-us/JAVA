package Task;

public class Atm extends Bank {
	private int pin;
	private int otp;
	Bank o = new Bank();

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

}
