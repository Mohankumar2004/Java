package BinarySearchTree;

public class Node {
	int key;
	Node left, right;
	Node(int key) {
		this.key = key;
		left = right = null;
	}
	Node(int key, Node left, Node right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}
}
