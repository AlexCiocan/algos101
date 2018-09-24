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
	public void getHeadTest() {
		assertEquals(new Integer(2), linkedList.getHead().getData());
	}
	
	@Test
	public void getFirstNodeTest() {
		assertEquals(new Integer(2), linkedList.getNode(1).getData());
	}
	
	@Test
	public void getLastNodeTest() {
		assertEquals(3, linkedList.getSize());
		assertEquals(new Integer(3), linkedList.getNode(linkedList.getSize()).getData());
	}
	
	@Test
	public void getNonExistingNodeTest() {
		assertEquals(null, linkedList.getNode(linkedList.getSize() + 1));
	}
	
	@Test
	public void removeTest() {
		assertEquals(new Integer(2), linkedList.getHead().getData());
		linkedList.remove();
		assertEquals(new Integer(1), linkedList.getHead().getData());
	}
	
	@Test
	public void addToIndexTest() {
		linkedList.addToIndex(3, 5);
		assertEquals(new Integer(5), linkedList.getNode(4).getData());
		linkedList.printList();
	}
	
}
