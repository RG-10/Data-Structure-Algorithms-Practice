package pk.com.uog.DSA_Assignment_SS_Techs_Sorting;

class InsertionSort {
    void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    static void display(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println("Insertion Sort");
        System.out.println("\nInput array");
        display(arr);
        InsertionSort ob = new InsertionSort();
        ob.insertionSort(arr);
        System.out.println("\nOutput array");
        display(arr);
    }
}
