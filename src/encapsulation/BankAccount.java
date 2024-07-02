package encapsulation;

public class BankAccount {
	
	private String accountnumber;
	private double balance;
	private String owner;
	/**
	 * @return the accountnumber
	 */
	public String getAccountnumber() {
		return accountnumber;
	}
	/**
	 * @param accountnumber the accountnumber to set
	 */
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double deposit(double add) {
		double updatedbalance1 = balance+add;
		
		return updatedbalance1;
	}
	
	public double withdraw(double remove) {
		double updatedbalance2 = balance-remove;
		return updatedbalance2;
	}
	
	public void printstatement() {
		System.out.println(accountnumber);
		System.out.println(balance);
		System.out.println(owner);
		
	}
	

}
