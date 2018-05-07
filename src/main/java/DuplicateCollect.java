package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateCollect {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		
		System.out.println("Count a with frequency: " + Collections.frequency(list, "a"));
		
		
		System.out.println("Count all the frequency: ");
		Set<String> unique = new HashSet<String>(list);
		for(String element: unique)
		{
			System.out.println(element + " " + Collections.frequency(list, element));
		}	

		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String element: list)
		{
			Integer count = map.get(element);
			if(count == null)
			{
				map.put(element, 1);
			}else{
				map.remove(element);
				map.put(element, count+1);
			}
			}printMap(map);
		
		
	}

	private static void printMap(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
				+ entry.getValue());
		}
		
	}

}
