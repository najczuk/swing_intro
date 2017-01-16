package pl.sda.sorting;

import java.util.Comparator;
import java.util.List;
import static java.util.Collections.swap;

public class BubbleSorter implements ListSorter {

	@Override
	public List sort(List<? extends Comparable> list) {
		int size = list.size();
		for (int pass = 1; pass < size; pass++) {
			for (int left = 0; left < (size - pass); left++) {
				int right = left + 1;
				if (list.get(left).compareTo(list.get(right)) > 0) {
					swap(list, left, right);
				}
			}
		}
		return list;
	}

	@Override
	public List sort(List list, Comparator comparator) {
		// TODO Auto-generated method stub
		return null;
	}

}
