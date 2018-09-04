package sorts;

import java.util.ArrayList;

import fileHandler.FileHandler;

public class InitLists {

	private static double[] list;
	private static ArrayList<Double> collection;
	
	public InitLists(String fileName) {
		initArrayAndCollection(fileName);
	}
	
	private void initArrayAndCollection(String fileName) {
		collection = readFromFile(fileName);
		initArrayFromCollection(collection);
	}

	private ArrayList<Double> readFromFile(String fileName) {
		FileHandler fileHandler = new FileHandler(fileName);
		return fileHandler.getValues();
	}
	
	private static void initArrayFromCollection(ArrayList<Double> collection) {
		list = new double[collection.size()];
		for (int i = 0; i < collection.size(); i++) {
			list[i] = collection.get(i);
		}
	}
	
	public double[] getArray() {
		return list;
	}
	
	public ArrayList<Double> getCollection() {
		return collection;
	}
}
