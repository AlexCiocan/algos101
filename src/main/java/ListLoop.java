package main.java;

/* 
 * 1. Detect the loop(cycle) in the linked list
 * 2. Detect the start node of the loop
 * 
 * Floyd's detection algorithm:
 * 1 - use two pointer fastPointer and slowPointer and initialize both to head of linkedlist
 * 2 - move fastPonter by 2 nodes and slowPointer by one node in each iteration
 * 3 - if fastPointer and slowPointer meet at some iteration, then there is a loop in linkeslist
 * 4 - if fastPointer reaches to the end of linkedlist without meeting the slowPointer then there is no loop in the linkedlist(fastPointer -> next or fastPointer ->next->next become null)
 */
public class ListLoop {
	
	Node head;
	Node tail;
	
	class Node{
		
		 int val;
		 Node next;
		
	public Node(int val)
	{
		this.val = val;
		this.next = null;
	}
	}
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
		System.out.println();
	}

public boolean isLoopList()
{	
	Node fast = head;
	Node slow = head;
	
	while(fast != null && fast.next !=null && slow.next != null){
	
	fast = fast.next.next;
	slow = slow.next;
	
	if(slow == fast){
		return true;
	}
	
	
	}
 	return false;
}	

public void creatLoop()
{
	Node first = new Node(1);
	Node second = new Node(2);
	Node third = new Node(3);
	Node fourth = new Node(4);
	Node fifth = new Node(5);
	Node sixth = new Node(6);
	
	head = first;
	first.next = second;
	second.next = third;
	third.next = fourth;
	fourth.next = fifth;
	fifth.next = sixth;
	sixth.next = third;
	
	
	
}
	public static void main(String[] args) {
		
		ListLoop list = new ListLoop();
				
		list.creatLoop();

		System.out.println("Loop" + " " + list.isLoopList());
		
		
	}

}
