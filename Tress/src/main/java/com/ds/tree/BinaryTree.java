package com.ds.tree;

import com.tree.node.Node;

public class BinaryTree<T extends Comparable<T>> {
	private Node<T> root;
	private int size;

	public BinaryTree(T data) {
		root = new Node<T>(data);
	}

	public BinaryTree() {
		root = null;
	}

	public void add(T data) {
		insertNode(root, data);
	}

	public void insertNode(Node<T> root, T data) {
		if (root == null) {
			this.root = new Node<T>(data);
		} else if (data.compareTo(root.getData()) <= 0) {
			if (root.getLeft() == null) {
				root.setLeft(new Node<T>(data));
			} else {
				insertNode(root.getLeft(), data);
			}
		} else {
			if (root.getWright() == null) {
				root.setWright(new Node<T>(data));
			} else {
				insertNode(root.getWright(), data);
			}
		}
	}

	public void clear() {
		root = null;
	}

	public boolean isEmpty() {
		return null == root;
	}

	public int size() {
		return size;
	}

}
