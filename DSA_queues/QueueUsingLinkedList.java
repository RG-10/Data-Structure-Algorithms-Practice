package pk.com.uog.DSA_queues;

class QueueNode {
    int key;
    QueueNode next;

    public QueueNode(int key) {
        this.key = key;
        this.next = null;
    }
}


class QueueUsingLinkedList {
    QueueNode front, rear;

    public QueueUsingLinkedList() {
        this.front = this.rear = null;
    }

    void enqueue(int key) {

        QueueNode temp = new QueueNode(key);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    QueueNode dequeue() {
        if (this.front == null)
            return null;

        QueueNode temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
        return temp;
    }

    void display(){
        if (this.front == null)
            System.out.println("");
        QueueNode temp = this.front;
        while(temp != null){
            System.out.print(temp.key + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Implementing Queue Using LinkedList\n");
        QueueUsingLinkedList qUsingLinkedList = new QueueUsingLinkedList();
        qUsingLinkedList.enqueue(10);
        qUsingLinkedList.enqueue(20);
        qUsingLinkedList.enqueue(30);
        
        System.out.println("\nQueue After Enqueue Operation\n");
        qUsingLinkedList.display();
        qUsingLinkedList.dequeue();
        qUsingLinkedList.dequeue();
        System.out.println("\nQueue After Dequeue Operation\n");
        qUsingLinkedList.display();
        qUsingLinkedList.enqueue(30);
        qUsingLinkedList.enqueue(40);
        qUsingLinkedList.enqueue(50);
        System.out.println("\nQueue After Enqueue Operation\n");
        qUsingLinkedList.display();
        System.out.println("De queued item is " + qUsingLinkedList.dequeue().key);
    }
}
