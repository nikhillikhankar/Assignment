package BankingSystem;

 class BankAccount {
	
	private String accountNum; // the account number
	private int balance=0;	   // the amount on deposit

//Constructs a bank account with an account number and initial balance.
	public BankAccount(String accNum, int initialBalance)
    {
        accountNum = accNum;
        balance = initialBalance; 
    }
	
//	Deposits money into the bank account.	
	public void deposit(int money)	// note "mutator" method
    {
        int Depositing_money = balance + money;
        balance = Depositing_money;				// modifies instance var
        System.out.println("Balance Diposit Successfully " + balance);
        
    }
	
//	Withdraws money from the bank account.	
	public void withdraw(int money)						// note "mutator" method
    {
        int Withdrawing_money = balance - money;
        balance = Withdrawing_money;					// modifies instance var
        System.out.println("Widrowing Suuceesfully " + balance);
    //}  
	
	if(balance == 0)
	{
		System.out.println("");
	}	
    }
	
	
// Gets the current balance.	
	public int getBalance()								// note "accessor" method
    {
        return balance;									// returns value of instance var
    }
	
	 public void transferFunds_A(BankAccount destination, int money)
	    {
	        destination.balance = destination.balance + money;
	        this.balance = this.balance - money;
	    }
	 public void transferFunds_B(BankAccount destination, int money)
	    {
	        destination.deposit(money);					// deposit to "destination" account
	        this.withdraw(money);           			// withdraw from this account
	    }
 
	        
	        
	        
 
	//public class Test{
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			BankAccount b1 = new BankAccount("111", 20000);
	        BankAccount b2 = new BankAccount("222", 30000);

	        System.out.println("acc 111 Dipositing_money  ");
	        
	                
	        
/*	        // print initial balances
	        System.out.printf("Account #%s has initial balance of $%.2f %n ", first.getAccount(),first.getBalance());

	        System.out.printf("Account #%s has initial balance of $%.2f%n",second.getAccount(), second.getBalance());

	        // transfer $5000 from first to second account (via transferFundsA())
	        first.transferFundsA(second, 5000);

	        // print new balances
	        System.out.println("\nAfter \"first.transferFunds(second, 5000)\" ...");
	        System.out.printf("Account #%s has new balance of $%.2f%n",
	                first.getAccount(), first.getBalance());

	        System.out.printf("Account #%s has new balance of $%.2f%n",
	                second.getAccount(), second.getBalance());

	        // transfer $10000 from second account to first (via transferFundsB())
	        second.transferFundsB(first, 10000);

	        // print new balances
	        System.out.println("\nAfter \"second.transferFunds(first, 10000)\" ...");
	        System.out.printf("Account #%s has new balance of $%.2f%n",
	                first.getAccount(), first.getBalance());

	        System.out.printf("Account #%s has new balance of $%.2f%n",
	                second.getAccount(), second.getBalance()); 
		
	*/
	        
	        

	}

}
