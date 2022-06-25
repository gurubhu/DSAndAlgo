package com.ds.practice.tree;

import java.util.Stack;

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
	
	public void inorderRec(Node root) {
		if(root == null)
			return;
		
		inorderRec(root.left);
		System.out.print(" " + root.data);
		inorderRec(root.right);
	}
	
	public void preorderRec(Node root) {
		if(root == null)
			return;
		
		System.out.print(" " + root.data);
		preorderRec(root.left);	
		preorderRec(root.right);
	}
	
	public void postorderRec(Node root) {
		if(root == null)
			return;
		
		postorderRec(root.left);	
		postorderRec(root.right);
		System.out.print(" " + root.data);
	}
	
	public void inorder() {
		if(root == null)
			return;
		Stack<Node> stack = new Stack<Node>();
		Node curr = root;

		while(curr != null || stack.size() > 0) {
			while(curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			System.out.print(" " + curr.data);
			curr = curr.right;
		}
	}
	
	public int diameterRec(Node root) {
		if(root == null)
			return 0;
		
		int lheight = heightRec(root.left);
		int rheight =  heightRec(root.right);
		int ldiameter = diameterRec(root.left);
		int rdiameter = diameterRec(root.right);
		
		return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
	
	}
}
