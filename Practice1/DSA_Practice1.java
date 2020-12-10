package Practice1;

public class DSA_Practice1 {

	public static void main(String[] args) {
		                   
		
		//This is duplicate element in array
		
		int[] arr = {1,9,4,6,7,6,5,9,18,17,18,20,20,};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if (arr[i] == arr[j])
					
				
			
			{
				System.out.println("The Repeated Element in Array is :" +arr[j] );
			}
		
				
		}

	}
	}
}


