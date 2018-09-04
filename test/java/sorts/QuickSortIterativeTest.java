package sorts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class QuickSortIterativeTest {

	private double[] list;
	private ArrayList<Double> collection;
	private QuickSortIterative quickSortIterative;
	private InitLists sortedLists;
	
	public QuickSortIterativeTest() {
		InitLists baseLists = new InitLists("values.txt");
		sortedLists = new InitLists("values_sorted.txt");
		list = baseLists.getArray();
		collection = baseLists.getCollection();
		quickSortIterative = new QuickSortIterative();
	}
	
	@Test
	public void sortArrayTest() {
		quickSortIterative.sortArray(list);
		assertTrue(Arrays.equals(list, sortedLists.getArray()));
	}
	
	@Test
	public void sortCollectionTest() {
		quickSortIterative.sortCollection(collection);
		assertEquals(sortedLists.getCollection(), collection);
	}
}
