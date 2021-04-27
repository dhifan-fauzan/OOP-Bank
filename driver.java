import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		
		Bank myBank = new Bank("Some Nice Bank");
		Scanner choice = new Scanner(System.in);
		int option = 0;
		
		while(option != 7) {
			
			System.out.println("Welcome to " + myBank.getBankName());
			System.out.println("1. Add Customer");
			System.out.println("2. Customer List");
			System.out.println("3. Setup Account For Customer");
			System.out.println("4. Account Details");
			System.out.println("5. Deposit");
			System.out.println("6. Withdraw");
			System.out.println("7. Exit");
			System.out.print("Your choice: ");
			
			option = choice.nextInt();
			
			switch(option) {
			
			case 1:
				
				System.out.println("Customers First Name");
				String firstName = choice.next();
				
				System.out.println("Customers Last Name");
				String lastName = choice.next();
				myBank.addCustomer(firstName, lastName);
				break;
			
			case 2:
				System.out.println("Customer List");
				for(int i = 0; i < myBank.getNumOfCustomer(); i++) {
					
					System.out.println(i+1 + ". " + myBank.getCustomer(i).getFullName());
					
				}
				break;
				
			case 3:
				System.out.println("Customer List");
				for(int i = 0; i < myBank.getNumOfCustomer(); i++) {
					
					System.out.println(i+1 + ". " + myBank.getCustomer(i).getFullName());
					
				}
				
				System.out.println("Which account do you want to setup");
				int accChoice = choice.nextInt();
				
				System.out.println("Setup Account for " + myBank.getCustomer(accChoice - 1).getFullName());
				System.out.println("Enter amount to deposit");
				int deposit = choice.nextInt();
				
				myBank.getCustomer(accChoice - 1).setAccount(new Account(deposit));
				break;
				
			case 4:
				System.out.println("Customer List");
				for(int i = 0; i < myBank.getNumOfCustomer(); i++) {
					
					System.out.println(i+1 + ". " + myBank.getCustomer(i).getFullName());
					
				}
				
				System.out.println("Which account do you want to see");
				
				accChoice = choice.nextInt();
				System.out.println(myBank.getCustomer(accChoice - 1).getFullName() + " has " + myBank.getCustomer(accChoice - 1).getAccount().getBalance() + " dollars");
				break;
			
			case 5:
				System.out.println("Customer List");
				for(int i = 0; i < myBank.getNumOfCustomer(); i++) {
					
					System.out.println(i+1 + ". " + myBank.getCustomer(i).getFullName());
					
				}
				
				System.out.println("Which account do you want to deposit money");
				accChoice = choice.nextInt();
				
				System.out.println("Enter amount to deposit");
				deposit = choice.nextInt();
				
				System.out.println(deposit + " dollar has been deposited to " + myBank.getCustomer(accChoice - 1).getFullName() + " account");
				myBank.getCustomer(accChoice - 1).getAccount().deposit(deposit);
				break;
				
			case 6:
				System.out.println("Customer List");
				for(int i = 0; i < myBank.getNumOfCustomer(); i++) {
					
					System.out.println(i+1 + ". " + myBank.getCustomer(i).getFullName());
					
				}
				
				System.out.println("Which account do you want to withdraw money");
				accChoice = choice.nextInt();
				
				System.out.println("Enter amount to withdraw");
				deposit = choice.nextInt();
				
				System.out.println(deposit + " dollar has been withdrawn to " + myBank.getCustomer(accChoice - 1).getFullName() + " account");
				myBank.getCustomer(accChoice - 1).getAccount().withdraw(deposit);
				break;

			}
		}
		
		choice.close();
	}
}
