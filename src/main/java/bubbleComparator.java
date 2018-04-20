package main.java;

public class bubbleComparator {

	public static void main(String[] args) {
		
		int[] array = {1, 3, 5, 6,8};
		
		//bubbleComparator.compare(array);
		for(int i = 0; i < array.length; i++)
		{
			
			System.out.println(array[i]);
		
		}
	}

/*
public static int[] compare(int[] arr, int[] arr1){
	
	int temp = 0;
	int n = arr.length;
	for(int i = 0; i < n; i++)
	{
		for(int j = 1; j < (n-i); j++)
		{
			if(bubbleComparator.compare(arr[j-1], arr[j] > 0) // ascendent pentru numere pozitive, descendent pentru numere negative
				//if(arr[j] > arr[j-1]) -> descendent pentru numere pozitive, ascendent pentru numere negative 
			{
			//swap elements
			temp = arr[j-1];
			arr[j-1] = arr[j];
			arr[j] = temp;
				
				
			}	
	
		}
	} return arr; 
	
}*/
}