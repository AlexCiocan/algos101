package main;

import java.util.ArrayList;

import sorts.BubbleSort;

public class Main {
	private static double[] list;
	private static ArrayList<Double> collList;
	
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		
		bubbleSortArrayFirstApproach(bubbleSort);
		bubbleSortArraySecondApproach(bubbleSort);
		
		bubbleSortCollectionFirstApproach(bubbleSort);
		bubbleSortCollectionSecondApproach(bubbleSort);
	}
	
	public static void printList(double[] list) {
		System.out.print("List: ");
		for (double d : list) {
			System.out.print(d + "   ");
		}
		System.out.println();
	}
	
	public static void printCollection(ArrayList<Double> list) {
		System.out.print("List: ");
		for (double d : list) {
			System.out.print(d + "   ");
		}
		System.out.println();
	}
	
	public static double[] resetList() {
		double[] list = {3.0, 1.0, 2.3, 4.1, 5.8};
		return list;
	}
	
	public static ArrayList<Double> resetCollection() {
		ArrayList<Double> temp = new ArrayList<>();
		temp.add(3.0);
		temp.add(1.0);
		temp.add(2.3);
		temp.add(4.1);
		temp.add(5.8);
		
		return temp;
	}
	
	public static void bubbleSortArrayFirstApproach(BubbleSort bubbleSort) {
		System.out.println("BubbleSort array first approach:");
		list = resetList();
		printList(list);
		
		bubbleSort.sortArrayFirstApproach(list);
		printList(list);
		System.out.println();
	}
	
	public static void bubbleSortArraySecondApproach(BubbleSort bubbleSort) {
		System.out.println("BubbleSort array second approach:");
		list = resetList();
		printList(list);
		
		bubbleSort.sortArraySecondApproach(list);
		printList(list);
		System.out.println();
	}
	
	public static void bubbleSortCollectionFirstApproach(BubbleSort bubbleSort) {
		System.out.println("BubbleSort collection first approach:");
		collList = resetCollection();
		printCollection(collList);
		
		bubbleSort.sortCollectionFirstApproach(collList);
		printCollection(collList);
		System.out.println();
	}
	
	public static void bubbleSortCollectionSecondApproach(BubbleSort bubbleSort) {
		System.out.println("BubbleSort collection second approach:");
		collList = resetCollection();
		printCollection(collList);

		bubbleSort.sortCollectionSecondApproach(collList);
		printCollection(collList);
		System.out.println();
	}
	
}
