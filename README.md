# Algos 101 crash course approach.

BubbleSort algorithm performance: is a slow method because it has to compare each element of array to another and then swaps if it is on right side. 

Average case perfomnace is in o(n^2), is suited for small list or when the list is almost sorted. We need 2 for loops and that result in complexity of o(n^2)
Best performance for this method is o(n) beats quicksort's best case perfomance of o(NlogN) 

Array can be sorted on ascending or descending order.

Performance - the algorithm identify that the array is sorted and passes forward without making swapp



Collection.sort - sort(List<T> list) or sort(List<T> list, Comparator<? super T> c)  the list is sorted based on the specified comparator, Comparator’s compare(Object o1, Object o2)


QuickSort- divide and conquer algorithm, is the most efficient and quickest sorting algoritm.

1. Recursive call to sort the sub-lists, the key process is partition, pick a pivot and partition the array around the given pivot.
The worst case is O(n^2) - the worst case would occur when the array is already sorted in increasing or decreasing order
the best case / average case o(nLogn) - The best case occurs when the partition process always picks the middle element as pivot. 
for example: x is a pivot and put all smaller elements(smalller than x) before x, and all the greather elements(greater than x) after x. All this are done in linear time.

2.  Iterative QuickSort
	Performance: best case / average  O(nLogn)
		     worst case o(n^2)

MergeSort:
	Performance: O(nLogn)
	Is Stable, is fast
