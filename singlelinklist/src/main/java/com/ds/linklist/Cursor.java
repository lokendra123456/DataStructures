package com.ds.linklist;

public class Cursor<T> {
	Node<T> nodes;
    int i=0;
	public Cursor(Node<T> nodes) {
		this.nodes = nodes;
	}
	public boolean hasNext() {
		boolean flag = false;
		if(nodes==null) {
			return false;
		}
		if (nodes.next != null) {
			flag = true;
			i=i+1;
			if(i!=1) {
				nodes = nodes.next;
				
			}
		}
		return flag;
	}
	public T next() {
		return nodes.data;
	}

}
