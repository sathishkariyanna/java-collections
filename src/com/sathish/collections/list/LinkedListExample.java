package com.sathish.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Sathish
 *
 */
public class LinkedListExample {

	public static void main(String[] args) {
		// Creating a LinkedList
		LinkedList<String> familyAndFriends = new LinkedList<>();

		// Adding new elements to the end of the LinkedList using add() method.
		familyAndFriends.add("Sathish");
		familyAndFriends.add("Sony");

		System.out.println("Initial LinkedList : " + familyAndFriends);

		// Adding an element at the beginning of the LinkedList
		familyAndFriends.addFirst("Kariyanna");
		System.out.println("After addFirst(\"Kariyanna\") : " + familyAndFriends);

		// Adding an element at the end of the LinkedList (This method is equivalent to
		// the add() method)
		familyAndFriends.addLast("Sanika");
		System.out.println("After addLast(\"Sanika\") : " + familyAndFriends);

		// Adding all the elements from an existing collection to the end of the
		// LinkedList
		List<String> faceBookFriends = new ArrayList<>();
		faceBookFriends.add("Sai");
		faceBookFriends.add("Vijay");

		familyAndFriends.addAll(faceBookFriends);
		System.out.println("After addAll(faceBookFriends) : " + familyAndFriends);

		System.out.println("**************Retrieve LinkedListElements ************ ");

		// Getting the first element in the LinkedList using getFirst()

		String firstElement = familyAndFriends.getFirst();
		System.out.println("First name in the list : " + firstElement);

		// Getting the last element in the LinkedList using getLast()
		String lastElement = familyAndFriends.getLast();
		System.out.println("last name in the list  : " + lastElement);

		// Getting the element at a given position in the LinkedList
		String secondName = familyAndFriends.get(1);
		System.out.println("second name in the list  : " + secondName);

		// Remove element from the LinkedList
		familyAndFriends.remove(4);
		System.out.println("After removing 5th eleement, list is : " + familyAndFriends);

		System.out.println("********Iterate over a LinkedList using Java 8 forEach and lambda *******");
		familyAndFriends.forEach(name -> {
			System.out.println(name);
		});

		System.out.println("\n********* Iterate over a LinkedList using iterator() ************");
		Iterator<String> humanSpeciesIterator = familyAndFriends.iterator();
		while (humanSpeciesIterator.hasNext()) {
			String speciesName = humanSpeciesIterator.next();
			System.out.println(speciesName);
		}

		// Clear the LinkedList by removing all elements
		familyAndFriends.clear();
		System.out.println("Cleared the LinkedList => " + familyAndFriends);

	}
}