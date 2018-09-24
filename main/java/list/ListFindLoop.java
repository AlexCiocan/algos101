package list;

import linkedlist.LinkedList;
import linkedlist.Node;

public class ListFindLoop {

	public boolean findLoop(LinkedList<Integer> list) {
		Node<Integer> tmp1 = list.getNode(0);
		if (tmp1 == null)
			return false;
		
		Node<Integer> tmp2 = tmp1.next;
		while (tmp2 != null) {
			tmp1 = tmp1.next;
			
			if (tmp2.next == null) 
				return false;
			
			tmp2 = tmp2.next.next;
			
			if (tmp1 == tmp2)
				return true;
		}
		
		return false;
	}

}
