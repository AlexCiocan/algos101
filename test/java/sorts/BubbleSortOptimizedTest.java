package sorts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class BubbleSortOptimizedTest {

	private double[] list;
	private ArrayList<Double> collection;
	private BubbleSortOptimized bubbleSortOptimized;
	private InitLists sortedLists;
	
	public BubbleSortOptimizedTest() {
		InitLists baseLists = new InitLists("values.txt");
		sortedLists = new InitLists("values_sorted.txt");
		list = baseLists.getArray();
		collection = baseLists.getCollection();
		bubbleSortOptimized = new BubbleSortOptimized();
	}
	
	@Test
	public void sortArrayTest() {
		bubbleSortOptimized.sortArray(list);
		assertTrue(Arrays.equals(list, sortedLists.getArray()));
	}
	
	@Test
	public void sortCollectionTest() {
		bubbleSortOptimized.sortCollection(collection);
		assertEquals(sortedLists.getCollection(), collection);
	}
}
