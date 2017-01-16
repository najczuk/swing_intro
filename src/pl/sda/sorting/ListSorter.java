package pl.sda.sorting;

import java.util.Comparator;
import java.util.List;

public interface ListSorter {

	public List sort(List<? extends Comparable> list);
	public List sort(List list, Comparator comparator);
	
}
