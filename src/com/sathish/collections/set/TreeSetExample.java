package com.sathish.collections.set;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author Sathish
 *
 */
public class TreeSetExample {

	public static void main(String[] args) {
		// Set demonstration using TreeSet
		Set<String> tree_SetA = new TreeSet<String>();
		Set<String> tree_SetA_Reverse = new TreeSet<String>();
		tree_SetA.add("Sathish");
		tree_SetA.add("Tom");
		tree_SetA.add("King");
		tree_SetA.add("Mike");
		tree_SetA.add("Tom");
		System.out.print("Set output without the duplicates");
		System.out.println(tree_SetA);

		// creating reverse set
		tree_SetA_Reverse = ((TreeSet<String>) tree_SetA).descendingSet();
		System.out.println("Set output in reverse order :" + tree_SetA_Reverse);

		Set<String> tree_SetB = new TreeSet<String>();
		tree_SetB.add("Jon");
		tree_SetB.add("King");
		tree_SetB.add("Alex");
		tree_SetB.add("Tom");

		// To find union
		Set<String> union = new TreeSet<String>(tree_SetA);
		union.addAll(tree_SetB);
		System.out.print("Union of the two Set");
		System.out.println(union);

		// To find intersection
		Set<String> intersection = new TreeSet<String>(tree_SetA);
		intersection.retainAll(tree_SetB);
		System.out.print("Intersection of the two Set");
		System.out.println(intersection);

		// To find the symmetric difference
		Set<String> difference = new TreeSet<String>(tree_SetA);
		difference.removeAll(tree_SetB); // something like A-B
		System.out.print("Difference of the two Set");
		System.out.println(difference);

		// Using isEmpty() to verify for the emptiness
		System.out.println("The set is empty? " + tree_SetA.isEmpty());

		// Does the set contain "Sathish"
		System.out.println("Does the set contain 'Sathish'?" + tree_SetA.contains("Sathish"));

		// Getting the size of the set
		System.out.println("The size of the set is " + tree_SetA.size());

		// Removing "Tom" from the set
		tree_SetA.remove("Tom");

		// Displaying the TreeSet
		System.out.println("TreeSet: " + tree_SetA);

		// to iterate set we can use Iterator interface or any other method.
		Iterator iterator = tree_SetA.iterator();
		// displaying the set data using Iterator
		System.out.println("Iterating Set data: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		// Clearing the TreeSet using clear() method
		tree_SetA.clear();
		// Displaying the final Set after clearing;
		System.out.println("The final set after clear: " + tree_SetA);

	}
}
