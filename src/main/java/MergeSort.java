package main.java;

import java.util.Arrays;

/*
 * Time complexity O(nlogn), stable, recursive using compare
 */
public class MergeSort {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void merge(Comparable[] arr, Comparable[] temp, int l, int m, int h)
	{
		//append operation, compare elements that we want to combine together and inserting them into temp array in sorted order
		for(int i = l; i <=h; i++)
			temp[i] = arr[i];//copy into temp array
		int i = l;
		int j = m +1;
		for(int k = l; k<= h; k++)
		{
			if(i > m)
				arr[k] = temp[j++]; //left complete
			else if(j > h)
				arr[k] = temp[i++]; // right complete
			else if(temp[j].compareTo(temp[i]) < 0)
				arr[k] = temp[j++];//right < left
			else
				arr[k] = temp[i++];//left < right
		}
		
	}
	@SuppressWarnings("rawtypes")
	private static void sort(Comparable[] arr, Comparable[] temp, int l, int h)
	{
		if(l >= h) return; 
		int m = l + (h - l) / 2;
		sort(arr, temp, l, m); // left
		sort(arr, temp, m + 1, h); // right
		merge(arr, temp, l, m, h); //reconstruct the array
		
	}
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] arr)
	{
		 Comparable[] temp = new Comparable[arr.length];
		 sort(arr, temp, 0, arr.length -1);
		
	}

	public static void main(String[] args) 
	{
		Integer[] arr = new Integer[] {3, 0, -1, 5, 15, 10, 8, 25, 15};
		sort(arr);
		System.out.println("After sorting : " + Arrays.toString(arr));
		

	}

}
