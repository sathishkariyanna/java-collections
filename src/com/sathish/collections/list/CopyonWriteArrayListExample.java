package com.sathish.collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 
 * @author Sathish
 *
 */
/*
 * The design of the CopyOnWriteArrayList uses an interesting technique to make
 * it thread-safe without a need for synchronization. When we are using any of
 * the modify methods – such as add() or remove(), when we add/remove it creates
 * new memory location each time
 */
public class CopyonWriteArrayListExample {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");

		// get the iterator
		Iterator<String> it = list.iterator();

		// manipulate list while iterating
		while (it.hasNext()) {
			System.out.println("list is:" + list);
			String str = it.next();
			System.out.println(str);
			if (str.equals("two"))
				list.remove("five");
			else if (str.equals("three"))
				list.add("three found");
			else if (str.equals("four"))
				list.set(1, "four");
		}
	}

}
