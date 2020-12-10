package pk.com.uog.DSA_Assignment_SS_Techs;

public class LinearSearch_ {

	public static void main(String[] args) {
		int[] arr = { 5,3,6,1,4,2};
		int item = 3;
		int temp = 0;  //if the element is not presented in array it will show that there is no such element here
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == item) 
			{
				
				System.out.println("The Particular Element is presented at index position--> "+i+"");
				temp = temp+1;
			}
		}
			
			if(temp==0)
			{
				System.out.println("We are SORRY! there is no such element found in our List :(");
			}
		}

	}


