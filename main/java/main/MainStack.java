package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import stack.Stack;

public class MainStack {

	private static Logger logger = LoggerFactory.getLogger(MainStack.class);
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(5);
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		
		logger.info("Stacks content:");
		int n = stack.getCurrentDepth();
		for (int i = 0; i < n; i++) {
			logger.info(stack.pop().toString());
		}
	}

}
