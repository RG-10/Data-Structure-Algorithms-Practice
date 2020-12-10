package Practice1;

import java.util.Scanner;

public class DSA_Practice3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		System.out.println("Please enter the size of Array :");
		 int n = sr.nextInt();
		 
		 int[] arr = new int[n];
		 System.out.println("Please enter values :");
		 for(int i=0; i<arr.length; i++) {
			 
			 arr[i] = sr.nextInt();
			 
		 }
		 
		 for(int i=0; i<arr.length-1; i++) {
			 for(int j=i+1; j<arr.length; j++) {
				 
				 if(arr[i] == arr[j]){
					 
					 System.out.println("Duplicate Elememt " +arr[i]+  "at index :" +i + "and" + j);
				 }
			 }
		 }

	}

}
