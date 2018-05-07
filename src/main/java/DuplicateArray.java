package main.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*are 3 methods:
1 - loop over an array and compare each element to every other element
2 - loop over an array and insert them into HashSet class
3 - loop over an array and insert each element and its count into hash table
*/
public class DuplicateArray {

	public static void main(String[] args) {
		
		String[] array = { "abc", "vmb", "ana", "vmb", "gda","apa" };
		
		for (int i = 0; i< array.length; i++) {
			String toCompare = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (toCompare.equals(array[j])) {
					System.out.println("Duplicate Name " + toCompare);
					
		//using HashSet		
		Set<String> arr = new HashSet<>(); 
		
		for(String letter: array)
		{
			if(arr.add(letter) == false)
			{
				System.out.print("Duplicate letters" + " " + letter);
			}
		}
        }
    }
		//using HashMap
			Map<String, Integer> elementAndCount = new HashMap<String, Integer>();
			
			for(String letter: array)
			{
				Integer count = elementAndCount.get(letter);
			if(count == null)
			{
				elementAndCount.put(letter, 1);				
			}else
			{
				elementAndCount.put(letter, ++count);
			}
			}
			Set<Entry<String, Integer>> entrySet = elementAndCount.entrySet();
			for(Entry<String, Integer> entry : entrySet){
				if(entry.getValue() > 1){	
					System.out.println("Duplicate letter" + " " + entry.getKey());
				}
			}
		}
	}


}