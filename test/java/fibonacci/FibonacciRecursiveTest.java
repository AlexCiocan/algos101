package fibonacci;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class FibonacciRecursiveTest {

	private ArrayList<Long> list;
	private FibonacciRecursive fibonacciRecursive;

	public FibonacciRecursiveTest() {
		list = new ArrayList<>();
		fibonacciRecursive = new FibonacciRecursive();
	}
	
	@Test
	public void testZero() {
		list = fibonacciRecursive.generateFibonacciSeq(0);
		assertEquals(0, list.size());
	}
	
	@Test
	public void test9ThElement() {
		list = fibonacciRecursive.generateFibonacciSeq(9);
		assertEquals(9, list.size());
	}
}