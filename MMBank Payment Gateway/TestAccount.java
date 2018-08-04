//Class to test Account functionalites
public class TestAccount {

	public static void main(String[] args) {
		//creating 1st object with initial balance
		Account ac = new Account("Sangeeta",1000);
		System.out.println(ac);
		
		//getting next account number after 1st object
		int next = Account.getNextAccountNumber();
		System.out.println(next);
		
		//creating 2nd object with zero balance
		Account name = new Account("name");
		System.out.println(name);
		
		//getting next account number after 2nd object
		next = Account.getNextAccountNumber();
		System.out.println(next);
		
		//transferring balance test 1 
		String result = ac.transaction(name, 200);
		System.out.println(result);
		
		//Transferring balance test 2
		result = ac.transaction(name, ac.getBalance());
		System.out.println(result);
		
		//Checking updated balance
		System.out.println(ac);
		System.out.println(name);
	}

}
