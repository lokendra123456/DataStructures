package com.ds.linklist;

import com.ds.nodes.SingleNode;

import om.rsm.da.itr.Cursor;

public class SingleLinkList<T> {
	int size;
	SingleNode<T> nodes;

	public int size() {
		return size;
	}

	public void addLast(T data) {
		SingleNode<T> newNode = new SingleNode<T>(data, null);
		if (nodes == null) {
			nodes = newNode;
		} else {
			SingleNode<T> existingNodes = nodes;
			while (existingNodes.getNext() != null) {
				existingNodes = existingNodes.getNext();
			}
			existingNodes.setNext(newNode);
		}
		size++;
	}

	public void add(T data) {
		addLast(data);
	}

	public void add(int index, T data) {
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException();
		if (index == size)
			addLast(data);
		SingleNode<T> singleNode = nodes;
		for (int i = 0; i < index; i++) {
			singleNode = singleNode.getNext();
		}
		singleNode.setNext(new SingleNode<T>(data, singleNode.getNext()));
		size++;
	}

	public void addFirst(T data) {
		SingleNode<T> newNode = new SingleNode<T>(data, nodes);
		nodes = newNode;
		size++;
	}

	public void delete(T data) {
		SingleNode<T> existingNodes = nodes;
		// Delete for firtNode
		if (existingNodes != null && existingNodes.getData().equals(data)) {
			nodes = existingNodes.getNext();
			size--;
		} else {
			while (existingNodes != null
					&& (existingNodes.getNext() != null && !existingNodes.getNext().getData().equals(data))) {
				existingNodes = existingNodes.getNext();
			}
			if (existingNodes.getNext() != null) {
				existingNodes.setNext(existingNodes.getNext().getNext());
				size--;
			}

		}
	}

	public T get(int index) {
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException();
		SingleNode<T> retNodes = nodes;
		for (int i = 0; i < index; i++) {
			retNodes = retNodes.getNext();
		}
		return retNodes.getData();
	}

	public void removeDuplicates() {
		SingleNode<T> curNodes = nodes;
		while (curNodes != null) {
			SingleNode<T> runNode = curNodes;
			while (runNode.getNext() != null) {
				if (runNode.getNext().getData().equals(curNodes.getData())) {
					runNode.setNext(runNode.getNext().getNext());
					size--;
				} else {
					runNode = runNode.getNext();
				}
			}
			curNodes = curNodes.getNext();
		}
	}

	public void reverse() {
		SingleNode<T> curNodes = nodes;
		SingleNode<T> revNodes = null;
		while (curNodes != null) {
			if (revNodes == null) {
				revNodes = new SingleNode<T>(curNodes.getData(), null);
			} else {
				revNodes = new SingleNode<T>(curNodes.getData(), revNodes);
			}
			curNodes = curNodes.getNext();
		}
		nodes = revNodes;
	}

	public Cursor<T> getCursor() {
		Cursor<T> c = new Cursor<T>(nodes);
		return c;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (nodes == null) {
			return "[]";
		} else {
			sb.append("[");
			SingleNode<T> retNodes = nodes;
			while (retNodes.getNext() != null) {
				sb.append(retNodes.getData() + ",");
				retNodes = retNodes.getNext();
			}
			sb.append(retNodes.getData());
			sb.append("]");

		}
		return sb.toString();
	}

	public void clear() {
		nodes = null;
	}
}
