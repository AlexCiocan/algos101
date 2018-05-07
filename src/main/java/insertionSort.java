package main.java;

import java.util.Arrays;

/*
 * We are starting from the second element of the array. On inner loop we initialize index with next element. In the first iteration j=1 and points to the second element.
 * The inner loop is used to compare current element with the already sorted element. After each iteration we decrease j by 1, for j > 0 condition stops when we reach at the 
 * beginning of the array. At each step of the algorithm, we take the next element from the right section and insert it into the left, in such a way that the left section remains sorted.
 * Swapping occur only if the current element is less than the already sorted element.
 * Once we came out of outer loop, the array is sorted in ascending order.  
 * 
 * Performance(is suitable for small elements, because it requires more time for sorting large number of elements):
 * 		best case is for already sorted or nearly sorted array: o(n). in this case we make only comparison without swapping
 * 		average / worst case is for unsorted or reverse-sorted data: o(n^2). For n-1 iteration we need n comparison and n swapping

*/
public class insertionSort {

	public static void main(String[] args) {
		
		int[] arr = {1, 8, 3, 9, 4, 5, 7, -2, -10, 0};
		
		insertion(arr);
				
		System.out.println("After sorting : " + Arrays.toString(arr));

	}

	public static void insertion(int[] data)
	{
		
		for(int i = 1; i < data.length; i++)
		{
			int key = data[i];
			int j = i - 1;
			
			while(j >=0 && key < data[j])
			{
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = key;
		}
	}
}
