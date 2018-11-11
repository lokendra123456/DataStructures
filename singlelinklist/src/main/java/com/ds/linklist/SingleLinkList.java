package com.ds.linklist;

public class SingleLinkList<T> {
	private transient int size;
	private transient Node<T> head;

	public SingleLinkList() {

	}

	public void add(T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		newNode.next = null;
		if (head == null) {
			head = newNode;
			size++;
			return;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			size++;
		}
	}

	public Cursor<T> getCursor() {
		Cursor<T> cursor = new Cursor<>(head);
		return cursor;
	}

	public void addBefore(T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void add(int index, T data) {
		Node<T> node = new Node<>();
		node.data = data;
		node.next = null;
		Node<T> n = head;
		if (index == 0) {
			node.next = n;
			head = node;
		} else {

			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
			head = n;
		}
		size++;
	}

	public void removeAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node<T> n = head;
			Node<T> n1=null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1=n.next;
			n.next=n1.next;
		}
	}
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		if (size == 0) {
			return stringBuilder.append("[]").toString();
		} else {
			Node<T> n = head;
			stringBuilder.append("[");
			while (n.next != null) {
				stringBuilder.append(n.data + ",");
				n = n.next;
			}
			stringBuilder.append(n.data);
			stringBuilder.append("]");
		}
		return stringBuilder.toString();
	}

	public int size() {
		return size;
	}

}
