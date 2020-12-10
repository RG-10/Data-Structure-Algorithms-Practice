package pk.com.uog.DSA_Array_Quiz1;

public class TraverseOperation {
	
	public static void main(String [] args) {
		
		int[] x = {2, 1, 5, 8, 12,13,15,16,16};
		
		for(int i=0; i < x.length; i++) {     //This prints the array values
			
			System.out.print(x[i] + "  ");
			
			x[i] = x[i] * 2;   //this multiply all element with 2
		}
		
		for(int t:x) {
			System.out.println(t+ " ");    //t is a temporary variable
		}
	}

}
