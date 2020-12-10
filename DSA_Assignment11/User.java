package pk.com.uog.DSA_Assignment11;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;


public class User {
	
	private String firstName;
	
	private String lastName;
	
	private String uuid;       // User Unique service number 
	 
	private byte pinHash[];    // Because we want to store ATM pin by using MD5 algorithm
	
	private ArrayList<Account> accounts;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public byte[] getPinHash() {
		return pinHash;
	}

	public void setPinHash(byte[] pinHash) {
		this.pinHash = pinHash;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param pin
	 * @param theBank
	 */
	public User(String firstName, String lastName, String pin, Bank theBank) {
		
		
		// set users name
		this.firstName = firstName;
		this.lastName = lastName;
	
		
		
		// store the pins MD5 hash, rather than the original value, for
		// security
		
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			this.pinHash = md.digest(pin.getBytes());
		} catch (NoSuchAlgorithmException e) {


			System.err.println("error, caught NoSuchAlgorithmException");
			e.printStackTrace();
			System.exit(1);
		}
		
		//get a new, universal ID for the user
		this.uuid = theBank.getNewUserUUID();
		
		//create empty list of accounts
		this.accounts = new ArrayList<Account>();
		
		//print log message
		System.out.printf("New user %s, %s with ID %s created. \n", lastName, firstName, this.uuid);

		
	}

	
	/**
	 * Add the Account for the User
	 * @param anAcct
	 */
	    public void addAccount(Account anAcct) {
		
		    this.accounts.add(anAcct);
 	}
	
	/**
	 * 
	 * @return the uuid
	 */
	    public String getUUID() {
		
	        return this.uuid;
	}
		
	/**
	 * 	
	 * @param aPin the pin to check
	 * @return whether the pin is valid or not
	 */
	    public boolean validatePin(String aPin) {
			
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				
				
				return MessageDigest.isEqual(md.digest(aPin.getBytes()),
						this.pinHash);
				
				
			} catch (NoSuchAlgorithmException e) {
				System.err.println("error, caught NoSuchAlgorithmException");
				e.printStackTrace();
				System.exit(1);
			}
			
			return false;
		}
	
	/**
	 * Print summaries for the accounts of this user
	 */
	   public void printAccountsSummary() {
		
		  System.out.printf("\n\n[----%s's Accounts Summary----]\n" , this.firstName);
		
		   for(int a = 0; a<this.accounts.size(); a++) {
			
		  System.out.printf("  %d) %s\n" , a+1, 
					this.accounts.get(a).getSummaryLine());
		}
		  System.out.println();
	}

	/**
	 * Get the number of accounts of the user
	 * @return the number of accounts
	 */
	public int numAccounts() {
		
		return this.accounts.size();
	}
    
	
	/**
	 * print transaction history for a particular account
	 * @param accIdx the index of the account to use
	 */
	public void printAcctTransHistory(int acctIdx) {
		
		this.accounts.get(acctIdx).printTransHistory();
		
	}
	
	/**
	 * get the balance of a particular account
	 * @param acctIdx     the index of the account to use
	 * @return            the balance of the account
	 */
	public double getAcctBalance(int acctIdx) {
		return this.accounts.get(acctIdx).getBalance();
	}
	
	/**
	 * get the UUID of particular account
	 * @param acctIdx the index of the account to use
	 * @return the UUID of the account
	 */
	public String getAcctUUID(int acctIdx) {
		
		return this.accounts.get(acctIdx).getUUID();
	}
	
	
	/**
	 * Add a transaction to a particular account
	 * @param acctIdx    the index of the account
	 * @param amount     the amount of the transaction
	 * @param memo       the memo of the transaction
	 */
	public void addAcctTransaction(int acctIdx, double amount, String memo) {
		
		this.accounts.get(acctIdx).addTransaction(amount, memo);
	}
}
		
		
		
	