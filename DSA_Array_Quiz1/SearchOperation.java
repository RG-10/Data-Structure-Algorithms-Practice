package pk.com.uog.DSA_Array_Quiz1;

public class SearchOperation {

	public static void main(String[] args) {
	    int a[] = {12, 34, 45, 6, 13};
	    
	    SearchOperation obj = new SearchOperation();
	    int i = obj.searchIndex(a, 13);
	    
	    System.out.println(i);
	  }
	  
	  /*
	   * It'll search value in array & return index
	   */
	  public int searchIndex(int a[], int val) {
	    if(a.length == -1) {
	      return -1;
	    }
	    
	    for(int i = 0; i < a.length; i++) {
	      if(a[i] == val) {
	        return i;                 //This prints the value which is to be searched
	      }
	    }
	    
	    return -1;
	  }
	  }
