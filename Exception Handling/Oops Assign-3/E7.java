/* 7.Write a Java program to create a class called "Bank" with a collection of accounts and methods 
	to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" 
	to maintain account details of a particular customer.
*/
class Bank {
	private String Name;
	private int acNo;
	private double balance;

	public Bank(String Name, int acNo, double balance) {
		this.Name = Name;
		this.acNo = acNo;
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		if (amount < balance) {
			balance = balance - amount;
			System.out.println("Withdrow success ");
		} else {
			System.out.println("Insufficient Balance ");
		}
	}

	public void accountInfo() {
		System.out.println("Account Holder Name : " + Name);
		System.out.println("Account Number : " + acNo);
		System.out.println("Balance = " + balance + "\n\n");
	}
}

class Account {
	public static void main(String args[]) {
		Bank ac1 = new Bank("Chhagan", 5465556, 50000);
		Bank ac2 = new Bank("Raju", 7756545, 10000);
		Bank ac3 = new Bank("Shyam", 77554545, 1000);
		ac1.accountInfo();
		ac2.accountInfo();
		ac3.accountInfo();
		System.out.println("After deposit 5000 in account Ist Account details are \n");
		ac1.deposit(5000);
		ac1.accountInfo();
		System.out.println("After withdraw 1000 from 2nd Account details are \n");
		ac2.withdraw(1000);
		ac2.accountInfo();
	}
}