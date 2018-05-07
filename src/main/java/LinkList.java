package main.java;

/*
 * List, Set and Map are interfaces which implements Collection interface. A linked list is a chain of elements(nodes) in which each item has a reference(or link) to the next or previous element.
 * List -> is a interface that has some implementation like: ArrayList(random access with index), LinkedList(add and remove elements from middle list), Vector(idem as ArrayList), Stack
 * List can store objects in insertion order and duplicate elements, allows null elements.
 * 
 * Set -> is also a interface that has implementations like: HashSet(maintains order), SortedSet(maintains order), TreeSet(maintains a sorting order, imposed by using compare() or CompareTo())
 * Set allows only unique elements and insertion order is not preserved, allows only one null element.
 * 
 * Map -> is a interface that stores object as key and value, key-value pair. Values can be duplicated but keys are unique. Allows null values and at most one null key.
 * Map has implementation like: HashMap, TreeMap(maintains a sorting order, imposed by using Comparator or Comparable)
 * 
 * 
 */

//linked lists are efficient for inserting or removing elements, but access in random order can be slow
public class LinkList {
	
	Node head;
	Node tail;
	
class Node
{
	
	int val;
	Node next;
	
	public Node(int val)
	{
		this.val = val;
	}
}
	//Node head = null,
	//tail = null;
	
	public static void main(String[] arg )
	{
		LinkList  list = new LinkList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.printLinkedList();
		list.addNodeAtStart(50);
		list.printLinkedList();
		list.deleteNode();
		list.printLinkedList();
		
	}
	//add node at the end of the list
	public void addNode(int val)
	{
		if(head == null)
		{
			Node temp = new Node(val);
			head = temp;
			tail = temp;
		}else
		{
			tail.next = new Node(val);
			tail = tail.next;
		}
	}
	//add node at the start of the list
	public void addNodeAtStart(int val)
	{
		if(head == null)
		{
			Node temp = new Node(val);
			head = temp;
			tail = temp;
		}else
		{
			Node temp = new Node(val);
			temp.next = head;
			head = temp;
		}
	}
	//Removes the last node in the given list and updates tail node	 
	public void deleteNode(){
		 Node temp = head;
		 while(temp.next!=null && temp.next.next!=null){
			 temp = temp.next;
		 }
		 temp.next = null;
		 tail = temp;
	}
	public void printLinkedList(){
		System.out.println();
		Node temp = head;
		while(temp!=null){
			System.out.print(" "+temp.val + " ");
			temp = temp.next;
		}
	}
	
}
	
