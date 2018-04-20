package main.java;

import java.util.Arrays;
import java.util.Stack;

public class iterariveQuickSort {

	public static void main(String[] args) {
		int[] arr = {1, 8, 3, 9, 4, 5, 7, -2, -10, 0};
		
		iterative(arr);
				
		System.out.println("After sorting : " + Arrays.toString(arr));
		

	}
	
	public static void iterative(int[] arr){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		stack.push(arr.length-1);
		while(!stack.isEmpty())
		{
			int right = stack.pop();
			int left = stack.pop();
			int i = partition(arr, left, right);
			if(i + 1 < right){
				stack.push(i+1);
				stack.push(right);
			}
			if(i-1 > left ){
				stack.push(left);
				stack.push(i-1);
			}
		}
	}
	private static int partition(int[] arr, int low, int high)

	{
		int pivot = arr[high];//pivot is the last element
		int i = (low - 1); // index of smaller element
		int temp;
		
		for(int j=low; j<=high-1; j++){
			// if current element is smaller than or equal to pivot 
			if(arr[j] <= pivot){
				i++;
							
				//swap a[i] & a[j]
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		//swap a[i+1] and a[high]
		temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i;
	}
	
	}

