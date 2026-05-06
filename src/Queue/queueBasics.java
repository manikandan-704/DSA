package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueBasics {
    
    public static void main(String[] args) {
        
        // QUEUE = FIFO => First In First Out 
        // Queue is a collection designed for holding elements prior to processing
        //Linear data structure

        //enqueue= offer() ==>adding elements to the queue
        //dequeue= poll() ==> removing the element from the queue(first)

        Queue<String> QueueName= new LinkedList <> ();

        QueueName.offer("A");
        QueueName.add("B");
        QueueName.offer("C");
        QueueName.offer("D");
        
        QueueName.poll(); // removes A
        QueueName.remove();

        System.out.println(QueueName);
    }
}
