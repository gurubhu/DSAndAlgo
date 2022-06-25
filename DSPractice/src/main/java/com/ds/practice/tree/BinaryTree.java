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
	
	public void levelOrderRec() {
		int height = heightRec(root);
		
		for(int i = 0 ; i <= height; i++)
			printCurrentLevel(i, root);
	}

	private void printCurrentLevel(int level, Node root) {
		if(root == null)
			return;
		if(level == 1)
			System.out.print(" " + root.data);
		else if (level > 1){
			printCurrentLevel(level-1, root.left);
			printCurrentLevel(level-1, root.right);
		}
		
	}
}
