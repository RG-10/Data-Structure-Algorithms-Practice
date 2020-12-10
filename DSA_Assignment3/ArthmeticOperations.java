package pk.com.uog.DSA_Assignment3;

public class ArthmeticOperations {

	/*
     * You have two numbers represented by a linked list, where each node contains a single digit.
     * The digits are stored in reverse order, such that the 1's digit is at the head of the list.
     * Write a function that adds the two numbers and returns the sum as a linked list
     * 
     */

    public static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2) {
        int l1sum = 0;
        int l2sum = 0;
        int multiplier = 1;

        while(l1 != null) {
            l1sum = l1sum + l1.value*multiplier;
            multiplier = multiplier*10;
            l1 = l1.next;
        }
        multiplier = 1;
        while(l2 != null) {
            l2sum = l2sum + l2.value*multiplier;
            multiplier = multiplier*10;
            l2 = l2.next;
        }

        int total = l2sum + l1sum;

        char[] totalnum = (total + "").toCharArray();
        int len = totalnum.length;
        LinkedListNode tail = new LinkedListNode(totalnum[len - 1] - '0');
        LinkedListNode newNode;
        LinkedListNode prevNode = tail;
        System.out.print(totalnum);

        for (int i = len - 2; i >= 0; i--) {            
            newNode = new LinkedListNode(totalnum[i] - '0');
            prevNode.next = newNode;        
            prevNode = newNode; 
        }
        return tail;
    }   }
