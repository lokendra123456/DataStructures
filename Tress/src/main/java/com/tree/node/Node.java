package com.tree.node;

public class Node<T extends Comparable<T>> {
	private Node<T> left;
	private T data;
	private Node<T> wright;

	public Node(Node<T> left, T data, Node<T> wright) {
		this.left = left;
		this.data = data;
		this.wright = wright;
	}

	public Node() {

	}
	public Node(T data) {
		this.data = data;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getWright() {
		return wright;
	}

	public void setWright(Node<T> wright) {
		this.wright = wright;
	}

}
