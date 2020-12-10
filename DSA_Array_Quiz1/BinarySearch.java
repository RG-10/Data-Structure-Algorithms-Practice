package pk.com.uog.DSA_Array_Quiz1;

public class BinarySearch {

	
	  public static void main(String[] args) {
	    int a[] = {12, 34, 45, 65, 83};
	    
	    BinarySearch bS = new BinarySearch();
	    int i = bS.searchIndex(a, 45, 0, a.length - 1);
	    
	    System.out.println(i);
	  }
	  
	  /*
	   * It'll search value in array using Binary Search
	   */
	  public int searchIndex(int[] a, int val, int startIndex, int endIndex) {
	    if(a.length == 0 || startIndex > endIndex) {
	      return -1; //return nothing value is not in array
	    }
	    
	    int mid = (startIndex + endIndex) / 2;
	    
	    if(a[mid] == val) {
	      return mid;  //return mid value in index
	    }
	    
	    if(val > a[mid]) {
	      return searchIndex(a, val, mid + 1, endIndex); //if value at end then it execute
	    } else {
	      return searchIndex(a, val, startIndex, mid - 1); //if value at start then it execute
	    }
	  }
	  }
