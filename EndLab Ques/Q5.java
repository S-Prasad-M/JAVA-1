interface QueueOperations {
    void enqueue(int item);
    int dequeue();
    int peek();
    boolean isEmpty();
    boolean isFull();
}

class MyQueue implements QueueOperations {
    private int[] queue;
    private int front;
    private int rear;

    public MyQueue(int capacity) {
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue item: " + item);
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear++;
            queue[rear] = item;
            System.out.println("Enqueued item: " + item);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue item.");
            return -1;
        } else {
            int item = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Dequeued item: " + item);
            return item;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No item to peek.");
            return -1;
        } else {
            int item = queue[front];
            System.out.println("Peeked item: " + item);
            return item;
        }
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return rear == queue.length - 1;
    }
}

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
