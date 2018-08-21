package com.sathish.collections.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author Sathish
 *
 */
// comparable can be only used for sorting single object like rollno
// if we want to compare multiple objects like rollno, name, then we need go
// with comparator interface
public class ComparableExample implements Comparable<ComparableExample> {
	// for reference i am using ComparableExample as class name instead of Student
	int rollno;
	String name, address;

	// Constructor
	public ComparableExample(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	@Override
	public int compareTo(ComparableExample st) {
		if (this.rollno == st.rollno)
			return 0;
		else if (rollno > st.rollno)
			return 1;
		else
			return -1;
	}

	// Used to print student details in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}

	public static void main(String[] args) {
		ArrayList<ComparableExample> ar = new ArrayList<ComparableExample>();
		ar.add(new ComparableExample(111, "bbbb", "USA"));
		ar.add(new ComparableExample(131, "aaaa", "India"));
		ar.add(new ComparableExample(121, "cccc", "Canada"));
		Collections.sort(ar);
		/*
		 * for (ComparableExample st : ar) { System.out.println(st.rollno + " " +
		 * st.name + " " + st.address); }
		 */
		ar.forEach(System.out::println);
	}
}
