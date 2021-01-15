
public class SavingAccount extends Account {
private double interest=5;
private double max_withdraw_limit;
private double minimum_balance =500;

public double getInterest() {
	return interest;
}

public SavingAccount(String name) {
	super(name);
}

public void setInterest(double interest) {
	this.interest = interest;
}

public double getMax_withdraw_limit() {
	return max_withdraw_limit;
}

public void setMax_withdraw_limit(double max_withdraw_limit) {
	this.max_withdraw_limit = max_withdraw_limit;
}

public double getBalance() {
	return (interest*getAccount_balance()*0.01)+getAccount_balance();
}
public void withdraw(double amount) {
	if(amount>max_withdraw_limit) {
		System.out.println("Maximum withdrawal limit exceeded!");
	}
	else if((getAccount_balance()-amount)<minimum_balance) {
		System.out.println("Insufficient Balance!!");
	}
	else {
		setAccount_balance(getAccount_balance()-amount);
	}
}


}
