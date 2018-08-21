package com.sathish.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * @author Sathish
 *
 */
// concurrentHashMap is used to modify the HashMap while iterating the HashMap
public class ConcurrentHashMapExample {

	public static void main(String[] args) {

		// ConcurrentHashMap
		Map<String, String> myMap = new ConcurrentHashMap<String, String>();
		myMap.put("1", "One");
		myMap.put("2", "Two");
		myMap.put("3", "Three");
		myMap.put("4", "Four");
		myMap.put("5", "Five");
		myMap.put("6", "Six");
		System.out.println("ConcurrentHashMap before iterator: " + myMap);
		Iterator<String> it = myMap.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			if (key.equals("3"))
				myMap.put(key + "new", "newThree");
		}
		System.out.println("ConcurrentHashMap after iterator: " + myMap);

		// HashMap
		myMap = new HashMap<String, String>();
		myMap.put("1", "One");
		myMap.put("2", "Two");
		myMap.put("3", "Three");
		myMap.put("4", "Four");
		myMap.put("5", "Five");
		myMap.put("6", "Six");
		System.out.println("HashMap before iterator: " + myMap);
		Iterator<String> it1 = myMap.keySet().iterator();

		while (it1.hasNext()) {
			String key = it1.next();
			if (key.equals("3"))
				myMap.put(key + "new", "newThree");// Exception in thread "main"
													// java.util.ConcurrentModificationException
		}
		System.out.println("HashMap after iterator: " + myMap);
	}

}
