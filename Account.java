
public class Account {

	private double balance = 0;
	
	public Account(){
	
	}

	public Account(double balance) {
		
		this.balance = balance;
	}
	
	public double getBalance() {
		
		return balance;
	}

	public void deposit(double amount) {
		
		this.balance += amount;
		System.out.println("You have deposited " + amount);
	}
	
	public void withdraw(double amount) {
		
		this.balance -= amount;
		System.out.println("You have withdrew " + amount);
	}
	

}
