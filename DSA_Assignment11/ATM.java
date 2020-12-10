package pk.com.uog.DSA_Assignment11;

import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Bank theBank = new Bank("National Bank Of Pakistan");
	
	// add a user, which also create a saving account
	User aUser = theBank.addUser("Raheem", "Usama", "0000");
	
	// add a checking account for the user
	Account newAccount = new Account("Checking", aUser, theBank);
	
	aUser.addAccount(newAccount);
	theBank.addAccount(newAccount);
	
	
	User curUser;
	while(true) {
		
		// stay in the login prompt until successful login
		curUser = ATM.mainMenuPrompt(theBank, sc);
		
		// stay in main menu until user quits
		ATM.printUserMenu(curUser, sc);
	}
	
}
	
	  /**
	   * 
	   * @param theBank
	   * @param sc   Scanner object to take input from the user
	   * @return
	   */
	  public static User mainMenuPrompt(Bank theBank, Scanner sc) {
		  
		  
		  // inits
		  String userID;
		  
		  String pin;
		  
		  User authUser;
		  
		  //prompt the user for user ID/pin combo until a correct one is reached
		  do {
			  
			  System.out.printf("\n\n[------Welcome to %s------]\n\n", theBank.getName());
			  
			  System.out.print("Please Enter user ID--> ");
			  userID = sc.nextLine();
			  
			  System.out.print("Please Enter pin--> ");
			  pin = sc.nextLine();
			  
			  // try to get the user object corresponding to the ID and pin combo
			  
			  authUser = theBank.userLogin(userID, pin);
			  
			  if(authUser == null) {
				  
				  System.out.println("Oops! Incorrect user ID/pin combination. " +
				  "Please try again-->");
			  }
				  
		  } while(authUser == null );    //continue looping until successful login
		  
		  return authUser;
	  }
	  
	  
	  /**
	   * 
	   * @param theUser
	   * @param sc
	   */
	  public static void printUserMenu(User theUser, Scanner sc) {
		  
		  //Print a summary of the user'saccount
		  theUser.printAccountsSummary();
		  
		  
		  //inits
		  int choice;
		  
		  //user menu
		   do {
			   
			  System.out.printf("------Welocom %s, what would you like to do?------\n",
					  theUser.getFirstName());
			  
			  System.out.println(" [==== 1. Show Account Transaction History.====]");
			  System.out.println(" [==== 2. withdraw-------------------------====]");
			  System.out.println(" [==== 3. Deposit--------------------------====]");
			  System.out.println(" [==== 4. Transfer-------------------------====]");
			  System.out.println(" [==== 5. Exit-----------------------------====]");
			  System.out.println();
			  System.out.println("Please enter your-choice--> ");
			  choice = sc.nextInt();
			  
			  if(choice < 1 || choice > 5) {
				  
				  System.out.println("Ooops! Invalid choice. Please choose [1-5]");
			  }
			  
		  }
		    while(choice <1 || choice > 5);
		  
		  
		  //process the choice below
			  switch(choice) {
		  
		  case 1: 
			  ATM.showTransHistory(theUser, sc);
			  break;
			  
		  case 2:
			  ATM.withdrawFunds(theUser, sc);
			  break;
			  
		  case 3:
			  ATM.depositFunds(theUser, sc);
			  break;
			  
		  case 4:
			  ATM.transferFunds(theUser , sc);
			  break;
			  
		  case 5:
			  //Gobble up the previous input, means it will never ask for relogin User
              sc.nextLine();
              break;
		  }
			  
			  //Redisplay this menu unless the user wants to quit
			  if (choice != 5) {
				  
				  ATM.printUserMenu(theUser, sc);
			  }
	  }
	  
		  /**
		   * show the transaction history of an account 
		   * @param theUser    the logged in user object
		   * @param sc         the scanner object used for User input
		   */
		  public static void showTransHistory(User theUser, Scanner sc) {
			  
			  int theAcct;
			  
			  // get account whose transaction history to look at
			   do {
				  
				  System.out.printf("Please Enter the number (1-%d) of the account\n" +
				                    "whose transactions you want to see: ", 
				                    theUser.numAccounts() );
				  
				  theAcct = sc.nextInt()-1;
				  
				  if(theAcct < 0 || theAcct >= theUser.numAccounts()) {
					  
					  System.out.println("Oops! Invalid Account. Please try again :)");
				  }
				  
			  } while(theAcct < 0 || theAcct >= theUser.numAccounts());
			  
			  
			  // print the transaction history
			  theUser.printAcctTransHistory(theAcct);
		  }
		  
		  
		  /**
		   * Process transferring funds from one account to another
		   * @param theUser      the logged-in User object
		   * @param sc           the scanner object used for user input
		   */
		  public static void transferFunds(User theUser, Scanner sc) {
			  
			  //inits
			  
			  int fromAcct;
			  
			  int toAcct;
			  
			  double amount;
			  
			  double acctBal;
			  
			  //Getting the account to transfer money from
			  
			  do {
				  
				  System.out.printf("Enter the number (1-%d) of the account\n" +
				                  "to transfer from: ", theUser.numAccounts());
				  
				  fromAcct =  sc.nextInt()-1;
				  
				  if(fromAcct < 0 || fromAcct >= theUser.numAccounts()) {
					  System.out.println("Ooops! Invalid account. Please try again.");
				  }
				  
			  } while(fromAcct < 0 || fromAcct >= theUser.numAccounts());
			  
			  acctBal = theUser.getAcctBalance(fromAcct);
			  
			  
			  // get the account to transfer to
                 do{
				  
				  System.out.printf("Enter the number (1-%d) of the account\n" +
				                  "to deposit in: ", theUser.numAccounts());
				  
				  toAcct =  sc.nextInt()-1;
				  
				  if(toAcct < 0 || toAcct >= theUser.numAccounts()) {
					  System.out.println("Ooops! Invalid account. Please try again.");
				  }
				  
			  } while(toAcct < 0 || toAcct >= theUser.numAccounts());
                 
                  
                  // get the amount to transfer
                  do {
                	  
                	  System.out.printf("Please Enter the amount to Transfer (max PKR%.02f): PKR",
                			  acctBal);
                	  
                	  amount = sc.nextDouble();
                	  
                	  if(amount < 0) {
                		  
                		  System.out.println("Amount must be Greater than zero.");
                		  
                	  } else if (amount > acctBal) {
                		  
                		  System.out.printf("Amount must not be greater than\n"  +
                		                "balance of PKR%.02f.\n", acctBal);
                	  }
                	  
                  } while(amount < 0 || amount > acctBal);
                  
                  
                  // Finally do the Transfer
                  theUser.addAcctTransaction(fromAcct, -1*amount, String.format(
                		  "Transfer to account %s" , theUser.getAcctUUID(toAcct)));
                  
                  theUser.addAcctTransaction(toAcct, amount, String.format(
                		  "Transfer to account %s" , theUser.getAcctUUID(fromAcct)));
                 
		  }
		  
		  
		  /**
		   * process a fund withdrawal from an account
		   * @param theUser    the logged in User object
		   * @param sc         the scanner object user for user input
		   */
		  public static void withdrawFunds(User theUser , Scanner sc) {
			  
              // inits
			  int fromAcct;

			  double amount;
			  
			  double acctBal;
			  
			  String memo;
			  
			  //get the account to transfer money from
			  do {
				  
				  System.out.printf("Enter the number (1-%d) of the account\n" +
				                  "to withdraw from: ", theUser.numAccounts());
				  
				  fromAcct =  sc.nextInt()-1;
				  
				  if(fromAcct < 0 || fromAcct >= theUser.numAccounts()) {
					  
					  System.out.println("Ooops! Invalid account. Please try again.");
				  }
				  
			  } while(fromAcct < 0 || fromAcct >= theUser.numAccounts());
			  
			    acctBal = theUser.getAcctBalance(fromAcct);
			  
			  
			  // Get the amount to transfer
              do {
            	  
            	  System.out.printf("Please Enter the amount to Transfer (max PKR%.02f): PKR",
            			  acctBal);
            	  
            	  amount = sc.nextDouble();
            	  
            	  if(amount < 0) {
            		  
            		  System.out.println("Amount must be Greater than zero.");
            	  } 
            	  
              } while(amount < 0 );
              
              // Gobble up the previous input
              sc.nextLine();
              
              // Get the memo
              System.out.print("Please Enter a memo: ");
              memo = sc.nextLine();
              
              
              //Do the Widthdrawl
              theUser.addAcctTransaction(fromAcct, -1*amount, memo);
              
		  }
		  
		  /**
		   * Process a fund deposit to the account
		   * @param theUser    the logged in user object
		   * @param sc         the scanner object used for user input
		   */
		  public static void depositFunds(User theUser , Scanner sc) {
			  
			  
             //inits
			  
			  int toAcct;

			  double amount;
			  
			  double acctBal;
			  
			  String memo;
			  
			  // Get the account to transfer money from
		      do {
				  
				  System.out.printf("Enter the number (1-%d) of the account\n" +
				                  "to deposit in: ", theUser.numAccounts());
				  
				  toAcct =  sc.nextInt()-1;
				  
				  if(toAcct < 0 || toAcct >= theUser.numAccounts()) {
					  
					  System.out.println("Ooops! Invalid account. Please try again.");
				  }
				  
			  } while(toAcct < 0 || toAcct >= theUser.numAccounts());
			  
			    acctBal = theUser.getAcctBalance(toAcct);
			  
			  
			  // Get the amount to transfer 
              do {
            	  
            	  System.out.printf("Please Enter the amount to withdraw (max PKR%.02f): PKR",
            			  acctBal);
            	  
            	  amount = sc.nextDouble();
            	  
            	  if(amount < 0) {
            		  
            		  System.out.println("Amount must be Greater than zero.");
            	  } 
            	  
              } while(amount < 0);
              
              // Gobble up the previous input
              sc.nextLine();
              
              
              
              // Get the memo
              System.out.print("Please Enter a memo: ");
              memo = sc.nextLine();
              
              
              // Do the widthdrawl
              theUser.addAcctTransaction(toAcct, amount, memo);
			  
		  }
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

