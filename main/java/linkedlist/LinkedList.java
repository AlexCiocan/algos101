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

	public Node<T> getNode(int i) {
		int j = 0;
		Node<T> t = head;
		while (t.next != null && j != i) {
			t = t.next;
			j++;
		}
		return t;
	}

	public int getNodePosition(Node<T> node) {
		int j = 0;
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
}
