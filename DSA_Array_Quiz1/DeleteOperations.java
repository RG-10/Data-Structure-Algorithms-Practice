package pk.com.uog.DSA_Array_Quiz1;

public class DeleteOperations {

	static int count = 5;
	  
	  public static void main(String[] args) {
	    
	    int a[] = {12, 34, 45, 6, 13};
	    DeleteOperations Dop = new DeleteOperations(); 
	    Dop.print(a);
	    
	    Dop.deleteFromEnd(a);
	    Dop.print(a);
	    
	    Dop.deleteValue(a, 6);
	    Dop.print(a);
	    
	    Dop.deleteFromPosition(a, 3); //a specifies array 1 specifies array index
	    
	  }
	  
	  /*
	   * It'll delete last value from array
	   */
	  public void deleteFromEnd(int[] a) {
	    if(a.length == 0) {
	      return;
	    }
	    
	    count--;
	  }
	  
	  /*
	   * It'll delete given value from array
	   */
	  public void deleteValue(int a[], int val) {
	    int i;
	    for(i = 0; i< count; i++) {
	      if(a[i] == val) {
	        break;
	      }
	    }
	    
	    if(i == count) {
	      System.out.println("Value doesn't exists in array");
	      return;
	    }
	    
	    for(int j = i; j < count - 1; j++) {
	      a[j] = a[j + 1];
	    }
	    
	    count--;
	  }
	  
	  /*
	   * It'll delete given value from given position in array
	   */
	  public void deleteFromPosition(int a[], int position) {
	    if(position > count || position <= 0) {
	      System.out.println("Invalid Position");
	      return;
	    }
	    
	    for(int i = position - 1; i < count - 1; i++) {
	      a[i] = a[i + 1];
	    }
	    
	    count--;
	  }
	  
	  //It print the values
	  
	  public void print(int[] a) {
	    for(int i = 0; i < count; i++) {
	      System.out.print(a[i] + " ");
	    }
	    
	    System.out.println();
	  }

	}

	 
