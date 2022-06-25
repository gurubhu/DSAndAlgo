package com.ds.practice.tree;

public class BinaryTree {
	
	Node root;
	
	public BinaryTree() {
		root  = null;
	}
	
	public BinaryTree(int item) {
		root = new Node(item);
	}
	
	public int heightRec(Node root) {
		if(root == null)
			return 0;
		
		return 1 + Math.max(heightRec(root.left), heightRec(root.right));
	}
}
