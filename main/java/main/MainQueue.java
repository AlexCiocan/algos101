package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import queue.Queue;


public class MainQueue {

	private static Logger logger = LoggerFactory.getLogger(MainQueue.class);
	
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		logger.info("Queue content:");
		int n = queue.getSize();
		for (int i = 0; i < n; i++) {
			logger.info(queue.remove().toString());
		}
	}

}
