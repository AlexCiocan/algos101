package stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackTest {

	private Stack<Integer> stack;
	
	public StackTest() {
		stack = new Stack<>(3);
		stack.add(1);
		stack.add(2);
	}
	
	@Test
	public void addTest() {
		int n = stack.getCurrentDepth();
		stack.add(3);
		assertEquals(n + 1, stack.getCurrentDepth());
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
