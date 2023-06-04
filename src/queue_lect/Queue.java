package queue_lect;

public class Queue { // FIFO
    int A[];
    int front, rear, size;
    
    public Queue(int n) {
        A = new int[n];
        front = -1;
        rear = 0;
        size = 0;
    }
    
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isFull() {
        if (size == A.length) {
            return true;
        } else {
            return false;
        }
    }
    
    public void enqueue(int e) {
        if (isFull()) { // true
            System.out.println("Sorry! the queue is full");
        } else if (front == -1 && rear == 0) { // empty queue
            front++;  // 0
            rear++;
            A[front] = e;
            size++;
        } else {
            A[rear] = e;
            rear = rear+(1%A.length); // rear++: error
            size++;
        }
    }
    
    public int dequeue() {
        if (isEmpty()) {
            return -1;
        } else {
            int temp = A[front];
            front = front++;
            size--;
            return temp;
        }
    }
}
