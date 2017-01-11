package pl.sda.structures;

public class Stack<T> {
	
	Object[] array;
	int noOfElements =0;
	
	public Stack(){
		array =  new Object[100];
		
	}
	
	public void push(T element){
		//TODO check if array not full
		array[noOfElements] = element;
		noOfElements ++;		
	}
	
	public boolean empty(){
		return noOfElements == 0;
	}
	
	public T peek() {
		if(!empty()){
			return (T) array[noOfElements -1];
		} 
		
		return null;
		
	}
	
	public T pop(){
		if(!empty()){
			
			T result = (T) array[noOfElements -1];
			noOfElements--;
			return result;
		}
		
		return null;		
	}
	
	
	
	
	
	
	

}
