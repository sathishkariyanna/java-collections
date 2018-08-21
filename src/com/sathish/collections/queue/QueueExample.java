package com.sathish.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/**
 * 
 * @author Sathish
 *
 */
public class QueueExample {
    public static void main(String[] args) {
        // Create and initialize a Queue using a LinkedList
        Queue<String> personQueue = new LinkedList<>();

        // Adding new elements to the Queue (The Enqueue operation)
        personQueue.add("Mike");
        personQueue.add("King");
        personQueue.add("Tom");
        personQueue.add("Jon");


        System.out.println("personQueue : " + personQueue);
        
        // Check is a Queue is empty
        System.out.println("is personQueue empty? : " + personQueue.isEmpty());

        // Find the size of the Queue
        System.out.println("Size of personQueue : " + personQueue.size());

        // Check if the Queue contains an element
        String checkName = "Mike";
        if(personQueue.contains(personQueue)) {
            System.out.println("personQueue contains " + personQueue);
        } else {
            System.out.println("personQueue doesn't contain " + personQueue);
        }

        // Get the element at the front of the Queue without removing it using element()
        // The element() method throws NoSuchElementException if the Queue is empty
        String firstPersonInTheQueue =  personQueue.element();
        System.out.println("First Person in the person Queue (element()) : " + firstPersonInTheQueue);

        // Get the element at the front of the Queue without removing it using peek()
        // The peek() method is similar to element() except that it returns null if the Queue is empty
        firstPersonInTheQueue = personQueue.peek();
        System.out.println("First Person in the person Queue : " + firstPersonInTheQueue);

        System.out.println("***** Iterating over a Queue using Java 8 forEach() *****");
        personQueue.forEach(name -> {
            System.out.println(name);
        });

        System.out.println("\n***** Iterating over a Queue using iterator() *****");
        Iterator<String> personQueueIterator = personQueue.iterator();
        while (personQueueIterator.hasNext()) {
            String name = personQueueIterator.next();
            System.out.println(name);
        }

        System.out.println("\n***** Iterating over a Queue using iterator() and Java 8 forEachRemaining() *****");
        personQueueIterator = personQueue.iterator();
        personQueueIterator.forEachRemaining(name -> {
            System.out.println(name);
        });

        System.out.println("\n***** Iterating over a Queue using simple for-each loop *****");
        for(String name: personQueue) {
            System.out.println(name);
        }
        
        // Removing an element from the Queue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the Queue is empty
        String removedName = personQueue.remove();
        System.out.println("Removed from personQueue : " + removedName + " | New personQueue : " + personQueue);

        // Removing an element from the Queue using poll()
        // The poll() method is similar to remove() except that it returns null if the Queue is empty.
        removedName = personQueue.poll();
        System.out.println("Removed from personQueue : " + removedName + " | New personQueue : " + personQueue);
        
/*
        Methods in Queue:
		add()- This method is used to add elements at the tail of queue. More specifically, at the last of linkedlist if it is used, or according to the priority in case of priority queue implementation.
		peek()- This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
		element()- This method is similar to peek(). It throws NoSuchElementException when the queue is empty.
		remove()- This method removes and returns the head of the queue. It throws NoSuchElementException when the queue is impty.
		poll()- This method removes and returns the head of the queue. It returns null if the queue is empty.
*/

    }
}
