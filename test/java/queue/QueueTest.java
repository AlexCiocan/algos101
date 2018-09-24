package queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueueTest {

	private Queue<Integer> queue;

	public QueueTest() {
		queue = new Queue<>();
		queue.add(1);
		queue.add(2);
	}

	@Test
	public void addTest() {
		int n = queue.getSize();
		queue.add(3);
		assertEquals(n + 1, queue.getSize());
	}

	@Test
	public void peekTest() {
		int n = queue.getSize();
		assertEquals(new Integer(1), queue.peek());
		assertEquals(n, queue.getSize());
	}

	@Test
	public void removeTest() {
		int n = queue.getSize();
		assertEquals(new Integer(1), queue.remove());
		assertEquals(n - 1, queue.getSize());
		assertEquals(new Integer(2), queue.remove());
		assertEquals(n - 2, queue.getSize());
		assertEquals(null, queue.remove());
		assertEquals(0, queue.getSize());
	}

}
