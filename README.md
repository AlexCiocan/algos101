# Algos 101 crash course approach.

!!!!!! Whenever possible user Collections.* or Arrays.* util classes.

1. Implement Bubble sort for both arrays and collections( 2 approaches). Performance ?.. Can you improve it ?
First approach: 
	- standard bubble sort: loop trough the list until we don't need to swap elements. 
							it's performance is almost n^2 in every case
							
Idea: after a swap the rightmost element gets its right place so at the next iteration we don't need to loop through the whole list, just to
the last swapped element index.

=> Second approach:
	- we save the index of the last swapped element so we don't have to loop through the whole list.
	- performance:  in the best case its complexity is n.


2. Implements QuickSort for both arrays and collections(2 approaches = iterative + recursiv) [Look up 3way Quicksort]. Performance..?

  => [How each sort type (mergeSort + BST + insertionSort + selection Sort....) is working + complexity].
  
  
3. Shuffle an array evenly.
3. Fibonacci (it + recurs). Next Step compute fibonacci for very large numbers.
4. Implement a LinkedList locally.
  =>[ Know differencese between List vs Set vs Map and their implementations] 
5. Find duplicates in a  collection and array ( 2 solutions).
6. Find if a list has a loop in O(n) 
7. Reverse a list in O(n).
8. Implement Stack and Queue locally. What's the difference between them. Think of a problem than you can solve using a queue data structure.
9. Parantheses problem + palindrome
