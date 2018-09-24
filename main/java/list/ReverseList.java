package list;

import linkedlist.LinkedList;
import linkedlist.Node;

public class ReverseList {

	public LinkedList<Integer> reverseList(LinkedList<Integer> list) {
		Node<Integer> myHead = list.getHead();
		LinkedList<Integer> tmp = new LinkedList<>();
		
		while (myHead.next != null) {											// going trough the list once => complexity O(n)
			tmp.add(myHead.getData());											// we are adding elements to the head => it reverts the list
			myHead = myHead.next;
		}
		
		tmp.add(myHead.getData());
		return tmp;
	}
}
