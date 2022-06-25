package com.ds.practice.tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {
	
	
	@Test
	public void simpleBinaryTree() {
		BinaryTree tree = new BinaryTree(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		assertEquals(3, tree.heightRec(tree.root));
	}
	
	@Test
	public void levelOrderRecTest() {
		BinaryTree tree = new BinaryTree(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.levelOrderRec();
		
		BinaryTree tree1 = new BinaryTree(25);
		tree1.root.left = new Node(15);
		tree1.root.right = new Node(50);
		tree1.root.left.left = new Node(10);
		tree1.root.left.right = new Node(22);
		tree1.root.left.left.left = new Node(4);
		tree1.root.left.left.right = new Node(12);
		tree1.root.left.right.left = new Node(18);
		tree1.root.left.right.right = new Node(24);
		tree1.root.right.left = new Node(35);
		tree1.root.right.right = new Node(70);
		tree1.root.right.left.left = new Node(31);
		tree1.root.right.left.right = new Node(44);
		tree1.root.right.right.left = new Node(66);
		tree1.root.right.right.right = new Node(90);
		
		System.out.println("");
		
		tree1.levelOrderRec();
	}
	
	@Test
	public void inorderRecTest() {
		BinaryTree tree = new BinaryTree(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.inorderRec(tree.root);
		
		BinaryTree tree1 = new BinaryTree(25);
		tree1.root.left = new Node(15);
		tree1.root.right = new Node(50);
		tree1.root.left.left = new Node(10);
		tree1.root.left.right = new Node(22);
		tree1.root.left.left.left = new Node(4);
		tree1.root.left.left.right = new Node(12);
		tree1.root.left.right.left = new Node(18);
		tree1.root.left.right.right = new Node(24);
		tree1.root.right.left = new Node(35);
		tree1.root.right.right = new Node(70);
		tree1.root.right.left.left = new Node(31);
		tree1.root.right.left.right = new Node(44);
		tree1.root.right.right.left = new Node(66);
		tree1.root.right.right.right = new Node(90);
		
		System.out.println("");
		
		tree1.inorderRec(tree1.root);
	}
	
	
	
	@Test
	public void preorderRecTest() {
		BinaryTree tree = new BinaryTree(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.preorderRec(tree.root);
		
		BinaryTree tree1 = new BinaryTree(25);
		tree1.root.left = new Node(15);
		tree1.root.right = new Node(50);
		tree1.root.left.left = new Node(10);
		tree1.root.left.right = new Node(22);
		tree1.root.left.left.left = new Node(4);
		tree1.root.left.left.right = new Node(12);
		tree1.root.left.right.left = new Node(18);
		tree1.root.left.right.right = new Node(24);
		tree1.root.right.left = new Node(35);
		tree1.root.right.right = new Node(70);
		tree1.root.right.left.left = new Node(31);
		tree1.root.right.left.right = new Node(44);
		tree1.root.right.right.left = new Node(66);
		tree1.root.right.right.right = new Node(90);
		
		System.out.println("");
		
		tree1.preorderRec(tree1.root);
	}
	
	@Test
	public void postorderRecTest() {
		BinaryTree tree = new BinaryTree(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.postorderRec(tree.root);
		
		BinaryTree tree1 = new BinaryTree(25);
		tree1.root.left = new Node(15);
		tree1.root.right = new Node(50);
		tree1.root.left.left = new Node(10);
		tree1.root.left.right = new Node(22);
		tree1.root.left.left.left = new Node(4);
		tree1.root.left.left.right = new Node(12);
		tree1.root.left.right.left = new Node(18);
		tree1.root.left.right.right = new Node(24);
		tree1.root.right.left = new Node(35);
		tree1.root.right.right = new Node(70);
		tree1.root.right.left.left = new Node(31);
		tree1.root.right.left.right = new Node(44);
		tree1.root.right.right.left = new Node(66);
		tree1.root.right.right.right = new Node(90);
		
		System.out.println("");
		
		tree1.postorderRec(tree1.root);
	}
	
	@Test
	public void inorderTest() {
		BinaryTree tree = new BinaryTree(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.inorder();
		
		BinaryTree tree1 = new BinaryTree(25);
		tree1.root.left = new Node(15);
		tree1.root.right = new Node(50);
		tree1.root.left.left = new Node(10);
		tree1.root.left.right = new Node(22);
		tree1.root.left.left.left = new Node(4);
		tree1.root.left.left.right = new Node(12);
		tree1.root.left.right.left = new Node(18);
		tree1.root.left.right.right = new Node(24);
		tree1.root.right.left = new Node(35);
		tree1.root.right.right = new Node(70);
		tree1.root.right.left.left = new Node(31);
		tree1.root.right.left.right = new Node(44);
		tree1.root.right.right.left = new Node(66);
		tree1.root.right.right.right = new Node(90);
		
		System.out.println("");
		
		tree1.inorder();
	}
	
	@Test
	public void diameterTest() {
		BinaryTree tree = new BinaryTree(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.right.left = new Node(6);
		tree.root.left.right.right = new Node(7);
		tree.root.right.right = new Node(8);
		tree.root.right.right.right = new Node(9);
		tree.root.right.right.right.left = new Node(10);
		tree.root.right.right.right.right = new Node(11);
		tree.root.right.right.right.left.right = new Node(12);
		assertEquals(9, tree.diameterRec(tree.root));
		
		BinaryTree tree1 = new BinaryTree(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(5);
		tree1.root.left.left.left = new Node(6);
		tree1.root.left.left.right = new Node(7);
		tree1.root.left.left.right.left = new Node(8);
		tree1.root.left.left.right.left.right = new Node(9);
		tree1.root.left.right.right = new Node(10);
		tree1.root.left.right.right.left = new Node(11);
		tree1.root.left.right.right.right = new Node(12);
		tree1.root.left.right.right.right.left = new Node(13);
		assertEquals(9, tree1.diameterRec(tree1.root));
	}
}
