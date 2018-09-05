package list;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import linkedlist.LinkedList;

public class ListFindLoopTest {

	private LinkedList<Integer> listTrue;
	private LinkedList<Integer> listFalse;
	private ListFindLoop listFindLoop;

	public ListFindLoopTest() {
		listFindLoop = new ListFindLoop();
		initList1();
		initList2();
	}

	private void initList1() {
		listTrue = new LinkedList<>();
		listTrue = listTrue.testList();
	}

	private void initList2() {
		listFalse = new LinkedList<>();
		listFalse.add(5);
		listFalse.add(4);
		listFalse.add(3);
		listFalse.add(2);
		listFalse.add(1);
	}

	@Test
	public void findLoopTrueTest() {
		assertTrue(listFindLoop.findLoop(listTrue));
	}

	@Test
	public void findLoopFalseTest() {
		assertFalse(listFindLoop.findLoop(listFalse));
	}

}
