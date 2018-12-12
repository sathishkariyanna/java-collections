package com.sathish.collections.list;

import java.util.Iterator;
import java.util.Vector;
/**
 * 
 * @author Sathish
 *
 */
public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vectColor=new Vector<String>();  
		vectColor.add("Blue");  
		vectColor.add("Green");  
		vectColor.add("Red");  
		vectColor.add("Yellow");  
		vectColor.add("White");  
		Iterator<String> itr= vectColor.iterator();  
		while(itr.hasNext()){  
		 	System.out.println(itr.next());  
		}  


	}

}
