package linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

	private LinkedList<Integer> linkedList;
	
	public LinkedListTest() {
		linkedList = new LinkedList<>(3);
		linkedList.add(1);
		linkedList.add(2);
	}
	
	@Test
	public void addTest() {
		int n = linkedList.getSize();
		linkedList.add(3);
		assertEquals(n + 1, linkedList.getSize());
	}
	
	@Test
	public void addToFullTest() {
		stack.add(3);
		stack.add(4);
		assertEquals(stack.getCurrentDepth(), stack.getMaxDepth());
	}
	
	@Test
	public void topTest() {
		int n = stack.getCurrentDepth();
		assertEquals(new Integer(2), stack.top());
		assertEquals(n, stack.getCurrentDepth());
	}
	
	@Test
	public void popTest() {
		int n = stack.getCurrentDepth();
		assertEquals(new Integer(2), stack.pop());
		assertEquals(n - 1, stack.getCurrentDepth());
		assertEquals(new Integer(1), stack.pop());
		assertEquals(n - 2, stack.getCurrentDepth());
		assertEquals(null, stack.pop());
		assertEquals(0, stack.getCurrentDepth());
	}
	
	
}
