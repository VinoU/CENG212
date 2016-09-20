/**
	A bank account has a blance that can be changed by
	deposits and withdrawals
	@author Kenn Baker
	@version June 11, 2014
*/
public class BankAccount
{
	public double balance;								// Why is this private?
	
	public BankAccount(double initialBalance)		// This is a constructor, no return type
	{
		balance = initialBalance;
	}
	
	public void deposit(double amount)					// deposit method
	{													// input param; no return type
		double newBalance = balance + amount;
		balance = newBalance;
	}
	
	public void withdraw(double amount)					// withdraw method
	{													// input param; no return type
		double newBalance = balance - amount;
		balance = newBalance;
	}
	
	public double getBalance()							// getter method
	{													// no input param; have return type
		return balance;		// How to correct for negative balance?
	}												// require return statement for return
	
	public static void main(String[] args)				// the main method
	{
		BankAccount myAccount = new BankAccount(100); // create actual object of class!
		myAccount.deposit(1500.00);							// call necessary methods
		myAccount.withdraw(500.00);
		System.out.println(myAccount.getBalance());
		System.out.println("Expected: 1100.00");			// Prove my initial test
	}
}  