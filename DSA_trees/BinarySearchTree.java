package pk.com.uog.DSA_trees;


public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTreeUtil BinarySearchTreeUtil = new BinarySearchTreeUtil();
        System.out.println("\nBinary Search Tree Operations\n");
        int[] arr = {12, 9, 100, 0, 76, 54, 5, 7, 0,12,34,56};
        System.out.println("Starting Insert Operation on Binary Search Tree\n");
        System.out.println("Inserting arr elements in Binary Search Tree\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element To be inserted now is " + arr[i] + "\n");
            BinarySearchTreeUtil.insert(arr[i]);
        }
        System.out.println("Binary Search Tree After all insert operation\n");
        BinarySearchTreeUtil.printTree();
        System.out.println();
        System.out.println("\nStarting Search Operation in Binary Search Tree\n");
        System.out.println("\nSearch result : " + BinarySearchTreeUtil.search(76));

        System.out.println("\nStarting Delete Operation in Binary Search Tree\n");
        System.out.println("\nElement to be deleted is "+ 76 + " \n");
        BinarySearchTreeUtil.delete(76);
        System.out.println();
        System.out.println("\nBinary Search Tree After Delete operation\n");
        BinarySearchTreeUtil.printTree();
        System.out.println();
    }
}
