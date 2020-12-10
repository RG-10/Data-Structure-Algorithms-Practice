package pk.com.uog.DSA.Arrays;

public class Arrays {

	public static void main(String[] args) {
		
		
		
	  int x;
	  int y;
	  
	  int[] myArray;
	  
	  int[] Myarray;
	  
	  myArray = new int[4];
	  Myarray = new int[4];
	  
	  x = 5;
	  y= 20;
	  
	  myArray[0] = 0;
	  myArray[1] = 3;
	  myArray[2] = 0;
	  myArray[3] = x;
	 
	  Myarray[0] = y;
	  Myarray[1] = 0;
	  Myarray[2] = 3;
	  Myarray[3] = 0;
	 
	  
	

	  for (int i = 0; i < myArray.length; i++) {
		System.out.println(myArray[i]);
	}
	  
	  for (int j= 0; j<Myarray.length; j++) {
		  System.out.println(Myarray[j] );
	  }
	}

}
