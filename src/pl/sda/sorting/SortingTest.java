package pl.sda.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingTest {
	
	public static void main(String[] args) {
		
		Integer[] numbers = {4,2,57,43,23,12};
		ArrayList<Integer> listToSort = 
				new ArrayList(Arrays.asList(numbers));
		
		ListSorter sorter = new QuickSorter();
		
		System.out.println(listToSort.toString());
		sorter.sort(listToSort);
		
		
//		sorter.sort(listToSort,new AdrianIntComparator());
//		sorter.sort(listToSort);
		System.out.println(listToSort.toString());
		
		
	}

}
