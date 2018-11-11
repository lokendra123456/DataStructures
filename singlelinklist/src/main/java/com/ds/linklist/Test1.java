package com.ds.linklist;

public class Test1 {
	public static void main(String[] args) {
		SingleLinkList<Integer> sl = new SingleLinkList<Integer>();
		sl.add(10);
		sl.add(20);
		sl.add(30);
		sl.addBefore(60);
		sl.add(90);
		sl.add(0, 66);
		System.out.println(sl.size());
		System.out.println(sl);
		sl.removeAt(1);
		System.out.println(sl);

	}
}
