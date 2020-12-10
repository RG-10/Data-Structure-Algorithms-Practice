package pk.com.uog.DSA_queues;


class QueueUsingArrays {
    private static int front, rear, capacity;
    private static int queue[];

    QueueUsingArrays(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    static void enqueue(int data) {
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        } else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    static void dequeue() {
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }

            if (rear < capacity)
                queue[rear] = 0;

            rear--;
        }
        return;
    }

    static void display() {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    static void startOfQueue() {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }

    @SuppressWarnings("unused")
	public static void main(String[] args) {
        System.out.println("Implementing Queue Using Array");
        QueueUsingArrays q = new QueueUsingArrays(4);
        QueueUsingArrays.display();

        QueueUsingArrays.enqueue(20);
        QueueUsingArrays.enqueue(30);
        QueueUsingArrays.enqueue(40);
        QueueUsingArrays.enqueue(50);
       

        

        QueueUsingArrays.display();

        QueueUsingArrays.enqueue(60);

        QueueUsingArrays.display();

        QueueUsingArrays.dequeue();
       
        System.out.printf("\n\nafter two node deletion\n\n");

        QueueUsingArrays.display();

        QueueUsingArrays.startOfQueue();
    }
}


