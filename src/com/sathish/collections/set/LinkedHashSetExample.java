package com.sathish.collections.set;

import java.util.LinkedHashSet;

/**
 * 
 * @author Sathish
 *
 */
public class LinkedHashSetExample {

	public static void main(String args[]) {
		// LinkedHashSet of String Type
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();

		// Adding elements to the LinkedHashSet
		lhset.add("Y");
		lhset.add("QA");
		lhset.add("AB");
		lhset.add("N");
		lhset.add("K");
		System.out.println("LinkedHashSet of String : " + lhset);

		// This will not add new element as N already exists
		lhset.add("N");
		lhset.add("E");

		System.out.println("Size of LinkedHashSet = " + lhset.size());
		System.out.println("Original LinkedHashSet:" + lhset);
		System.out.println("Removing K from LinkedHashSet: " + lhset.remove("K"));
		System.out.println("Trying to Remove C which is not " + "present: " + lhset.remove("C"));
		System.out.println("Checking if N is present=" + lhset.contains("N"));
		System.out.println("Updated LinkedHashSet: " + lhset);

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
