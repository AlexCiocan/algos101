package list;

import java.util.ArrayList;
import java.util.Set;

public interface Searchable {
	Set<Integer> findDuplicatesInArray(int[] list);

	Set<Integer> findDuplicatesInCollection(ArrayList<Integer> list);
}
