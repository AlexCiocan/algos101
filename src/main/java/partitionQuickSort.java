package main.java;

import java.util.Arrays;

public class partitionQuickSort {

public static void main(String[] args) {
		
		int[] arr = {1, 8, 3, 9, 4, 5, 7};
		//int n = arr.length;
		
		//partitionQuickSort array = new partitionQuickSort();
		sort(arr, 0, arr.length-1);
				
		System.out.println("After sorting : " + Arrays.toString(arr));
		
	}
	//pivot is the last element of the array, puts the pivot in its correct position in sorted array, places all smaller element before pivot(left of pivot) and all greater elements to right of pivot
private static int partition(int a[], int low, int high)
	{
		int pivot = a[high];//pivot is the last element
		int i = (low - 1); // index of smaller element
		int temp;
		
		for(int j=low; j<=high-1; j++){
			// if current element is smaller than or equal to pivot 
			if(a[j] <= pivot){
				i++;
							
				//swap a[i] & a[j]
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		//swap a[i+1] and a[high]
		temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		
		return i;
	}
	//implement QuickSort
private static void sort(int a[], int low, int high)
	{
		if(low < high)
		{
			//q is the partitioning index
			int q;
			q = partition(a, low, high);
			
			//recursiv sort elements before and after partition
			sort(a, low, q-1);
			sort(a, q+1, high);
		}
	}

}

