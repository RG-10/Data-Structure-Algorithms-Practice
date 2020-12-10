package Practice1;

import java.util.Scanner;

public class DSA_Practice2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int count = 0;
		
        Scanner sg = new Scanner(System.in);
        System.out.println("Please Enter value of n :");
        int n = sg.nextInt();
        
        
        int array[] = new int[n];
        int location = -1;
        System.out.println("Please Enter All Values :");
        
        for(int i=0; i<n; i++) {
        	
        	array[i] = sg.nextInt();
        	
        }
        
        System.out.println("The Particular Values are :");
        for (int i=0; i<n; i++) {
        	System.out.println(array[i]);
        }
        
            System.out.println("Please Enter Value to Search :");
            int r = sg.nextInt();
            
            
            for (int i=0; i<n; i++) {
            	
            	if (r == array[i]) {
            		
            		location = i;
            		count++;
            		
            		System.out.println("The Required Element is Found at Index :" +location);
            		
            		
            	}
            }
            
            if(location == -1) {
            	System.out.println("Sorry Element is not found");
            	
            }
            
               System.out.println("Total Number of Repeated elements in Index are :" +count);
          
	}

}
