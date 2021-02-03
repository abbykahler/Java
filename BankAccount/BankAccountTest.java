
public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount act1 = new BankAccount();
		System.out.println(act1.getAccountNumber());
		act1.depositChecking(100.00);
		act1.withdrawChecking(42.23);
		act1.depositSavings(203.44);
		act1.withdrawSavings(22.34);
		act1.viewBalance();
		BankAccount nic = new BankAccount();
		System.out.println(nic.getAccountNumber());
		
	}

}