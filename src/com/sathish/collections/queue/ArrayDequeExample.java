package com.sathish.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
/**
 * 
 * @author Sathish
 *
 */
public class ArrayDequeExample {

	public static void main(String[] args) {
		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Sathish");
		deque.add("Kariyanna");
		deque.add("Sam");
		deque.add("Tom");
		// Traversing elements in the Queue
		for (String str : deque) {
			System.out.println(str);
		}

	}

}
