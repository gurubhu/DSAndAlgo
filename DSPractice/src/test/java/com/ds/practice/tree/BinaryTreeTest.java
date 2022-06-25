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
	}
}
