package sorts;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSortRecursive implements Sortable {

	@Override
	public void sortArray(double[] list) {
		quickSortArray(list, 0, list.length - 1);
	}

	@Override
	public void sortCollection(ArrayList<Double> list) {
		quickSortCollection(list, 0, list.size() - 1);
	}
	
	private void quickSortArray(double[] list, int left, int right) {
		int i = left;
        int j = right;
        double pivot = list[left+(right-left)/2];					// the middle element as pivot
        
        while (i <= j) {												// while the indexes are valid
            while (list[i] < pivot) {								// searching from the left the number which is greater than the pivot
                i++;
            }
            while (list[j] > pivot) {								// searching from the right the number which is lesser than the pivot
                j--;
            }
            if (i <= j) {												// if the indexes are valid -> swap those elements
            	swapElements(list, i, j);
                
                i++;													// step with the indexes
                j--;
            }
        }
        if (left < j)													// call quick sort for the left subset
        	quickSortArray(list, left, j);
        if (i < right)													// call quick sort for the right subset
        	quickSortArray(list, i, right);
    }
	
	
	private void quickSortCollection(ArrayList<Double> list, int left, int right) {
        int i = left;
        int j = right;
        double pivot = list.get(left+(right-left)/2);					// the middle element as pivot
        
        while (i <= j) {												// while the indexes are valid
            while (list.get(i) < pivot) {								// searching from the left the number which is greater than the pivot
                i++;
            }
            while (list.get(j) > pivot) {								// searching from the right the number which is lesser than the pivot
                j--;
            }
            if (i <= j) {												// if the indexes are valid -> swap those elements
            	Collections.swap(list, i, j);
                
                i++;													// step with the indexes
                j--;
            }
        }
        if (left < j)													// call quick sort for the left subset
        	quickSortCollection(list, left, j);
        if (i < right)													// call quick sort for the right subset
        	quickSortCollection(list, i, right);
    }
	
	private void swapElements(double[] list, int i, int j) {
		double temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
}
