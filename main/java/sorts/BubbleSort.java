package sorts;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort implements Sort {

	@Override
	public void sortArrayFirstApproach(double[] list) {		//this is close to n^2 complexity always because it swaps always
		int n = list.length;
		boolean sorted;	
		double temp;
		
		do {
			sorted = false;
			for (int i = 0; i < n - 1; i++) {
				if (list[i] > list[i + 1]) {
					sorted = true;
					
					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
				}
			}
			
		} while (sorted);
	}

	@Override
	public void sortArraySecondApproach(double[] list) {	// in best case n - complexity
															// at every iteration at least one element will be in the right place
		
		boolean sorted;										// flag until the list is sorted
		double temp;										// for swap
		int k = list.length - 1;							// remember the last place where swap was executed
		int end;											// until this element is the list not sorted
		
		do {
			end = k - 1;									// the element at "end" is on the right place
			sorted = false;						
			
			for (int i = 0; i < end; i++) {
				if (list[i] > list[i + 1]) {
					sorted = true;
					k = i;

					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
				}
			}
		} while (sorted);
		
	}

	@Override
	public void sortCollectionFirstApproach(ArrayList<Double> list) {
		int n = list.size();
		boolean sorted;	
		
		do {
			sorted = false;
			for (int i = 0; i < n - 1; i++) {
				if (list.get(i) > list.get(i + 1)) {
					sorted = true;
					
					Collections.swap(list, i, i + 1);
				}
			}
		} while (sorted);
	}

	@Override
	public void sortCollectionSecondApproach(ArrayList<Double> list) {
		boolean sorted;										// flag until the list is sorted
		int k = list.size() - 1;							// remember the last place where swap was executed
		int end;											// until this element is the list not sorted
		
		do {
			end = k - 1;									// the element at "end" is on the right place
			sorted = false;						
			
			for (int i = 0; i < end; i++) {
				if (list.get(i) > list.get(i + 1)) {
					sorted = true;
					k = i;

					Collections.swap(list, i, i + 1);
				}
			}
		} while (sorted);
	}

}
