
public class CurrentAccount extends Account {
public CurrentAccount(String name) {
		super(name);
		
	}
private String tradeLicenseNumber;
public double getBalance() {
	return getAccount_balance();
}
public void withdraw(double amount) {
	if(amount>getAccount_balance()) {
		System.out.println("Insufficient Balance!");
	}
	else {} 
}

}
