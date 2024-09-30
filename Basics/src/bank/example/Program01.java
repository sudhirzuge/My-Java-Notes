package bank.example;

class BankAccount{
	// field initialiser (3)
	private final int accno;
	private String name;
	private Double balance;
//	private static int generate_accno = 1000;    //
	private static int generate_accno;
	
	//static block  (2)
	static {
		 generate_accno = 1000;
	}
	
	// object initialiser (1)
	{
		accno = ++generate_accno;          
	}
	
	public BankAccount() {
		
	}
	
	//constructor initialiser (4)
	public BankAccount(String name) {
		this.name = name;
	}
	
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void displayAccountDetails() {
		System.out.println("Account no = "+accno);
		System.out.println("Name = "+name);
		System.out.println("Account Balance= "+balance);
	}
	
}

public class Program01 {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		b1.displayAccountDetails();
		
		BankAccount b2 = new BankAccount("Anil");
		b2.displayAccountDetails();
		
		BankAccount b3 = new BankAccount("mukesh", 1233.211);
		b3.displayAccountDetails();

	}

}
