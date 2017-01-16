package pl.sda.structures.list;

public class ListElement<T> {
	private T element;
	private ListElement<T> next, prev;

	public ListElement(T element) {
		this.element = element;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public ListElement<T> getNext() {
		return next;
	}

	public void setNext(ListElement<T> next) {
		this.next = next;
	}

	public ListElement<T> getPrev() {
		return prev;
	}

	public void setPrev(ListElement<T> prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getElement().toString();
	}
	
	

}
