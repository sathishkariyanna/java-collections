package com.sathish.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @author Sathish
 *
 */
class Student {
	int rollno;
	String name, address;

	// Constructor
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

// we can save in a separate class
class Sortbyroll implements Comparator<Student> {
	// Used for sorting in ascending order of roll number
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}

// we can save in a separate class
class SortbyName implements Comparator<Student> {
	// Used for sorting in ascending order of name
	public int compare(Student a, Student b) {
		return a.name.compareTo(b.name);
	}
}

public class ComparatorExample {
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "bbbb", "USA"));
		ar.add(new Student(131, "aaaa", "India"));
		ar.add(new Student(121, "cccc", "Canada"));

		System.out.println("Unsorted");
		/*
		 * for (int i = 0; i < ar.size(); i++) System.out.println(ar.get(i));
		 */
		ar.forEach(System.out::println);

		Collections.sort(ar, new Sortbyroll());
		System.out.println("\nSorted by rollno");
		/*
		 * for (int i = 0; i < ar.size(); i++) System.out.println(ar.get(i));
		 */
		ar.forEach(System.out::println);

		Collections.sort(ar, new SortbyName());
		System.out.println("\nSorted by name");
		ar.forEach(System.out::println);
	}
}
