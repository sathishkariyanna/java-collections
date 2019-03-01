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
		if(tree_SetA.add("Mike"))
			System.out.println("unique element added");
		if(tree_SetA.add("Tom")) {
			System.out.println("duplicate element overwritten"); 
			//in Set it will not over write			
		}else {
			System.out.println("duplicate element did not add");
		}
		System.out.println("TreeSet output without the duplicates : " + tree_SetA);

		// creating reverse set
		tree_SetA_Reverse = ((TreeSet<String>) tree_SetA).descendingSet();
		System.out.println("Set output in reverse order :" + tree_SetA_Reverse);

		Set<String> tree_SetB = new TreeSet<String>();
		tree_SetB.add("Jon");
		tree_SetB.add("King");
		tree_SetB.add("Alex");
		tree_SetB.add("Tom");
		//tree_SetB.add(null); //TreeSet does not allow null object
		// To find union
		Set<String> union = new TreeSet<String>(tree_SetA);
		union.addAll(tree_SetB);
		System.out.println("Union of the two Set : " +union);

		// To find intersection
		Set<String> intersection = new TreeSet<String>(tree_SetA);
		intersection.retainAll(tree_SetB);
		System.out.println("Intersection of the two Set : " + intersection);

		// To find the symmetric difference
		Set<String> difference = new TreeSet<String>(tree_SetA);
		difference.removeAll(tree_SetB); // something like A-B
		System.out.println("Difference of the two Set : " + difference);

		// Using isEmpty() to verify for the emptiness
		System.out.println("The set is empty? " + tree_SetA.isEmpty());

		// Does the set contain "Sathish"
		System.out.println("Does the set contain 'Sathish'? " + tree_SetA.contains("Sathish"));

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
