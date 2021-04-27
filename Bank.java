
public class Bank {

	private Customer[] customerList = new Customer[3];
	private int numCustomer = 0; 
	private String bankName;
	
	public Bank(String bName) {
		
		this.bankName = bName;
		
	}
	
	public String getBankName() {
		
		return bankName;
	}
	
	public void addCustomer(String fName, String lName) {
		
		customerList[numCustomer] = new Customer(fName, lName);
		numCustomer ++;
	}
	
	public int getNumOfCustomer() {
		
		return numCustomer;
	}
	
	public Customer getCustomer(int index) {
		return customerList[index];
		
	}
}
