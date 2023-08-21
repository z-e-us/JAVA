package Task;

public class Bank {
	int otp_flag = 0;
	int find = 0;
	public void Verificatoin(int cpin,int cotp) {
		Accounts[] users = new Accounts[3];
		users[0] = new Accounts("568789415856", "RAM", 35689, 589764, 1289);
		users[1] = new Accounts("568789415857", "DEVIKA", 7589, 459869, 4586);
		users[2] = new Accounts("568789415858", "RAJU", 15889, 764869, 4897);

			for (int i = 0; i <= 2; i++) {
				if (cpin == users[i].getPin()) {
					find = i;
					if ((users[find].getOtp()) == cotp) {
						otp_flag++;
					}
					break;
				} else if (i == 2) {
					System.out.println("!!! Incorrect PIN !!!");
				}
			}
			if (otp_flag != 0) {
				System.out.println("Hi " +users[find].getName() + "(" + users[find].getAccount() + ")"
						+ " your account balance is " +users[find].getBalance());
			} else {
				System.out.println("!!! Incorrect OTP !!!");
			}
	}
}