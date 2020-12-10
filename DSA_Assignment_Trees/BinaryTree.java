package pk.com.uog.DSA_Assignment_Trees;
public class BinaryTree 
{ 
    // Root of Binary Tree 
    Node root; 
  
    // Constructors 
    BinaryTree(int key) 
    { 
        root = new Node(key); 
    } 
  
    BinaryTree() 
    { 
        root = null; 
    } 
    
    static void printPreorder(Node node) {
    	
    	if (node == null)
    		return;
    	
    	//first print the data of the node
    	
    	System.out.print(node.data + " ");
    	
    	//after printing it then recur on left child subtree
    	printPreorder(node.left);
    	
    	// now recur on right child subtree
    	printPreorder(node.right);
    }
    
    public Node getSibling(Node node , int key) {
    	
    	
    	if(node == null || node.data == key) {
    		return null;
    	}
    	
    	
    	if (node.left != null && node.left.data == key) {
    		return node.right;
    	}
    	
    	
    	if (node.right != null && node.right.data == key) {
    		return node.left;
    	}
    	
    	Node l = getSibling(node.left, key);
    	
    	if(l != null) {
    		return l;
    	}
    	
    	l = getSibling(node.right, key);
    	return l;
    }
    
    
    static void findParent(Node node, int value, int parent) {
    	
    	if (node == null)
    		return;
    	
    	// if current node is the required node
    	if (node.data == value)
    	{
    		//print its parent
    		System.out.println(parent);
    	}
    	
    	else 
    	{
    		//Recursive calls for the children of the current node
    		
    		//Current node is now the new parent
    		findParent(node.left, value, node.data);
    		findParent(node.right, value, node.data);
    	}
    }
    
    static void findLeftAndRightChild(Node node, int value) {
    	
    	if(node == null)
    		return;
    	if(node.data == value)
    	{
    		System.out.println("The Left child is--"+node.left.data+"--And TheRight child is--"+node.right.data);
    	}
//    	else
//    	{
//    		findLeftAndRightChild(node.left, value);
//    		
//    		findLeftAndRightChild(node.right, value);
//    	}
//    	else if(node.data == value) {
//    		System.out.println("This root has no child");
//    	}
    }
    
    public void isEmpty(Node node) {
    	if(node == null)
    	System.out.println("Ooops!---The tree is Empty");
    	else
    	System.out.println("Hurrah!---The tree in not Empty");
    }
} 