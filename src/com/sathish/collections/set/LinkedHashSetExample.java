package com.sathish.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author Sathish
 *
 */
public class LinkedHashSetExample {

	public static void main(String args[]) {
		// LinkedHashSet of String Type
		Set<String> lhset = new LinkedHashSet<String>();

		// Adding elements to the LinkedHashSet
		lhset.add("Y");
		lhset.add("QA");
		lhset.add("AB");
		lhset.add("N");
		lhset.add("K");
		System.out.println("LinkedHashSet of String : " + lhset);

		// This will not add new element as N already exists
		if(lhset.add("N"))
			System.out.println("duplicate element overwritten");
		else {
			System.out.println("duplicate element did not add");
			//in Set it will not over write		
		}
		lhset.add("E");

		System.out.println("Size of LinkedHashSet = " + lhset.size());
		System.out.println("Original LinkedHashSet:" + lhset);
		System.out.println("Removing K from LinkedHashSet: " + lhset.remove("K"));
		System.out.println("Trying to Remove C which is not " + "present: " + lhset.remove("C")); //this will not give any exception
		System.out.println("Checking if N is present=" + lhset.contains("N"));
		System.out.println("Updated LinkedHashSet: " + lhset);

		//iterate linkedHashSet using Iterator
		Iterator<String> setIterator = lhset.iterator();
		while(setIterator.hasNext()){
			System.out.println(setIterator.next());
		}
		//Convert LinkedHashSet of String objects to TreeSet collection 
		Set<String> linkedhashSetToTreeSet = new TreeSet<>(lhset);
		System.out.println("Converted TreeSet : "+linkedhashSetToTreeSet);	
		
		// LinkedHashSet of Integer Type
		LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

		// Adding elements
		lhset2.add(88);
		lhset2.add(6);
		lhset2.add(2);
		lhset2.add(73);
		System.out.println("LinkedHashSet of Integer : " + lhset2);
	}

}
