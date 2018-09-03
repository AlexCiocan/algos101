package main;

import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fileHandler.FileHandler;
import sorts.BubbleSortOptimized;
import sorts.BubbleSortStandard;
import sorts.QuickSortIterative;
import sorts.QuickSortRecursive;

public class MainSort {

	private static String FILE_NAME = "values.txt";
	private static double[] list;
	private static ArrayList<Double> collection;
	private static Logger logger = LoggerFactory.getLogger(MainSort.class);

	public static void main(String[] args) {
		logger.info("0.0 - In file order");
		initArrayAndCollection();
		printArrayAndCollection(list, collection);

		task1BubbleSortStandard(list, collection);
		task1BubbleSortOptimized(list, collection);
		
		task2QuickSortIterative(list, collection);
		task2QuickSortRecursive(list, collection);
	}
	
	private static void task2QuickSortIterative(double[] list, ArrayList<Double> collection) {
		initArrayAndCollection();
		QuickSortIterative quickSortIterative = new QuickSortIterative();
		quickSortIterative.sortArray(list);
		quickSortIterative.sortCollection(collection);
		
		logger.info("2.1 - After sort with quick sort (iterative)");
		printArrayAndCollection(list, collection);
	}
	
	private static void task2QuickSortRecursive(double[] list, ArrayList<Double> collection) {
		initArrayAndCollection();
		QuickSortRecursive quickSortRecursive = new QuickSortRecursive();
		quickSortRecursive.sortArray(list);
		quickSortRecursive.sortCollection(collection);
		
		logger.info("2.2 - After sort with quick sort (recursive)");
		printArrayAndCollection(list, collection);
	}
	
	private static void task1BubbleSortOptimized(double[] list, ArrayList<Double> collection) {
		initArrayAndCollection();
		BubbleSortOptimized bubbleSortOptimized = new BubbleSortOptimized();
		bubbleSortOptimized.sortArray(list);
		bubbleSortOptimized.sortCollection(collection);
		
		logger.info("1.2 - After sort with bubble sort (optimized)");
		printArrayAndCollection(list, collection);
	}

	private static void task1BubbleSortStandard(double[] list, ArrayList<Double> collection) {
		initArrayAndCollection();
		BubbleSortStandard bubbleSortStandard = new BubbleSortStandard();
		bubbleSortStandard.sortArray(list);
		bubbleSortStandard.sortCollection(collection);
		
		logger.info("1.1 - After sort with bubble sort (standard)");
		printArrayAndCollection(list, collection);
	}
	
	private static void printArrayAndCollection(double[] list, ArrayList<Double> collection) {
		printCollection(collection);
		printArray(list);
	}

	private static void printCollection(ArrayList<Double> collection) {
		logger.info("Collection = " + Arrays.toString(collection.toArray()));
	}

	private static void printArray(double[] list) {
		logger.info("Array      = " + Arrays.toString(list));
	}

	private static void initArrayFromCollection(ArrayList<Double> collection) {
		list = new double[collection.size()];
		for (int i = 0; i < collection.size(); i++) {
			list[i] = collection.get(i);
		}
	}

	private static void initArrayAndCollection() {
		collection = readFromFile(FILE_NAME);
		initArrayFromCollection(collection);
	}

	private static ArrayList<Double> readFromFile(String fileName) {
		FileHandler fileHandler = new FileHandler(fileName);
		return fileHandler.getValues();
	}

}
