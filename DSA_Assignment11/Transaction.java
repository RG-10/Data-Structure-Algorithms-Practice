package pk.com.uog.DSA_Assignment11;

import java.util.Date;

public class Transaction {
	
	private double amount;
	
	private Date timestamp;
	
	private String memo;   //for bank statement recipients etc
	
	private Account inAccount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Account getInAccount() {
		return inAccount;
	}

	public void setInAccount(Account inAccount) {
		this.inAccount = inAccount;
	}
    
     public Transaction(double amount, Account inAccount) {
    	 
    	 this.amount = amount;
    	 this.inAccount = inAccount;
    	 this.timestamp = new Date();
    	 this.memo = "";
     }
     
     /**
      * Create a new Transaction
      * @param amount     the amount transacted
      * @param memo       the memo for the transaction
      * @param inAccount  the account the transaction to belong to
      */
     public Transaction(double amount, String memo, Account inAccount) {
    	 
    	 //call the two-argument constructor first
    	 this(amount, inAccount);
    	 
    	 //set the memo
    	 this.memo = memo;
     }
     
     
     /**
      * get a string summarizing the transaction
      * @return the summary string
      */
     public String getSummaryLine() {
    	 
    	 if(this.amount >= 0) {
    		 return String.format("%s : PKR%.02f : %s" , this.timestamp.toString(),
    				 this.amount, this.memo);
    	 }else {
    		 
    		 return String.format("%s : PKR(%.02f) : %s" , 
    				 this.timestamp.toString(), -this.amount, this.memo);
    	 }
     }

	































}
