package main;


import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fibonacci.FibonacciIterative;
import fileHandler.FileHandler;

public class MainFibonacci {

	private static Logger logger = LoggerFactory.getLogger(MainFibonacci.class);

	public static void main(String[] args) {
		task4FibonacciIterative();
	}
	
	private static void task4FibonacciIterative() {
		int n = readFromFile("fibonacci_limit.txt");
		FibonacciIterative fibonacciIterative = new FibonacciIterative();
		
		logger.info("First " + n + " fibonacci sequence elements:");
		logger.info(Arrays.toString(fibonacciIterative.generateFibonacciSeq(n).toArray()));
	}
	
	private static int readFromFile(String fileName) {
		FileHandler fileHandler = new FileHandler(fileName);
		return fileHandler.getValues().get(0).intValue();
	}
}
