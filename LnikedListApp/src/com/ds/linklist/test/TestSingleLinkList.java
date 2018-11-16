package com.ds.linklist.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ds.linklist.SingleLinkList;

public class TestSingleLinkList {

	private static SingleLinkList<Integer> sLinkList;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sLinkList = new SingleLinkList<Integer>();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		sLinkList = null;
	}

	@Before
	public void setUp() throws Exception {
		sLinkList.add(10);
		sLinkList.add(30);
		sLinkList.add(40);
		sLinkList.add(90);
	}

	@After
	public void tearDown() throws Exception {
		sLinkList.clear();
	}

	@Test
	public void testAddFirst() {
		sLinkList.addFirst(90);
		int actual = sLinkList.get(0);
		assertThat("For Testing",actual, is(new Integer(90)));
	}

}
