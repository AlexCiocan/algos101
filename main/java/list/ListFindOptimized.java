package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListFindOptimized implements Searchable {								// complexity: O(n)

	@Override
	public Set<Integer> findDuplicatesInArray(int[] list) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> result = new HashSet<>();

		for (int value : list) {
			if (set.contains(value))
				result.add(value);
			set.add(value);
		}
		return result;
	}

	@Override
	public Set<Integer> findDuplicatesInCollection(ArrayList<Integer> list) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> result = new HashSet<>();

		for (int value : list) {
			if (set.contains(value))
				result.add(value);
			set.add(value);
		}
		return result;
	}

}
