
public class Customer {

	private String fname;
	private String lname;
	private Account customerAcc;
	
	public Customer(String fname, String lname) {
		
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFirstName() {
		
		return fname;
	}
	
	public String getLastName() {
		
		return lname;
	}
	
	public Account getAccount() {
		
		return customerAcc;
	}
	
	public void setAccount(Account acc) {
		
		this.customerAcc = acc;
	}
}
