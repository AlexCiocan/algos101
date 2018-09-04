package linkedlist;

public class Node<T> {
	public Node<T> next;
	private T data;
	
	public Node(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
}
