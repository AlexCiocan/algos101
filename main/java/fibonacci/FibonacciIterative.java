package fibonacci;

import java.util.ArrayList;

public class FibonacciIterative {

	public ArrayList<Long> generateFibonacciSeq(int n) {
		ArrayList<Long> solution = new ArrayList<>();
		long f0 = 0, f1 = 1, f = 1;
		int curr = 3;

		if (n == 0)
			return solution;
		if (n == 1) {
			solution.add(new Long(f0));
			return solution;
		}
		if (n == 2) {
			solution.add(new Long(f1));
			return solution;
		}
		solution.add(new Long(f0));
		solution.add(new Long(f1));
		solution.add(new Long(f));

		while (curr < n) {
			f0 = f1;
			f1 = f;
			f = f0 + f1;
			solution.add(new Long(f));
			curr++;
		}

		return solution;
	}
}
