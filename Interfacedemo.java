	public class Account {
	private int accnum;
	private String accname;
	private double balance;
	Bank bank;
	public Account(int accnum, String accname,double balance) {
		super();
		this.accnum=accnum;
		this.accname=accname;
		this.balance=balance;
		//is.bank=bank;
		
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum=accnum;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname=accname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank=bank;
	}
	}
ublic interface Bank {
	final double MINBAL=1500;
	final double MIN_BAL=1500;
	final double DEPOSIT_LIMIT=25000;
	void withdraw(Account account,double amount);
	void deposit(Account account ,double amount);
	

}
public class BankImplementation implements Bank{
	@Override
	public void withdraw(Account account,double amount) {
		if(account.getBalance()-amount>MINBAL) {
			account.setBalance(account.getBalance()-amount);
			System.out.println("The balance after withdraw"+account.getBalance());
		}
		else {
			System.out.println("Insufficient balance to withdraw");
		}
	}
	@Override
	public void deposit(Account account,double amount) {
		if(amount>DEPOSIT_LIMIT) {
			System.out.println("The amount is exceeding to deposit..");
		}
		else {
			account.setBalance(account.getBalance()+amount);
			System.out.println("The amount after deposit"+account.getBalance());
			
		}
	}

}
public class AccountMain {
	public static void main(String[]args) {
		Account account=new Account(101,"Neha",3000);
		BankImplementation bank=new BankImplementation();
		bank.withdraw(account, 15000);
		bank.deposit(account, 30000);
	}

}
