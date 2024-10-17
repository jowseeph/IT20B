package abunda_lab_exercises;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueAct {
    public static void main(String[] args) {
        
        // Creating a PriorityQueue with reverse order (highest priority first)
        Queue<String> myQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        // Adding elements to the priority queue
        myQueue.offer("B");
        myQueue.offer("C");
        myQueue.offer("A");
        myQueue.offer("E");
        myQueue.offer("D");
        
        // Polling elements until the queue is empty
        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.poll());
        }
        
        // Uncomment the following line to see the state of the queue after polling (it will be empty)
        // System.out.println("After polling: " + myQueue);
    }
}
