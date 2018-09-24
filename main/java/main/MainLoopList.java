package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import linkedlist.LinkedList;
import list.ListFindLoop;

public class MainLoopList {

	private static Logger logger = LoggerFactory.getLogger(MainShuffle.class);
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list = list.testList();
		logger.info("List is built as: 1 -> 2 -> 3 -> 4 -> 1 -> ...");
		
		ListFindLoop listFindLoop = new ListFindLoop();
		logger.info("The list contains a loop? - " + listFindLoop.findLoop(list));
	}
}
