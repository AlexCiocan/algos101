package sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class QuickSortIterative implements Sortable {

	@Override
	public void sortArray(double[] list) {
		quickSortArray(list, 0, list.length - 1);
	}

	@Override
	public void sortCollection(ArrayList<Double> list) {
		quickSortCollection(list, 0, list.size() - 1);
	}
	
	private void quickSortCollection(ArrayList<Double> list, int left, int right) {
		if (left >= right)												// if the indexes are wrong exit
			return;
		
		LinkedList<Integer> positionList = new LinkedList<>();			// add to the list the initial parameters
		positionList.add(left);
		positionList.add(right);
		
		while(positionList.size() >= 1) {								// while our list has elements
			left = positionList.get(0);
			right = positionList.get(1);
		
			positionList.remove(1);
			positionList.remove(0);
			
			int pivotPosition = searchPivotPositionCollection(list, left, right);
			
			if(pivotPosition > 1) {										// if position is good add [left, pivotPosition] to list
                positionList.add(left);
                positionList.add(pivotPosition - 1);
            }
 
            if(pivotPosition + 1 < right) {								// if position is good add [pivotPosition + 1, right] to list
                positionList.add(pivotPosition + 1);
                positionList.add(right);
            }
        }
	}
	
	private int searchPivotPositionCollection(ArrayList<Double> list, int left, int right) {
		double pivot = list.get(left);
		while (true) {
			while (list.get(left) < pivot)
				left++;
			while (list.get(right) > pivot)
				right--;

			if (left < right) {
				Collections.swap(list, left, right);
			} else {
				return right;
			}
		}
	}

	private void quickSortArray(double[] list, int left, int right) {
		if (left >= right)												// if the indexes are wrong exit
			return;
		
		LinkedList<Integer> positionList = new LinkedList<>();			// add to the list the initial parameters
		positionList.add(left);
		positionList.add(right);
		
		while(positionList.size() >= 1) {								// while our list has elements
			left = positionList.get(0);
			right = positionList.get(1);
		
			positionList.remove(1);
			positionList.remove(0);
			
			int pivotPosition = searchPivotPositionArray(list, left, right);
			
			if(pivotPosition > 1) {										// if position is good add [left, pivotPosition] to list
                positionList.add(left);
                positionList.add(pivotPosition - 1);
            }
 
            if(pivotPosition + 1 < right) {								// if position is good add [pivotPosition + 1, right] to list
                positionList.add(pivotPosition + 1);
                positionList.add(right);
            }
        }
	}

	private int searchPivotPositionArray(double[] list, int left, int right) {
		double pivot = list[left];
		while (true) {
			while (list[left] < pivot)
				left++;
			while (list[right] > pivot)
				right--;

			if (left < right) {
				swapElements(list, left, right);
			} else {
				return right;
			}
		}
	}
	
	private void swapElements(double[] list, int i, int j) {
		double temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

}
