package Constructorpackage;

public class BankAccount {
	String accountnumber;
	double balance;
	
	public BankAccount(String accountnumber, double balance) {
		
		this.accountnumber = accountnumber;
		this.balance = balance;
	}
	
	public double deposit(double adding) {
		double updatedbalance1 = balance + adding;
		return updatedbalance1;
	}
	
	public double withdraw(double remove) {
		double updatedbalance2 = balance - remove;
		return  updatedbalance2;
	}


	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("2345 6734 9730 9922",12.8);
		System.out.println("Account number:"+" "+b1.accountnumber);
		System.out.println("Balance:"+" "+b1.balance);
		
		b1.deposit(2);
		double adding = 2;
		double updatedbalance1 = b1.balance + adding;
		System.out.println(updatedbalance1);
		
		b1.withdraw(2);
		double remove = 2;
		double updatedbalance2 =updatedbalance1 - remove;
		System.out.println(updatedbalance2);
		
		
		
		
	}

}
