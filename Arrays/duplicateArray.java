package pk.com.uog.DSA.Arrays;

public class duplicateArray {

	public static void main(String[] args) {
		  //Initialize array   
        int [] arrayindex = new int [] {1, 2, 3, 4, 2, 7, 9, 9, 3};   
          
        System.out.println("Duplicate elements in given array after searching: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arrayindex.length; i++) {  
            for(int j = i + 1; j < arrayindex.length; j++) {  
                if(arrayindex[i] == arrayindex[j])  
                	
                    
                    System.out.println(arrayindex[j]);  
            }  
        }  

	}

}
