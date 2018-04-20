package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class bubbleCollectionsSort {

	public static void main(String[] args) {
		
		ArrayList<String> ciocolata = new ArrayList<String>();
		
		ciocolata.add("c");
		ciocolata.add("l");
		ciocolata.add("c");
		ciocolata.add("i");
		ciocolata.add("o");
		ciocolata.add("o");
		ciocolata.add("a");
		ciocolata.add("t");
		ciocolata.add("a");
		
		Collections.sort(ciocolata);// - ascendent
		
		System.out.println("Sorted in ascending order: \n" + ciocolata);
		
		Collections.reverse(ciocolata);
		
		System.out.println("Sorted in descending order: \n" + ciocolata);
		

	}

}
