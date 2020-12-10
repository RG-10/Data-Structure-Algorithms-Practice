package pk.com.uog.DSA_HomeTasks;


public class MakingNodes {
	
	class Node{
		
		int data;
		
		String name;
		
		String roll;
		
		Node next;
		
		Node Start;
		
		public Node(int data,String name, String roll) {  
			
			this.data = data;
			
			this.name = name;
			
			this.roll = roll;
			
			this.next = null;
		}
	}
	
	//Represent the head and tail of the singly linked list
	
	public Node head = null;
	
	public Node tail = null;
	
	//addNode() will add a new node to the list
	
	public void addNode(int data, String name, String roll) { 
		
		//creat new node
		
		Node newNode = new Node(data, name, roll);  
		
		//now check if the link is empty
		
		if(head ==  null) {
			
			head = newNode;
			
			tail = newNode;
		}
		else {
			
			//newNode will be added after tail such that tail's next will point to newNode
			
			tail.next = newNode;
			
			//newNode will become new tail of the list
			
			tail = newNode;
			
		}
		
	}
	
	//display() will display all the nodes present in the list 
	
	public void display() {
		
		//Node current will point to head
		
		Node current = head;
		if(head == null) {
			
			System.out.println("Node is empty");
			return;
		}
		System.out.println("Home Task is DONE :) : ");
		
		while(current != null) {
			
			//prints each node by incrementing pointer
			
			System.out.println(current.data  + " "+current.name + " "+current.roll + " "); 
			
			current = current.next;
			
		}
		System.out.println();
		System.out.println();
		
	}
	
	public void push(int data, String name, String roll) {
		
		Node newNode = new Node(data, name, roll);
		
		newNode.next = head;
		head = newNode;
		
		
	}
	
	public static void main(String[] args) {
		
		MakingNodes sList = new MakingNodes();
		
		//Add nodes to the list
		
		sList.addNode(1, "---Usama Raheem---"    , "19011519-002");
		sList.addNode(2, "---Saleem Akhter---"   , "19011519-034");    
	    sList.addNode(3, "---Toseef Haider---"   , "19011519-003");    
	    sList.addNode(4, "---Hassaan Ahmed---"   , "19011519-027");   
	    sList.addNode(5, "---Saqib ali---"       , "19011519-031");
	    sList.addNode(6, "---UsamaSaeed---"      , "19011519-044");
	    sList.addNode(7, "---QaseemHussain---"   , "19011519-089");
	    sList.addNode(8, "---MrUsama---"         , "19011519-001");
	    sList.addNode(9, "---FaisalIqbal---"     , "19011519-008");
	    sList.addNode(10,"---HamzaLatif---"      , "19011519-045");
	   
	    
	    //This makes the node and bring in to the first place
	    sList.push(11, "---tahir---"                    , "19011519-99");
	    sList.push(12, "---THE-NODE---"                 , "19011519-007");
	    
		
	    //Displays the nodes present in the list    
        sList.display(); 
        
	}
	
	
	 
}
