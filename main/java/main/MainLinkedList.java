package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import list.LinkedList;


/**
 * Differences between List - Set - Map
 * List provides indexed collection of elements, which may contain duplicates.
 * Set provides an unordered collection with unique objects.
 * Map provides a data structure based on a key-value pair and a hash function. Every key in the Map is unique while the values aren't.
 * */

public class MainLinkedList {
	
	private static LinkedList<Integer> list;
	private static Logger logger = LoggerFactory.getLogger(MainShuffle.class);
	
	public static void main(String[] args) {
		list = new LinkedList<>();
		addToList();
		logger.info("List: (before delete)");
		printList();
		deleteFromList();
		logger.info("List: (after delete)");
		printList();
		
	}
	
	private static void addToList() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
	}
	
	private static void deleteFromList() {
		list.remove();
	}
	
	private static void printList() {
		for (int i = 0; i < list.getSize(); i++) {
			logger.info(i + ". th element: " + list.getNode(i).getData());
		}
	}
}
