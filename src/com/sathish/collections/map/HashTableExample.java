package com.sathish.collections.map;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * 
 * @author Sathish
 *
 */
public class HashTableExample {
	// HashTable is synchronized
	public static void main(String[] args) {
		// Creating a Hashtable
		Hashtable<String, String> hashtable = new Hashtable<String, String>();

		// Adding Key and Value pairs to Hashtable
		hashtable.put("Key1", "Tom");
		hashtable.put("Key2", "Mike");
		hashtable.put("Key3", "King");
		hashtable.put("Key4", "Joe");
		hashtable.put("Key5", "Suhash");

		System.out.println("Iterating or looping map using KeySet Iterator");
		Iterator<String> keySetIterator = hashtable.keySet().iterator();
		while (keySetIterator.hasNext()) {
			String key = keySetIterator.next();
			System.out.println("key: " + key + " value: " + hashtable.get(key));
		}
		// hashtable.put(null, "Peter"); //HashTable does not allow null key
		// hashtable.put("Key6", null); //HashTable does not allow null value
	}

}
