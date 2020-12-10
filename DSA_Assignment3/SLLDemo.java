package pk.com.uog.DSA_Assignment3;

	public final class SLLDemo
	{
	   private static class Node
	   {
	      String name;
	      Node next;
	   }

	   public static void main(String[] args)
	   {
	      Node top = null;

	      // 1. The singly linked list does not exist.

	      top = new Node();
	      top.name = "Usama";
	      top.next = null;
	      dump("Case 1", top);

	      // 2. The singly linked list exists and the node must be inserted
	      //    before the first node.

	      Node temp;
	      temp = new Node();
	      temp.name = "Raheem";
	      temp.next = top;
	      top = temp;
	      dump("Case 2", top);

	      // 3. The singly linked list exists and the node must be inserted
	      //    after the last node.

	      temp = new Node();
	      temp.name = "Gondal";
	      temp.next = null;
	      Node temp2;
	      temp2 = top;
	      while (temp2.next != null)
	         temp2 = temp2.next;
	      temp2.next = temp;
	      dump("Case 3", top);

	      // 4. The singly linked list exists and the node must be inserted
	      //    between two nodes.

	      temp = new Node();
	      temp.name = "Akhter";
	      temp2 = top;
	      while (temp2.name.equals("Usama") == false)
	         temp2 = temp2.next;
	      temp.next = temp2.next;
	      temp2.next = temp;
	      dump("Case 4", top);

	      // 5. Delete the first node.

	      top = top.next;
	      dump("After first node deletion", top);

	      // 5.1 Restore node B.

	      temp = new Node();
	      temp.name = "Raheem";
	      temp.next = top;
	      top = temp;

	      // 6. Delete any node but the first node.

	      temp = top;
	      while (temp.name.equals("Usama") == false)
	         temp = temp.next;
	      temp.next = temp.next.next;
	      dump("After Akhter node deletion", top);
	   }

	   private static void dump(String msg, Node topNode)
	   {
	      System.out.print(msg + " ");
	      while (topNode != null)
	      {
	         System.out.print(topNode.name + " ");
	         topNode = topNode.next;
	      }
	      System.out.println();
	   }
	}


