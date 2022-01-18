package ver1;

public class Account {
	//instance variable, only available in this class
	private double balance;
	
	//constructor
	public Account (double initBalance) {
		balance = initBalance;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	//getter method that returns balance
	public double getBalance() {
		return balance;
	}
	//method that increases the balance by amount
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
		}
	}
	//decreases the balance by amount
	public void withdraw(double amount) {
		if(amount>0) {
			balance -= amount;
		}
	}
	
	@Override
	public String toString() {
		String msg = "balance=$" + balance;
		return msg;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//informal test code
	public static void main (String[] args) {
		Account a1 = new Account();
		a1.setBalance(1000.0);
		System.out.println("Balance=$" + a1.getBalance());
		
		a1.withdraw(200.0);
		System.out.println("Balance=$" + a1.getBalance());
		
		System.out.println(a1.toString());
		System.out.println(a1);
	}
}
