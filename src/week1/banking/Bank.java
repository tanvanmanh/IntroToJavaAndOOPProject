package week1.banking;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Bank bank = new Bank();

		// calls the run methods in the bank class
		bank.run();
	}

	/**
	 * Runs the program by initializing and managing bank accounts and customers
	 */
	public void run() {
		System.out.println("Welcome to the Bank! What is your name.");

		Scanner scanner = new Scanner(System.in);

		// get the next token, which is the customer's name
		String name = scanner.next();

		System.out.println("Hello " + name + "! We are creating checking and savings accounts for you.");

		// create customer with given name
		Customer customer = new Customer(name);

		// get address
		System.out.println("What is your address?");

		// get the next token (word), which is the customer's address
		String address = scanner.next();

		// sets the customer address
		customer.setAddress(address);

		// create a checking account for customer
		BankAccount checkingAccount = new BankAccount("checking", customer);

		// create a savings account for customer
		BankAccount savingsAccount = new BankAccount("savings", customer);

		// gets and prints the customer info associated with the checking account
		System.out.println();
		System.out.println("Customer info");
		System.out.println(checkingAccount.getCustomerInfo());

		// gets and prints account info for checking account
		System.out.println();
		System.out.println("Checking account");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Savings account");
		System.out.println(savingsAccount.getAccountInfo());

		// deposits

		// into checking
		System.out.println();
		System.out.println("Amount (decimal) to deposit into your checking account");
		double amount = scanner.nextDouble();
		checkingAccount.deposit(amount);

		// into savings
		System.out.println();
		System.out.println("Amount (decimal) to deposit into your savings account");
		amount = scanner.nextDouble();
		savingsAccount.deposit(amount);

		// print new balances
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());

		// withdrawals

		// from checking
		System.out.println();
		System.out.println("Amount (decimal) to withdraw from your checking account");
		amount = scanner.nextDouble();
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		// from savings
		System.out.println();
		System.out.println("Amount (decimal) to withdraw from your savings account");
		amount = scanner.nextDouble();
		try {
			savingsAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		// print new balances
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		scanner.close();
	}

}
