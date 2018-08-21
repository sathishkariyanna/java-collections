package com.sathish.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Sathish
 *
 */
public class ArrayListExample {

	public static void main(String[] args) {
		simpleArryList();
		sortList();

	}

	public static void simpleArryList() {
		// use type inference for ArrayList
		List<Integer> list = new ArrayList<>();
		// we can have Integer, String, POJO class ...
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(8);

		// Method1
		for (Integer integer : list) {
			System.out.println("Method1 \t:" + integer);
		}
		list.set(3, 5);// we can update the value
		list.remove(2);
		list.add(1, 6);
		// Method2
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Method2 \t:" + list.get(i));
		}
	}

	public static void sortList() {
		System.out.println("Sorting with natural order");
		List<String> l1 = createList();
		// l1.sort(null);
		Collections.sort(l1);
		// for reverse order
		// Collections.sort(l1, Collections.reverseOrder());
		l1.forEach(System.out::println);

		System.out.println("Sorting with a lamba expression for the comparison");
		List<String> l2 = createList();
		l2.sort((s1, s2) -> s1.compareToIgnoreCase(s2)); // sort ignoring case
		l2.forEach(System.out::println);

		System.out.println("Sorting with a method references");
		List<String> l3 = createList();
		l3.sort(String::compareToIgnoreCase);
		l3.forEach(System.out::println);

	}

	private static List<String> createList() {
		return Arrays.asList("Physics", "Chemistry", "Biology", "Computers");
	}

}
