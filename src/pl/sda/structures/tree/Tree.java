package pl.sda.structures.tree;

public class Tree<T> {

	Node<T> root;

	public Tree(Node<T> root) {
		this.root = root;
	}

	public static Tree<Integer> createSampleTree() {
		Node<Integer> n6 = new Node(6, null, null);
		Node<Integer> n20 = new Node(20, null, null);
		Node<Integer> n4 = new Node(4, null, null);
		Node<Integer> n5 = new Node(5, n4, n6);
		Node<Integer> n10 = new Node(10, n5, n20);

		return new Tree(n10);
	}

	public int treeHeight() {
		return heightFromNode(root);
	}

	public int heightFromNode(Node node) {

		if (node == null)
			return 0;
		else
			return Math.max(heightFromNode(node.leftChild), heightFromNode(node.rightChild)) + 1;
	}

	public void printTreeInOrder(Node node) {
		if (node != null) {
			printTreeInOrder(node.leftChild);
			System.out.print(node);
			printTreeInOrder(node.rightChild);
		}

	}
	
	public void printTreeInRevOrder(Node node) {
		if (node != null) {
			printTreeInRevOrder(node.rightChild);
			System.out.print(node);
			printTreeInRevOrder(node.leftChild);
		}

	}

}
