package queue_lect;

public class Queue_lect {

    public static void main(String[] args) {
       Queue q = new Queue(10);
       q.enqueue(10);
       q.enqueue(20);
       q.enqueue(30);
       q.enqueue(40);
       q.enqueue(50);
       q.enqueue(60);
       q.enqueue(70);
       q.enqueue(90);
       q.enqueue(90);
       q.enqueue(100);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
    
}
