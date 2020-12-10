package pk.com.uog.DSA_Assignment1;
import java.util.Scanner;


public class Assignment {

	


	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
	    Scanner scan = new Scanner(System.in);

	    int amount = 0;
	    int choice = 0;
	    int [] trans = new int[4];
	    @SuppressWarnings("unused")
		int sum;
	    int balance = 0;

	    while (choice != 4)
	    {
	        choice = menu();
	        switch(choice)
	        {
	        case 1:// 
	            System.out.print("Deposit. Amount? :");
	            amount = scan.nextInt();
	            balance = balance + amount;
	            makeTransactions(trans, amount);
	            break;

	        case 2:// 
	            System.out.print("Withdra. Amount?");
	            amount = scan.nextInt();
	            balance = balance - amount;
	            makeTransactions(trans, -amount);
	            break;

	        case 3:
	            showTransactions(trans, balance);
	            break;

	        case 4:
	            System.out.println("Thank you. ");
	            break;
	        }   

	    }
	}


	public static int menu()
	{
	    @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	    int choice = 0;

	    System.out.println("1. Deposit ");
	    System.out.println("2. Withdraw ");
	    System.out.println("3. Saldo ");
	    System.out.println("4. End ");
	    System.out.println();
	    System.out.println("Choice: ");

	    choice = scan.nextInt();
	    return choice;
	}

	public static void showTransactions(int [] trans, int balance)
	{
	    System.out.println();
	    System.out.println("Transactions summary :");
	    System.out.println();

	    for(int i = 0; i < trans.length-1; i++)
	    {
	        if(trans[i] == 0)
	        {
	            System.out.print("");
	        }

	        else
	        { 
	            System.out.print(trans[i] + "\n");
	            balance = balance + trans[i];

	        }

	    }
	    // Printing saldo. 
	    System.out.println();
	    System.out.println("Current balance: " + balance + " kr" + "\n" );
	    System.out.println();   

	}


	//Puts amount last among the transactions that are stored in the array. Using the findNr method to find the first available spot 
	//in the array. moveTrans is used to make room for the new transaction when the array is full.

	public static void makeTransactions(int [] trans, int amount )
	{
	    int position = findNr(trans);
	    if(position == -1)
	    {
	        moveTrans(trans);
	        position = findNr(trans);
	        trans[position] = amount;
	    }
	    else
	    {
	        trans[position] = amount;
	    }   

	}

	public static int findNr(int [] trans)
	{
	    int position = -1;

	    for(int i = 0; i <= trans.length-1; i++) 
	    {
	        if(trans[i] == 0)
	        {
	            position = i;
	            break;
	        }   
	    }
	    return position;
	}

	public static void moveTrans(int [] trans)
	{
	    for(int i = 0; i < trans.length-1; i++)

	        trans[0] = trans[i + 1] ;
	}
	}
