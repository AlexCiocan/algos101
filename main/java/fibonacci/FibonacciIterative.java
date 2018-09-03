package fibonacci;

import java.util.ArrayList;

public class FibonacciIterative {

	public ArrayList<Integer> generateFibonacciSeq(int n) {
		ArrayList<Integer> solution = new ArrayList<>();
		int f0 = 0, f1 = 1, f = 1, curr = 3;

		if (n == 0)
			return solution;
		if (n == 1) {
			solution.add(f0);
			return solution;
		}
		if (n == 2) {
			solution.add(f1);
			return solution;
		}
		solution.add(f0);
		solution.add(f1);
		solution.add(f);

		while (curr < n) {
			f0 = f1;
			f1 = f;
			f = f0 + f1;
			solution.add(f);
			curr++;
		}

		return solution;
	}
}
