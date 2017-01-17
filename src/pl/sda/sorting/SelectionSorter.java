package pl.sda.sorting;

import java.util.Comparator;
import java.util.List;
import static java.util.Collections.swap;

public class SelectionSorter implements ListSorter {

	@Override
	public List sort(List<? extends Comparable> list) {
		int wall, size = list.size(), smallest;

		for (wall = 0; wall < size; wall++) {
			smallest = wall;

			for (int i = wall + 1; i < size; i++) {
				smallest = list.get(smallest).compareTo(list.get(i)) > 0 ? i : smallest;
			}
			swap(list,wall,smallest);

		}

		return list;
	}

	@Override
	public List sort(List list, Comparator comparator) {
		// TODO Auto-generated method stub
		return null;
	}

}
