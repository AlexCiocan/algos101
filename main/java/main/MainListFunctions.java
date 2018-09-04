package main;

import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fileHandler.FileHandler;
import list.ListFindOptimized;
import list.ListFindStandard;

public class MainListFunctions {

	private static int[] array;
	private static String FILE_NAME = "values.txt";
	private static ArrayList<Integer> list;
	private static Logger logger = LoggerFactory.getLogger(MainListFunctions.class);

	public static void main(String[] args) {
		ListFindStandard listFindStandard = new ListFindStandard();
		ListFindOptimized listFindOptimized = new ListFindOptimized();
		
		initArrayAndCollection(readFromFile(FILE_NAME));
		printArray(array);
		logger.info("Duplicates (brut-force) = " + Arrays.toString(listFindStandard.findDuplicatesInArray(array).toArray()));
		logger.info("Duplicates (optimized)  = " + Arrays.toString(listFindOptimized.findDuplicatesInArray(array).toArray()));
		
		printCollection(list);
		logger.info("Duplicates (brut-force) = " + Arrays.toString(listFindStandard.findDuplicatesInCollection(list).toArray()));
		logger.info("Duplicates (optimized)  = " + Arrays.toString(listFindOptimized.findDuplicatesInCollection(list).toArray()));
		
		
	}
	
	private static void initArrayAndCollection(ArrayList<Double> collection) {
		array = new int[collection.size()];
		list = new ArrayList<>();
		for (int i = 0; i < collection.size(); i++) {
			array[i] = collection.get(i).intValue();
			list.add(array[i]);
		}
	}
	
	private static ArrayList<Double> readFromFile(String fileName) {
		FileHandler fileHandler = new FileHandler(fileName);
		return fileHandler.getValues();
	}
	
	private static void printArray(int[] list) {
		logger.info("Array  = " + Arrays.toString(list));
	}
	
	private static void printCollection(ArrayList<Integer> collection) {
		logger.info("Collection = " + Arrays.toString(collection.toArray()));
	}
}
