package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import linkedlist.LinkedList;
import list.ReverseList;

public class MainReverseList {

	private static Logger logger = LoggerFactory.getLogger(MainReverseList.class);
	private static LinkedList<Integer> list;
	
	public static void main(String[] args) {
		list = new LinkedList<>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		logger.info("List: ");
		printList();
		
		ReverseList reverseList = new ReverseList();
		list = reverseList.reverseList(list);

		logger.info("Reversed list: ");
		printList();
		
	}
	
	private static void printList() {
		for (int i = 1; i <= list.getSize(); i++) {
			logger.info(i + ". th element: " + list.getNode(i).getData());
		}
	}
}
