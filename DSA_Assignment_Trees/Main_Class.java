package pk.com.uog.DSA_Assignment_Trees;
public class Main_Class {

	public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); 
        
        /*create root*/
        tree.root = new Node(5); 
  
        /* following is the tree after above statement 
  
              5 
            /   \ 
          null  null     */
  
        tree.root.left = new Node(9); 
        tree.root.right = new Node(8); 
  
        /* 9 and 8 become left and right children of 1 
               5 
             /   \ 
            9      8 
          /    \    /  \ 
        null null null null  */
  
  
        tree.root.left.left = new Node(10); 
        /* 10 becomes left child of 2 
                    5 
                /       \ 
               9          8 
             /   \       /  \ 
            10    null  null  null 
           /   \ 
          null null 
         */
        System.out.println("The--TREE--IS-- Pre-Order Traversed");
        BinaryTree.printPreorder(tree.root);
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        BinaryTree.findLeftAndRightChild(tree.root, 5);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        Node sibling = tree.getSibling(tree.root, 10);
        if(sibling != null) {
        	System.out.println(sibling.data);
        }
        else
        	System.out.println("Ooops! there's No Siblings here!");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        BinaryTree.findParent(tree.root, 10, 1);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        tree.isEmpty(tree.root);
	}

}
