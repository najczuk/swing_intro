package pl.sda.sorting;

import java.util.Comparator;
import java.util.List;
import static java.util.Collections.swap;


public class InsertionSorter implements ListSorter {

	@Override
	public List sort(List<? extends Comparable> list) {
		int size = list.size();
		for (int pass = 1; pass < size; pass++) {
			int i = pass;
			while (i > 0 &&(list.get(i).compareTo(list.get(i - 1)) < 0)) {
				swap(list, i, i - 1);
				i--;
			}
		}
		return list;
	}

	@Override
	public List sort(List list, Comparator comparator) {
		int size = list.size();
		for (int pass = 1; pass < size; pass++) {
			int i = pass;
			while (i > 0 &&
					comparator.compare(list.get(i), list.get(i - 1)) < 0
				) {
				swap(list, i, i - 1);
				i--;
			}
		}
		return list;
	}

}
