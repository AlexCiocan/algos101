package fibonacci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FibonacciRecursive {

	private HashMap<Integer, Long> fibMap;
	private ArrayList<Long> seq;

	public FibonacciRecursive() {
		fibMap = new HashMap<>();
		seq = new ArrayList<>();
	}

	public ArrayList<Long> generateFibonacciSeq(int n) {
		if (n > 0)
			fillMapWithValues(n - 1);																// because of the 0 stored in the map
																									// we need to subtract 1 to get n elements
		for (Map.Entry<Integer, Long> entry : fibMap.entrySet()) {									// create a list with our elements
	        seq.add(entry.getValue());
	    }
		return seq;
	}

	private long fillMapWithValues(int number) {													// generates the n-th element storing the other values too
		if (number == 0) {
			fibMap.put(number, new Long(0));
			return number;
		} else if (number == 1) { 
			fibMap.put(number, new Long(1));
			return number;
		} else if (fibMap.containsKey(number)) {
			return fibMap.get(number);
		} else {
			Long fibonacciValue = fillMapWithValues(number - 2) + fillMapWithValues(number - 1);
			fibMap.put(number, fibonacciValue);
			return fibonacciValue;
		}
	}

}
