package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListFindStandard implements Searchable {								// complexity: O(n^2)

	@Override
	public Set<Integer> findDuplicatesInArray(int[] array) {
		Set<Integer> result = new HashSet<>();

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (i != j && array[i] == array[j])
					result.add(array[i]);
			}
		}
		return result;
	}

	@Override
	public Set<Integer> findDuplicatesInCollection(ArrayList<Integer> list) {
		Set<Integer> result = new HashSet<>();

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (i != j && list.get(i) == list.get(j))
					result.add(list.get(i));
			}
		}
		return result;
	}

}
