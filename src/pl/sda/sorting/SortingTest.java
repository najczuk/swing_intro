package pl.sda.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingTest {
	
	public static void main(String[] args) {
		
		Integer[] numbers = {4,2,57};
		ArrayList<Integer> listToSort = 
				new ArrayList(Arrays.asList(numbers));
		
		ListSorter sorter = new InsertionSorter();
		
		System.out.println(listToSort.toString());
		sorter.sort(listToSort, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int result =0;
				if(o1>o2){
					result = -1;
				} else if(o1<o2){
					result = 1;
				}
				return result;
			}
		});
		
		
//		sorter.sort(listToSort,new AdrianIntComparator());
//		sorter.sort(listToSort);
		System.out.println(listToSort.toString());
		
		
	}

}
