import java.util.Random;

public class Account {
private String name;
private String account_number;
private double account_balance=0.0;

public Account(String name) {
	this.name = name;
	Random random = new Random();
	account_number = 10000 + random.nextInt(89999)+"";
}
public void deposit(Double value) {
	this.account_balance+=value;
}
public String getName() {
	return name;
}
public String getAccount_number() {
	return account_number;
}
public Double getAccount_balance() {
	return account_balance;
}
public void setName(String name) {
	this.name = name;
}
public void setAccount_number(String account_number) {
	this.account_number = account_number;
}
public void setAccount_balance(double account_balance) {
	this.account_balance = account_balance;
}

}
