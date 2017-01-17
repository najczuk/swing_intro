package pl.sda.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingTest {
	
	public static void main(String[] args) {
		
		Integer[] numbers = {4,2,57,3,7,8};
		ArrayList<Integer> listToSort = 
				new ArrayList(Arrays.asList(numbers));
		
		ListSorter sorter = new SelectionSorter();
		
		System.out.println(listToSort.toString());
		sorter.sort(listToSort);
		System.out.println(listToSort.toString());
		
		
	}

}
