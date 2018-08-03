//Class of Account 
public class Account {
	//Instance members
	private int accountNumber = 0;
	private String name;
	private double Balance;
	
	//class member
	private static int lastAccountNumber = 0;
	  
	//Constructors to initialize unique account number, name and initialBalance 
	public Account(String name, double intialBalance) {
		this.name = name;
		this.Balance = intialBalance;
		accountNumber = lastAccountNumber + 1;
		lastAccountNumber = accountNumber;
	}
	public Account(String name) {
		this.name = name;
		accountNumber = lastAccountNumber + 1;
		lastAccountNumber = accountNumber;
	}
	
	//Get Balance Method
	public double getBalance() {
		return Balance;
	}
	
	//Withdraw method
	public void withdraw(double amount) {
		if(this.Balance >= amount && amount>0)
			this.Balance = this.Balance - amount;
	}
	
	//deposit method
	public void deposit(double amount) {
		if(amount > 0)
			this.Balance = this.Balance + amount;
	}
	
	//Static method to get next account number
	public static int getNextAccountNumber() {
		return lastAccountNumber + 1;
	}
	
	//transaction method for sending money from one account to another
	public String transaction(Account reciever, double amount){
		String result = new String();
		if(PaymentGateway.transfer(this, reciever, amount)) {
			result = "Payment Successful";
		}
		else {
			result = "Payment Failed";
		}
		return result;
	}
	
	//tostring override
	@Override
	public String toString() {
		return "Account [id = " +accountNumber+ " name=" + name + ", initialBalance=" + Balance + "]";
	}
	
}