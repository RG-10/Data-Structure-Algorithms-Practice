package pk.com.uog.DSA.Arrays;

public class BinarySearch {

	
	 // function to implement
    // binary search
    public static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;
 
        /*low + (high - low)/2;*/
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = { 5, 6, 7, 8, 9, 10 };
	        int n, key;
	        n = arr.length - 1;
	        key = 7;
	 
	        System.out.println("The Required Searched Index is : " + binarySearch(arr, 0, n, key));

	}
}
