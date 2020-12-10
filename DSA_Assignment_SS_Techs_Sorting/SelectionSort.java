package pk.com.uog.DSA_Assignment_SS_Techs_Sorting;

public class SelectionSort {
    static void display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int array[] = {20, 10, 63, 25, 96, 57};
        int size = array.length;
        System.out.println("Selection Sort");
        System.out.println("\nInput array");
        display(array);
        selectionSort(array, size);
        System.out.println("\nOutput array");
        display(array);
    }

    private static void selectionSort(int[] array, int size) {
        for (int i = 0; i < size - 1; i++) {
            int min = i;

            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}