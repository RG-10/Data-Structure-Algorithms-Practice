package pk.com.uog.DSA_Assignment11;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
	
	private String name;
	
	private ArrayList<User> users;
	
	private ArrayList<Account> accounts;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	/**
	 * Get the new User Id
	 * @return
	 */
	public String getNewUserUUID() {
		
		//inits
		String uuid;
		
		Random rng = new Random();
		
		int len = 6;
		
		boolean nonUnique;
		
		//continue looping until we get a unique ID
		do {
			
			//generate the number
			uuid = "";
			for (int c=0; c<len; c++) {
				uuid += ((Integer)rng.nextInt(10)).toString();
				
			}
			
			// check to make sure its unique
			nonUnique = false;
			for(User u : this.users) {
				
				if(uuid.compareTo(u.getUUID()) == 0) {
					 nonUnique = true;
					 break;
				}
			}
			
		} while(nonUnique);
		
		return uuid;
	
}

	       // Generate a new Universal unique ID for Account
	        public String getNewAccountUUID() {
		

		     //inits
		
		        String uuid;
		
		        Random rng = new Random();
		
		        int len = 10;
		
		        boolean nonUnique;
		
		//continue looping until we get a unique ID
		do {
			
			//generate the number
			uuid = "";
			for (int c=0; c<len; c++) {
				uuid += ((Integer)rng.nextInt(10)).toString();
				
			}
			// check to make sure its unique
			nonUnique = false;
			for(Account a : this.accounts) {
				
				if(uuid.compareTo(a.getUUID()) == 0) {
					 nonUnique = true;
					 break;
				}
			}
			
		} while(nonUnique);
		
		return uuid;
	
	}
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param pin
	 * @return
	 */
	public User addUser(String firstName, String lastName, String pin) {
		
		//Create a new User object and add it to our list
		User newUser = new User(firstName, lastName, pin, this);
		
		this.users.add(newUser);
		
		// Create a saving account for the user and add to User and account lists
		Account newAccount = new Account("Saving", newUser, this);
		
				newUser.addAccount(newAccount);
				this.accounts.add(newAccount);
				
				return newUser;
		
	}
	      /**
	       * Search through the User to find out if the pin is correct or not
	       * @param userID
	       * @param pin
	       * @return
	       */
	      public User userLogin(String userID, String pin) {
	    	  
	    	  //search through lists of users
	    	  for(User u : this.users) {
	    		  
	    		  //check user ID is correct
	    		  if(u.getUuid().compareTo(userID) == 0 && u.validatePin(pin)) {
	    			  
	    			  return u;
	    		  }
	    	  }
	    	  
	    	  
	      // if we haven't found the user or have an incorrect pin
	    	  return  null;
	      }

	  	/**
	  	 * Create a new Bank Object with empty Lists of user and account
	  	 * @param name   the  name of the bank
	  	 */
	  	public Bank(String name) {
	  		
	  		this.name = name;
	  		this.users = new ArrayList<User>();
	  		this.accounts = new ArrayList<Account>();
	  	}

		public void addAccount(Account newAccount) {
			// TODO Auto-generated method stub
			
		}

}
