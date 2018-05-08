package main.java;

import java.util.NoSuchElementException;

/*A Queue is a linear data structure organized as FIFO - first in, first out
 * OperationS:
 * - we insert, or enqueue, an item at the end of the list;
 * - we delete, or dequeue, an item at the beginning of the list;
 * - we peek the item at the beginning of the list
 * 
 * Queue methods:
 * - element() - >retrieves, but not remove the head of the Q
 * - offer() -> insert an element at the back of the Q
 * - peek() - > can look but not remove the head of the Q
 * - poll() -> retrieves and removes the head element of the Q 
 * - remove() -> --------||--------------
 * 
 * Dequeue(double ended Q -- add & remove from front & end of the structure)methods:
 * - add()
 * - offer()
 * - remove()
 * - poll()
 * - element()
 * - peek()
 * - addLast()
 * - offerLast()
 * - removeFirst()
 * - pollFirts()
 * - getFirst()
 * - peekFirst()
 * 
 * if we use a dequeue as a stack we have: addFirst(), removeFirst(), peekFirst()
 */
public class Queue {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		queue.print();
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		//System.out.println(queue.first());
		//System.out.println(queue.last());

	}
	//points to the first element into the Q
	private LNode front;
	//point to the last elemet into the Q
	private LNode rear;
	private int length;
	
	public Queue()
	{
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	
	private class LNode
	{
		private int data;
		private LNode next;
		
	public LNode(int data)
	{
		this.data = data;
		this.next = null;
		
	}
	}
	public int length()
	{
		return length;
	}
	public boolean isEmpty()
	{
		return length == 0;
	}
	//insert elements into Q
	public void enqueue(int data)
	{
		LNode temp = new LNode(data);
		if(isEmpty())
		{
			front = temp;
		}else
		{
			rear.next = temp; 
		}
		rear = temp;
		length++;
		System.out.println(data+ " added to the queue");
	}
	//print the elements of the Q
	public void print()
	{
		if(isEmpty())
		{
			return;
		}
		LNode  current =  front;
		while(current!=null){
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	//delete elements from Q
	public int dequeue()
	{
		if(isEmpty()){
			throw new NoSuchElementException("Queue is empty");
		}
		//store front.data to result
		int result = front.data;
		front = front.next;
		if(front == null){
			rear = null;
		}
		length--;
		System.out.println(result+ " removed from the queue");
		return result;
	}
	public int first()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Queue is empty");
		}
		return front.data;
	}
	public int last()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Queue is empty");
		}
		return rear.data;
	}
}
