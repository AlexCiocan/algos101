package sorts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class QuickSortRecursiveTest {

	private double[] list;
	private ArrayList<Double> collection;
	private QuickSortRecursive quickSortRecursive;
	private InitLists sortedLists;
	
	public QuickSortRecursiveTest() {
		InitLists baseLists = new InitLists("values.txt");
		sortedLists = new InitLists("values_sorted.txt");
		list = baseLists.getArray();
		collection = baseLists.getCollection();
		quickSortRecursive = new QuickSortRecursive();
	}
	
	@Test
	public void sortArrayTest() {
		quickSortRecursive.sortArray(list);
		assertTrue(Arrays.equals(list, sortedLists.getArray()));
	}
	
	@Test
	public void sortCollectionTest() {
		quickSortRecursive.sortCollection(collection);
		assertEquals(sortedLists.getCollection(), collection);
	}
}
