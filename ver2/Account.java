package ver2;

public class Account {
	//instance variable, only available in this class
	//new comment for balance
	private double balance;
	
	//pt17
	private String name;
	
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	//getter method that returns balance
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public void mergeAccount(Account a) {
		if(this.getName().equals(a.getName())) {
			this.balance += a.getBalance();
		}
	}

	
	@Override
	public String toString() {
		String msg = "name=" + name + ", balance=$" + balance;
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
