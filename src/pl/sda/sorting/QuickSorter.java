package pl.sda.sorting;

import java.util.Comparator;
import java.util.List;
import static java.util.Collections.swap;

public class QuickSorter implements ListSorter{

	@Override
	public List sort(List<? extends Comparable> list) {
		quicksort(list,0,list.size()-1);
		return null;
	}
	
	private void quicksort(List<? extends Comparable> list, 
			int left, int right){
		if(right > left){
			int pivot = getPivot(list, left,right);
			quicksort(list,0,pivot);
			quicksort(list,pivot+1,right);
		}
	}

	private int getPivot(List<? extends Comparable> list, int left, int right) {
		int i = left -1;
		
//		dopoki left(= j bo to inkrementujemy) <= right
//		sprawdz czy element po indeksem left jest mniejszy od right
//			jeżeli tak to inkrementuj "i" i zrób swap i z left
//				jeżeli nie to nie inkrementuj i nie rob swap
//			inkrementuj left(j)
//		
//		return: jeżeli left < right to zwróć i, wpp. zwróć i -1
		
		while(left<= right){
			if(list.get(left).compareTo(list.get(right))<=0){
				i++;
				swap(list,i,left);
			}
			left++;
		}
		
		int result;
		if(i<right){
			return i;
		} else {
			return i-1;
		}
		
	}

	@Override
	public List sort(List list, Comparator comparator) {
		// TODO Auto-generated method stub
		return null;
	}

}
