/**
	A class to test the BankAccount class.
	@author Kenn Baker
	@version June 11, 2014
*/

// import ..../IO			// if IO class not in same directory then must import

public class UseBankAccount
{
	/**
		Tests the methods of the BankAccount class.
		@param args not used
	*/
	public static void main(String[] args)
	{
		String testName; 
		System.out.println("Confirm the constructor works");	// test name
		BankAccount myAccount = new BankAccount(100);  // declare constr. 4 BankAccount
		System.out.println("Balance : " + myAccount.getBalance());	// Get result
		System.out.println("Expected: 100");						// visually confirm
		System.out.println("Confirm the deposit works");		// Test 2
		myAccount.deposit(900);
		System.out.println("Balance : " + myAccount.getBalance());
		System.out.println("Expected: 1000");
		System.out.println("Confirm the withdrawal works");	// Test 3
		myAccount.withdraw(400);
		System.out.println("Balance : " + myAccount.getBalance());
		System.out.println("Expected: 600");
		System.out.print("\nEnter test name(x=exit): ");		// Multi-test
		testName = IO.readString();		// Call IO class to read String
		while(!testName.equals("x")) 		// String equality
		{
			System.out.println("------------------------------");
			System.out.print("Enter deposit: ");
			myAccount.deposit(IO.readDouble());	// Call IO class to read double
			System.out.print("Enter withdrawal: ");
			myAccount.withdraw(IO.readDouble());
			System.out.println("Balance : " + myAccount.getBalance());
			System.out.print("\nEnter test name(x=exit): ");
			testName = IO.readString();
		}
	}
}