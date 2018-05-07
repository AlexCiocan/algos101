
package main.java;
/*
 * The selection sort algorithm sorts an array by repeatedly finding the smallest element of the unsorted tail region and moving it to the front.
	performance O(n2) time complexity
 * 
 */
import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
	
	public static void sort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			int minPos = minimumPosition(arr, i);
			ArrayUtil.swap(arr, minPos, i);
		}
	}
/*
 * find the smallest element in a array
 * from - is the first position in array to compare
 * return - the position of the smallest element from arr[from] to arr[arr.length-1] 
 */
	private static int minimumPosition(int[] arr, int from)
	{
		int minPos = from;
		for(int i = from + 1; i < arr.length; i++)
		{
			if(arr[i] < arr[minPos])
			{
				minPos = i;
			}			
		}
		return minPos;
	}
	// sorting an array filled with random numbers
	public static void main(String[] args) {
		
		//instantiate an array and fill with random values
		int[] arr = ArrayUtil.randomIntArray(10,30);
		
		System.out.println(Arrays.toString(arr) );
		
		SelectionSort.sort( arr ); // sort the array
		
		System.out.println( Arrays.toString(arr) );
			
	}
	//n - number of possible random values ; return - array filled with numebrs between 0 and n-1 
	public static class ArrayUtil{
		private static Random rand = new Random();
	
		public static int[] randomIntArray(int length, int n)
		{
			
		int[] arr = new int[length];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = rand.nextInt(n);
		}
		return arr;
	}
	/*swap elements i and j:
	 * 1.Assign the value of element i to the temporary variable.
	 * 2. Assign the value of element j to element i.
	 * 3. Assign the value in the temporary variable to element j.
	 */
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = arr[i];
	}
}
}
