package pl.sda.structures.tree;

public class TreeTest {

	public static void main(String[] args) {
		Tree<Integer> tree = Tree.createSampleTree();
		tree.printTreeInOrder(tree.root);
		System.out.println();
		tree.printTreeInRevOrder(tree.root);
		
	}
}
