package sorts;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSortStandard implements Sortable {

	@Override
	public void sortArray(double[] list) {		//this is close to n^2 complexity always because it swaps always
		int n = list.length;
		boolean sorted;	
		
		do {
			sorted = false;
			for (int i = 0; i < n - 1; i++) {
				if (list[i] > list[i + 1]) {
					sorted = true;
					
					swapElements(list, i, i + 1);
				}
			}
			
		} while (sorted);
	}

	@Override
	public void sortCollection(ArrayList<Double> list) {
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

	private void swapElements(double[] list, int i, int j) {
		double temp = list[i];
		list[i] = list[i + 1];
		list[i + 1] = temp;
	}
	
}
