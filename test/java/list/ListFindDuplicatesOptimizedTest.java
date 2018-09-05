package list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import fileHandler.FileHandler;

public class ListFindDuplicatesOptimizedTest {

	private ListFindDuplicateOptimized listFindDuplicateOptimized;
	private static int[] array;
	private static String FILE_NAME = "duplicatest_test.txt";
	private static ArrayList<Integer> list;
	
	public ListFindDuplicatesOptimizedTest() {
		listFindDuplicateOptimized = new ListFindDuplicateOptimized();
		initArrayAndCollection(readFromFile(FILE_NAME));
	}
	
	private void initArrayAndCollection(ArrayList<Double> collection) {
		array = new int[collection.size()];
		list = new ArrayList<>();
		for (int i = 0; i < collection.size(); i++) {
			array[i] = collection.get(i).intValue();
			list.add(array[i]);
		}
	}
	
	private ArrayList<Double> readFromFile(String fileName) {
		FileHandler fileHandler = new FileHandler(fileName);
		return fileHandler.getValues();
	}
	
	@Test
	public void findInArrayTest() {
		assertEquals(2, listFindDuplicateOptimized.findDuplicatesInArray(array).size());
		assertTrue(listFindDuplicateOptimized.findDuplicatesInArray(array).contains(1));
		assertTrue(listFindDuplicateOptimized.findDuplicatesInArray(array).contains(4));
	}

	@Test
	public void findInCollectionTest() {
		assertEquals(2, listFindDuplicateOptimized.findDuplicatesInCollection(list).size());
		assertTrue(listFindDuplicateOptimized.findDuplicatesInCollection(list).contains(1));
		assertTrue(listFindDuplicateOptimized.findDuplicatesInCollection(list).contains(4));
	}
	
}
