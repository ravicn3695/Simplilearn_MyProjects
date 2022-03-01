package assistedPracticeProject;

import java.util.*;

/*import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;*/

public class Collections {

	public static void main(String[] args) {
		// creating ArrayList
		System.out.println("ArrayList");
		ArrayList<String> place = new ArrayList<String>();
		place.add("Kolar");
		place.add("Bangalore");
		place.add("Mysore");
		
		System.out.println(place);
		
		// creating Vector
		System.out.println("\nVector");
		Vector<Integer> num = new Vector<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		
		System.out.println(num);
		
		//Creating LinkedList 
		System.out.println("\nLinkedList");
		LinkedList<Character> var = new LinkedList<Character>();
		var.add('A');
		var.add('B');
		var.add('C');
		
		System.out.println(var);
		
		//Creating HashSet
		System.out.println("\nHashSet");
		HashSet<Float> hash = new HashSet<Float>();
		hash.add((float) 1.1);
		hash.add((float) 1.2);
		hash.add((float) 1.3);
		
		System.out.println(hash);
		
		//creating LinkedHashSet
		System.out.println("\nLinkedHashSet");
		LinkedHashSet<Long> link = new LinkedHashSet<Long>();
		link.add((long)101);
		link.add((long)102);
		link.add((long)103);
		
		System.out.println(link);
		
	}

}

