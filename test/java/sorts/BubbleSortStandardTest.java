package sorts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class BubbleSortStandardTest {

	private double[] list;
	private ArrayList<Double> collection;
	private BubbleSortStandard bubbleSortStandard;
	private InitLists sortedLists;
	
	public BubbleSortStandardTest() {
		InitLists baseLists = new InitLists("values.txt");
		sortedLists = new InitLists("values_sorted.txt");
		list = baseLists.getArray();
		collection = baseLists.getCollection();
		bubbleSortStandard = new BubbleSortStandard();
	}
	
	@Test
	public void sortArrayTest() {
		bubbleSortStandard.sortArray(list);
		assertTrue(Arrays.equals(list, sortedLists.getArray()));
	}
	
	@Test
	public void sortCollectionTest() {
		bubbleSortStandard.sortCollection(collection);
		assertEquals(sortedLists.getCollection(), collection);
	}
}
