package com.ds.linklist;

public class Node<T> {
	T data;
	Node<T> next;

	public Node() {
	}

	public Node(T date, Node<T> next) {
		this.data = date;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

}
