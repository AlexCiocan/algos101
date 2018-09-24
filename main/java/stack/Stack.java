package stack;

import linkedlist.Node;

public class Stack<T> {								// L(ast)I(n)F(irst)O(ut)
	private int curDepth, maxDepth;
	private Node<T> top;
	
	public Stack(int maxDepth) {
		this.maxDepth = maxDepth;
		curDepth = 0;
		top = null;
	}
	
	public Node<T> getTop() {
		return top;
	}
	
	public int getCurrentDepth() {
		return curDepth;
	}
	
	public void add(T data) {
		Node<T> tmp = new Node<T>(data);
		if (top == null) {
			top = tmp;
			curDepth++;
		}
		else if (curDepth < maxDepth){
			tmp.next = top;
			top = tmp;
			curDepth++;
		}
	}
	
	public T top() {
		if(top != null) {
			return top.getData();
		}
		return null;							// throw custom exception
	}
	
	public T pop() {
		if(top != null) {
			T tmp = top.getData();
			top = top.next;
			curDepth--;
			return tmp;
		}
		return null;							// throw custom exception
	}
	
	public int getMaxDepth() {
		return maxDepth;
	}
	
	
}
