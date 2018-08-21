package com.sathish.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @author Sathish
 *
 */
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(3, "Three");
		map.put(2, "Two");

		String value = map.get(1);
		System.out.println("Key:1 " + " value: " + value);
		// there are 4 ways to looping HashMap in Java.
		// way 1
		System.out.println("Iterating or looping map using java5 foreach loop");
		for (Integer key : map.keySet()) {
			System.out.println("key: " + key + " value: " + map.get(key));
		}
		System.out.println("------------------------------------------------");

		// way 2
		System.out.println("Iterating or looping map using KeySet Iterator");
		Iterator<Integer> keySetIterator = map.keySet().iterator();
		while (keySetIterator.hasNext()) {
			Integer key = keySetIterator.next();
			System.out.println("key: " + key + " value: " + map.get(key));
		}
		System.out.println("------------------------------------------------");

		// way 3
		System.out.println("looping HashMap in Java using EntrySet and java5 for loop");
		for (Entry entry : map.entrySet()) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}
		System.out.println("------------------------------------------------");

		// way 4
		System.out.println("Iterating HashMap in Java using EntrySet and Java iterator");
		Set<Map.Entry<Integer, String>> entrySet1 = map.entrySet();
		Iterator<Entry<Integer, String>> entrySetIterator = entrySet1.iterator();
		while (entrySetIterator.hasNext()) {
			Entry entry = entrySetIterator.next();
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}
		System.out.println("------------------------------------------------");

		System.out.println("Does HashMap contains 1 as key: " + map.containsKey(1));
		System.out.println("Does HashMap contains four as value: " + map.containsValue("four"));
		System.out.println("Does HashMap contains One as value: " + map.containsValue("One"));

		System.out.println("Is HashMap is empty: " + map.isEmpty());

		// we need to use comparator to sorted class object type
		System.out.println("Unsorted HashMap: " + map);
		TreeMap sortedHashMap = new TreeMap(map);
		System.out.println("Sorted HashMap: " + sortedHashMap);

		// Synchronized HashMap
		Collections.synchronizedMap(map);

		Object removedValue = map.remove(1);
		System.out.println("Following value is removed from Map: " + removedValue);

		System.out.println("Size of Map: " + map.size());
		map.clear(); // clears hashmap , removes all element
		System.out.println("Size of Map: " + map.size());

		map.put(5, null);
		map.put(null, "ABC");
		map.put(null, null);
		System.out.println("Size of Map after adding null keys and null values: " + map.size());
	}

}
