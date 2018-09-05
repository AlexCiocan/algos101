package linkedlist;

public class LinkedList<T> {
	private Node<T> head;
	private int size;

	public LinkedList() {
		size = 0;
	}

	public LinkedList(T data) {
		head = new Node<T>(data);
		size = 1;
	}

	public void add(T data) { // add to start
		Node<T> tmp = head;
		head = new Node<T>(data);
		head.next = tmp;
		size++;
	}

	public void addToIndex(int i, T data) {
		if (i == 0) {
			add(data);
			return;
		}
		int j = 1;
		Node<T> t = head;
		while (t.next != null && j != i) {
			t = t.next;
			j++;
		}
		if (j == i) {
			Node<T> temp = t;
			t = new Node<T>(data);
			t.next = temp.next;
			temp.next = t;
			size++;
		}
	}
	
	public Node<T> getNode(int i) {
		int j = 1;
		Node<T> t = head;
		while (t.next != null && j != i) {
			t = t.next;
			j++;
		}
		if (t != null && i == j) {
			return t;
		} 
		return null;
	}
	
	public Node<T> getHead() {
		return head;
	}
	
	public int getNodePosition(Node<T> node) {
		int j = 1;
		Node<T> t = head;
		while (t != node) {
			if (t.next == null)
				return -100;
			t = t.next;
			j++;
		}
		return j;
	}

	public void remove() {
		if (head != null) {
			size--;
			head = head.next;
		}
	}

	public void printList() {
		Node<T> t = head;
		while (t != null) {
			System.out.println(t.getData().toString());
			t = t.next;
		}
	}

	public int getSize() {
		return size;
	}
	
	public LinkedList<Integer> testList() {					// for test
		Node<Integer> tmp1 = new Node<>(1);
		Node<Integer> tmp2 = new Node<>(2);
		Node<Integer> tmp3 = new Node<>(3);
		Node<Integer> tmp4 = new Node<>(4);
		
		LinkedList<Integer> list = new LinkedList<>();
		list.head = tmp1;
		list.head.next = tmp2;
		tmp2.next = tmp3;
		tmp3.next = tmp4;
		tmp4.next = tmp1;
		
		return list;
	}
}
