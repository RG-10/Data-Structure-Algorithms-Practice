package pk.com.uog.DSA_Assignment11;

import java.util.ArrayList;

public class Account {
	
	private String name;
	
	private String uuid;
	
	private User holder;
	
	private ArrayList<Transaction> transactions;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public User getHolder() {
		return holder;
	}

	public void setHolder(User holder) {
		this.holder = holder;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Account(String name, User holder, Bank theBank) {
		
		// set the account name and holder
		this.name = name;
		this.holder = holder;
		
		
		//get new account UUID
		this.uuid = theBank.getNewAccountUUID();
		
		//inits transactions
		this.transactions = new ArrayList<Transaction>();
		
		
	}


    /**
     * For getting user id service number
     * @return     uuid
     */
	public String getUUID() {
		
		// Get account uuid
		return this.uuid;
	}
	
	
	/**
	 * Get summary line for the account
	 * @return the string summary
	 * 
	 */
	public String getSummaryLine() {
		
		//Get the account's balance
		
		double balance = this.getBalance();
		
		//format the summary line, depending on the whether the balance is
		//negative
		
		if(balance >= 0) {
			
			return String.format("%s : PKR%.02f : %s", this.uuid, balance,
					this.name);
		} else {
			return String.format("%s : PKR(%.02f) : %s", this.uuid, balance,
					this.name);
			
			
		}
	}
	
	/**
	 * Get the balance of this account by adding the amounts of the transactions
	 * @return the balance value
	 */
	public double getBalance() {
		
		double balance = 0;
		for(Transaction t : this.transactions) {
			
			balance += t.getAmount();
		}
		
		return balance;
	}
	
	
	/**
	 * print the transaction history of the account
	 */
	public void printTransHistory() {
		
		System.out.printf("\nTransaction History for Account %s\n" , this.uuid);
		
		for(int t = this.transactions.size()-1;  t>= 0; t--) {
			
			System.out.println(this.transactions.get(t).getSummaryLine());
		}
		
		System.out.println();
	}
	
	
	/**
	 * Add a new transaction in this amount
	 * @param amount    the amount transacted
	 * @param memo      the transaction memo
	 */
	public void addTransaction(double amount, String memo) {
		
		//create new transaction object and add it to our list
		
		Transaction newTrans = new Transaction(amount, memo, this);
		this.transactions.add(newTrans);
	}
	
}
