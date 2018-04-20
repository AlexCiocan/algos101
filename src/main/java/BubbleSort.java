package main.java;
public class BubbleSort{
	
	public static void main(String[] args){
		
		double[] arr = {2.7, 6.3, 5.4, 1.0, 7.2, 9.8, -1, 0, -15};
		
		//sort(arr);
		optimizedBubbleSort(arr);
		for(int i = 0; i < arr.length; i++){
			
			System.out.println(arr[i]);
		}
				
	}

	/*
	public static int[] sort(int[] arr){
		
		int temp = 0;
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
			for(int j = 1; j < (n-i); j++)
			{
				if(arr[j-1] > arr[j]) // ascendent pentru numere pozitive, descendent pentru numere negative
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
	
	public static void optimizedBubbleSort(double[] arr){
		
		int n = arr.length;
		for(int i = 0; i < n-1; i++)
		{
			boolean swapp = false;
			for(int j = 1; j < n-i ; j++)
			{
				if(arr[j] < arr[j-1]){		
					double temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swapp = true;
				}
				
			}
			
			//System.out.println(array);
			if(!swapp){
				break;
			}
			
		}
		
	
	}
}