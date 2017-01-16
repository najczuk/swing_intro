package pl.sda.structures.list;

public class List<T> {

	private ListElement<T> head, tail;
	private int size;

	public void add(T e) {

		if (isEmpty()) {
			head = new ListElement<T>(e);
			tail = head;
			size = 1;
		} else {
			ListElement<T> newElement = new ListElement<T>(e);
			newElement.setPrev(tail);
			tail.setNext(newElement);
			tail = newElement;
			size++;
		}

	}

	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder("");
		int currIndex = 0;
		if (!isEmpty()) {
			ListElement<T> currentElement = head;
			while (currIndex < size) {
				builder.append("[").append(currentElement).append("]");
				currentElement = currentElement.getNext();
				currIndex++;
			}
		}

		return builder.toString();
	}

}
