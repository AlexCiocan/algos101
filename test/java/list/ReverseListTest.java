package list;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import linkedlist.LinkedList;

public class ReverseListTest {

	private ReverseList reverseList;
	private LinkedList<Integer> list;
	
	public ReverseListTest() {
		reverseList = new ReverseList();
		list = new LinkedList<>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
	}
	

	@Test
	public void reverseListSizeTest() {
		int n = list.getSize();
		reverseList.reverseList(list);
		assertEquals(n, list.getSize());
	}
	
	@Test
	public void reverseListElementTest() {
		Integer first = list.getHead().getData();
		list = reverseList.reverseList(list);
		assertEquals(first, list.getNode(list.getSize()).getData());
	}
	
}
