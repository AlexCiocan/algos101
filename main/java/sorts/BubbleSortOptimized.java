package sorts;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSortOptimized implements Sortable {

	@Override
	public void sortArray(double[] list) { 	// in best case n - complexity
										   	// at every iteration at least one element will be in the right place

		boolean sorted; 					// flag until the list is sorted
		int k = list.length - 1; 			// remember the last place where swap was executed
		int end; 							// until this element is the list not sorted

		do {
			end = k - 1; 					// the element at "end" is on the right place
			sorted = false;

			for (int i = 0; i < end; i++) {
				if (list[i] > list[i + 1]) {
					sorted = true;
					k = i + 1;

					swapElements(list, i, i + 1);
				}
			}
		} while (sorted);

	}

	@Override
	public void sortCollection(ArrayList<Double> list) {
		boolean sorted;										// flag until the list is sorted
		int k = list.size() - 1;							// remember the last place where swap was executed
		int end;											// until this element is the list not sorted
		
		do {
			end = k - 1;									// the element at "end" is on the right place
			sorted = false;						
			
			for (int i = 0; i < end; i++) {
				if (list.get(i) > list.get(i + 1)) {
					sorted = true;
					k = i + 1;

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
