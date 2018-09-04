package main;


import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fibonacci.FibonacciIterative;
import fibonacci.FibonacciRecursive;
import fileHandler.FileHandler;

public class MainFibonacci {
	
	/***
	 * We stored our Fibonacci values in an array list, which contain Long elements. This will overflow at a given point.
	 * 
	 * The solution would be to use the BigInteger class given from Java, which allocates memory dynamically to hold all the data it is asked to hold.
	 * 
	 * ***/

	private static Logger logger = LoggerFactory.getLogger(MainFibonacci.class);

	public static void main(String[] args) {
		task4FibonacciIterative();
		taks4FibonacciRecursive();
	}
	
	private static void taks4FibonacciRecursive() {
		int n = readFromFile("fibonacci_limit.txt");
		FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
		
		logger.info("First " + n + " fibonacci sequence elements:");
		logger.info("Recursive approach: " + Arrays.toString(fibonacciRecursive.generateFibonacciSeq(n).toArray()));
	}
	
	private static void task4FibonacciIterative() {
		int n = readFromFile("fibonacci_limit.txt");
		FibonacciIterative fibonacciIterative = new FibonacciIterative();
		
		logger.info("First " + n + " fibonacci sequence elements:");
		logger.info("Iterative approach: " + Arrays.toString(fibonacciIterative.generateFibonacciSeq(n).toArray()));
	}
	
	private static int readFromFile(String fileName) {
		FileHandler fileHandler = new FileHandler(fileName);
		return fileHandler.getValues().get(0).intValue();
	}
}
