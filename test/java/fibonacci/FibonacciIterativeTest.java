package fibonacci;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;
import java.util.ArrayList;

import org.junit.Test;

public class FibonacciIterativeTest {

	private ArrayList<Long> list;
	private FibonacciIterative fibonacciIterative;

	public FibonacciIterativeTest() {
		list = new ArrayList<>();
		fibonacciIterative = new FibonacciIterative();
	}
	
	@Test
	public void testZero() {
		list = fibonacciIterative.generateFibonacciSeq(0);
		assertEquals(0, list.size());
	}
	
	@Test
	public void test9ThElement() {
		list = fibonacciIterative.generateFibonacciSeq(9);
		assertEquals(new Long(21), list.get(list.size() - 1));
	}
	
	@Test
	public void test9ThElementBig() {
		assertEquals(new BigInteger("21"), fibonacciIterative.bigFibonacci(9));
	}
}
