package com.sathish.collections.map;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 * 
 * @author Sathish
 *
 */
public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();

		// Adding Key and Value pairs to Hashtable
		linkedHashMap.put("Key1", "Tom");
		linkedHashMap.put("Key2", "Mike");
		linkedHashMap.put("Key3", "King");
		linkedHashMap.put("Key4", "Joe");
		linkedHashMap.put("Key5", "Suhash");
		// It prints the elements in the inserted     
        System.out.println(linkedHashMap); 
        
        System.out.println("delete element 'Key3': " + linkedHashMap.remove("Key3")); 
        System.out.println(linkedHashMap); 

	}

}
