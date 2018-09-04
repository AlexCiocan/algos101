package queue;

import linkedlist.Node;

public class Queue<T> {
	private Node<T> head, tail;
	private int size;

	public Queue() {
		head = null;
		tail = null;
		size = 0;
	}

	public void add(T data) {
		Node<T> tmp = new Node<>(data);

		if (size == 0) {
			head = tmp;
			tail = tmp;
		} else {
			tail.next = tmp;
			tail = tmp;
		}
		size++;
	}

	public T peek() {
		if (head != null) {
			return head.getData();
		}
		return null; // throw custom exception
	}

	public T remove() {
		if (head != null) {
			T tmp = head.getData();
			head = head.next;
			size--;
			return tmp;
		}
		return null; // throw custom exception
	}

	public int getSize() {
		return size;
	}

}
