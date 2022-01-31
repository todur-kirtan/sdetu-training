package opp;

public class BankAccountApp {
	
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("9912332333",1000.30);
		BankAccount acc2 = new BankAccount("4343233233",2000);	
		BankAccount acc3 = new BankAccount("5754533233",2000);
		
		acc1.setName("Tom");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());

	
		
	   }
	}
	
	class BankAccount implements IInterest {
		
		//Properties of bank account
		private static int iD = 1000;            // internal Id
		private String accountNumber; //id + random 2-digit + first 2 SSN
		private static final String routingNumber = "0053452";
		private String name;
		private String SSN;
		private double balance;
		
		//constructors
		
		public BankAccount(String SSN, double initDeposit){
			
			balance = initDeposit;
			this.SSN = SSN;
			iD++;	
			setAccountNumber();
		}
		
		private void setAccountNumber() {
			
			int random = (int) (Math.random() * 100);
			accountNumber = iD + "" + random + SSN.substring(0,1);
			System.out.println("Your account number:" + accountNumber);
		
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public void payBill(double amount) {
			balance = balance - amount;
			System.out.println("Paying bill:"+ amount);
			showBalance();
		}
		
		public void makeDeposit(double amount) {
			balance = balance+amount;
			System.out.println("Making Deposit:"+ amount);
			showBalance();
		}
		
		public void showBalance() {
			System.out.println("Balance:"+balance);
		}

		@Override
		public void accrue() {
			balance = balance * (1 + (rate/100));
			showBalance();
			
		}
		
		@Override
		public String toString() {
			return "[Name:" + name + "]\n[Account Number:" + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]\n";
		}
	}   
	


