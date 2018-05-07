/*
 * A stack represent a last in first out(LIFO) stack of objects. It extends class Vector with 5 operations that allow a vector to be treated as a stack.
 * 1. pop() - allows to remove the object to the top of the stack
 * 2. push() - allows to put an object on the top of the stack
 * 3. peek() - allows to see the item at the top of the stack without removing it
 * 4. empty()
 * 5. search()
 */
package main.java;
import java.util.EmptyStackException;

//implementing a Stack using LinkedList
public class Stack {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}

		private LNode top;
		private int length;
	
	private class LNode
	{
		private int data;
		private LNode next;
	//constructor	
	public LNode(int data)
	{
		this.data = data;
	}
	}
	//first: top = null, length = 0
	//push(10)
	public Stack()
	{
		top = null;
		length = 0;
	}
	public int length()
	{
		return length;
	}

	public boolean isEmpty()
	{
		return length == 0;
	}
	public void push(int data)
	{
		LNode temp = new LNode(data);
		temp.next = top;
		top = temp;
		length++;
	}
	public int pop()
	{
		if(isEmpty()){
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}
	//returns value from top
	public int peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		return top.data;
	}
	}