package com.ds.linklist;

import com.ds.nodes.DoubleNode;

public class DoublyLinkList<T> {
	private int size;
	private DoubleNode<T> first;
	private DoubleNode<T> last;

	public DoublyLinkList() {
	}

	public void add(T data) {
		linkLast(data);
	}

	public void linkLast(T data) {
		final DoubleNode<T> l = last;
		DoubleNode<T> newNode = new DoubleNode<T>(l, data, null);
		last = newNode;
		if (l == null) {
			first = newNode;
		} else {
			l.setNext(newNode);
		}
		size++;
	}

	public void linkFirst(T data) {
		final DoubleNode<T> f = first;
		DoubleNode<T> newNode = new DoubleNode<T>(null, data, f);
		first = newNode;
		if (f == null) {
			first = newNode;
		} else {
			first.setPrev(newNode);
		}
		size++;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (first == null) {
			return "[]";
		} else {
			sb.append("[");
			DoubleNode<T> retNodes = first;
			while (retNodes.getNext() != null) {
				sb.append(retNodes.getData() + ",");
				retNodes = retNodes.getNext();
			}
			sb.append(retNodes.getData());
			sb.append("]");
		}
		return sb.toString();
	}

	public int size() {
		return size;
	}

	public void reverse() {
		if (first == null || size < 2) {
			return;
		}
		DoubleNode<T> f = first;
		while (f.getNext() != null) {
			DoubleNode<T> temp = f.getNext();
			f.setNext(f.getPrev());
			f.setPrev(temp);
			f = temp;
		}
		f.setNext(f.getPrev());
		f.setPrev(null);

		first = f;
	}

	public static void main(String[] args) {
		DoublyLinkList<Integer> doublyLinkList = new DoublyLinkList<Integer>();
		doublyLinkList.add(10);
		doublyLinkList.add(20);
		doublyLinkList.add(30);
		doublyLinkList.add(40);
		doublyLinkList.add(50);
		System.out.println(doublyLinkList);
		doublyLinkList.reverse();
		System.out.println(doublyLinkList);
	}
}
