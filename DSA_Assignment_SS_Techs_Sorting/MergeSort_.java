package pk.com.uog.DSA_Assignment_SS_Techs_Sorting;

public class MergeSort_ {
	
	int[] array;
	int[]tempMergeArr;
	int length;
	
	public static void main (String[] args) {
		
		int[] inputArr = {48, 36,13,52,19,94,21,1,24, 34};      //length value = 9
		MergeSort_ ur = new MergeSort_();
		ur.sort(inputArr);
		
		for(int i:inputArr) {     
			
			
			System.out.print(i+ " ");                          //for printing the element of the array
			
		}
	}
	
	public void sort(int inputArr[]) {
		
		this.array = inputArr;
		this.length = inputArr.length;                         //this finds the length of array
		this.tempMergeArr = new int[length];                   //this creates a temporary array here
		divideArray(0, length-1);                              // calling the divideArray method here
	   //here i pass the counted length of the array
	}
	
	
	
	//divide and conquer technique first divide and then merge
	//method for divide Array that takes two arguments
	//this sorting is worked upon recursive method
	
	public void divideArray(int lowerIndex, int higherIndex) {
		
		if(lowerIndex < higherIndex) {
			
			
			//this will return the middle element in the array 
			int middle = lowerIndex + (higherIndex - lowerIndex)/2; 
			
			
			// basically it will sort the left side of an array       // lowerIndex value = 0 and higherIndex value = 6 so this will gives 0+6/2=3 which is middle value
			divideArray(lowerIndex, middle);                          // here i use recursive approach to call my own function 
	        
			
			
			
			// it will sort the right side of an array
			divideArray(middle + 1, higherIndex);                     // again call my own self recursively
			
			
			//here i call the mergeArray function
			mergeArray(lowerIndex, middle, higherIndex); 
			
		}
		
			
			
		}

	  //create method for merge the array and give it 3 arguments which are lowerIndex, higherIndex and middle
	
	   public void mergeArray(int lowerIndex, int middle, int higherIndex) {
		   
		   //here i put array values in temp array for sorting
		   for(int i = lowerIndex; i<=higherIndex; i++) {
			   
			   tempMergeArr[i] = array[i];  //shift the array element into temp array
			   
			   
		   }
		   
		   //below are the final steps code in which both left and right array being compared and sorted and val..
		   //increased at the same time
		   
		   int i = lowerIndex;
		   int j = middle+1;
		   int k = lowerIndex;
		   
		   while(i<=middle && j<=higherIndex) {
			   
			   
			   if(tempMergeArr[i] <= tempMergeArr[j]) {   //it check this value if it is smaller 
				   array[k] = tempMergeArr[i];            //if above condition is true then  it insert value in original array which is array[k]        
				   i++;                                   //then Inc i means no matching previous element in the list
			   }
			   else
			   {
				   array[k] = tempMergeArr[j];    //same condition in else--if second value is small then j position values are inserted into k position 
				   
				   j++;                           //Inc the j means that element is eliminate from the list
			   }
			   k++;
		   }
		   
		   while( i <= middle) {
			   
			   array[k] = tempMergeArr[i];        //it will replace the value of i into original array which is k
			   k++;
			   i++;
					   
		   }
		
		
	}

}
