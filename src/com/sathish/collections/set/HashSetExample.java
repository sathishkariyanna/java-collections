package com.sathish.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author Sathish
 *
 */
public class HashSetExample {

	public static void main(String[] args) {
		// Set demonstration using HashSet
		Set<String> hash_SetA = new HashSet<String>();
		hash_SetA.add("Sathish");
		hash_SetA.add("Tom");
		hash_SetA.add("King");
		hash_SetA.add("Mike");
		hash_SetA.add("Tom");
		System.out.print("Set output without the duplicates");
		System.out.println(hash_SetA);

		// Set demonstration using TreeSet (Converting HashSet to TreeSet)
		System.out.print("Sorted Set after passing into TreeSet");
		Set<String> tree_Set = new TreeSet<String>(hash_SetA);
		System.out.println(tree_Set);

		Set<String> hash_SetB = new HashSet<String>();
		hash_SetB.add("Jon");
		hash_SetB.add("King");
		hash_SetB.add("Alex");
		hash_SetB.add("Tom");

		// To find union
		Set<String> union = new HashSet<String>(hash_SetA);
		union.addAll(hash_SetB);
		System.out.print("Union of the two Set");
		System.out.println(union);

		// To find intersection
		Set<String> intersection = new HashSet<String>(hash_SetA);
		intersection.retainAll(hash_SetB);
		System.out.print("Intersection of the two Set");
		System.out.println(intersection);

		// To find the symmetric difference
		Set<String> difference = new HashSet<String>(hash_SetA);
		difference.removeAll(hash_SetB); // something like A-B
		System.out.print("Difference of the two Set");
		System.out.println(difference);

		// Using isEmpty() to verify for the emptiness
		System.out.println("The set is empty? " + hash_SetA.isEmpty());

		// Does the set contain "Sathish"
		System.out.println("Does the set contain 'Sathish'?" + hash_SetA.contains("Sathish"));

		// Getting the size of the set
		System.out.println("The size of the set is " + hash_SetA.size());

		// Removing "Tom" from the set
		hash_SetA.remove("Tom");

		// Displaying the HashSet
		System.out.println("HashSet: " + hash_SetA);

		// to iterate set we can use Iterator interface or any other method.
		Iterator iterator = hash_SetA.iterator();
		// displaying the set data using Iterator
		System.out.println("Iterating Set data: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		// Clearing the HashSet using clear() method
		hash_SetA.clear();
		// Displaying the final Set after clearing;
		System.out.println("The final set after clear: " + hash_SetA);

	}
}
