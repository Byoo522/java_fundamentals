package com.fdmgroup.TDD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionDemo {
	public static void main(String[] args) {
		// Allows Duplicates - array list
		List<String> names = new ArrayList<>(); // capacity 10, increased by 50%
		names.add("bob");
		names.add("john");
		names.add("sam");
		
		for(String name: names) {
			System.out.println("Array List " + name);
		}
		// Vector thread safe, capacity 10, increases by 100%
		// ArrayList add at index 3, 10 elements - better for searching b/c you can insert between. deletion and add is bad
		// LinkedList <-- prev, val, next--> <--prev, newElement, next--> <--prev, val2, next--> | slower search. Addition and deletion is better.
		
		// NO DUPLICATES - set
		Set<Integer> numbers = new HashSet<>();
		numbers.add(4);
		numbers.add(4);
		numbers.add(4);
		numbers.add(40);
		numbers.add(56);
		numbers.add(38);
		numbers.add(87);
		for(Integer integer : numbers) {
			System.out.println("Values in set cannot be duplicated " + integer);
		}
		
		// Hash Map 
		Map<String, Integer> map = new HashMap<>();
		map.put("ben", 32);
		map.put("john", 67);
		map.put("sam", 45);
		map.put("christine", 31);
		for(String name : map.keySet()) {
			System.out.println("Key " + name + " Value " + map.get(name));
		}
		
		// Queue
		Queue<String> firstName = new LinkedList<>();
		firstName.add("christine");
		firstName.add("chryshell");
		firstName.add("heather");
		firstName.add("michelle");
		System.out.println("Before poll size of q " + firstName.size());
		while(!firstName.isEmpty()) {
			System.out.println("Names from queue " + firstName.poll());
		}
		System.out.println("After poll size of q " + firstName.size());
	}
}
