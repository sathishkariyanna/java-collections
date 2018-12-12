package com.sathish.collections.map;

import java.util.Comparator;
import java.util.TreeMap;
/**
 * 
 * @author Sathish
 *
 */
public class TreeMapSortDesc {

	static class DescOrder implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			return o2.compareTo(o1); // desc order
			// return o1.compareTo(o2); //asc order, by default Tree map is sorted in
			// assending order, we do not need to sort
		}
	}

	public static void main(String[] args) {
		System.out.println("TreeMap Desc Order Example");

		TreeMap<String, String> map1 = new TreeMap<String, String>(new DescOrder());
		map1.put("A1", "A1 value");
		map1.put("A4", "A4 value");
		map1.put("A2", "A2 Value");
		map1.put("A10", "A10 Value ");
		map1.put("A30", "A30 value");
		// map1.put(null, "A30 value"); //Tree map can not hold null key
		map1.put("A31", null); // Tree map can have null value
		map1.put("A41", null);
		map1.put("A41", "33");

		System.out.println(map1);
	}
}
