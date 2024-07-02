package encapsulation;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		b1.setAccountnumber("2476 7345 1200 0528");
		b1.setBalance(35.5);
		b1.setOwner("Mounika karlapudi");
		
		System.out.println(b1.getAccountnumber());
		System.out.println(b1.getBalance());
		System.out.println(b1.getOwner());
		
		b1.deposit(5.2);
		double add = 5.2;
		double updatedbalance1 = b1.getBalance()+ add;
		System.out.println(updatedbalance1);
		
		b1.withdraw(4.2);
		double remove = 4.2;
		double updatedbalance2 = updatedbalance1 - remove;
		System.out.println(updatedbalance2);
		
		b1.setBalance(updatedbalance2);
		
		b1.printstatement();
		
		
			
		

	}

}
