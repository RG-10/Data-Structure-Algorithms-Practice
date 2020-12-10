package pk.com.uog.DSA_Assignment_Trees;
/* Class containing left and right child of current 
   node and key value*/
public class Node 
{ 
    int data; 
    Node left;
    Node right; 
  
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 