package pl.sda.structures.tree;

public class Node<T> {

	T value;
	Node<T> leftChild, rightChild;
	public Node(T value, Node<T> leftChild, Node<T> rightChild) {
		super();
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	@Override
	public String toString() {
		return "Node[" + value + "] ";
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}
	public Node<T> getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}
	
	
	
	
	
}
