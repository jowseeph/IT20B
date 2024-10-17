package midterm;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueueExample {

    public static void main(String[] args) {
        // Creating a queue using a LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        // Accessing and removing elements from the queue (FIFO)
        String firstElement = queue.poll(); // Removes and returns "Apple"
        System.out.println("Removed: " + firstElement);
        
        String secondElement = queue.poll(); // Removes and returns "Banana"
        System.out.println("Removed: " + secondElement);

        // Printing the remaining elements in the queue
        System.out.println("Remaining elements in the queue: " + queue);

        // Adding more elements to the queue
        queue.add("Date");
        queue.add("Eggplant");

        // Accessing and removing elements from the queue (FIFO)
        String thirdElement = queue.poll(); // Removes and returns "Cherry"
        System.out.println("Removed: " + thirdElement);

        // Printing the remaining elements in the queue
        System.out.println("Remaining elements in the queue: " + queue);
    }
}

