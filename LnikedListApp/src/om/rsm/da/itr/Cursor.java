package om.rsm.da.itr;

import com.ds.nodes.SingleNode;

public class Cursor<T> {
	SingleNode<T> singleNodes;
	int i = 0;

	public Cursor(SingleNode<T> SingleNodes) {
		this.singleNodes = SingleNodes;
	}

	public boolean hasNext() {
		boolean flag = false;
		if (singleNodes == null) {
			return false;
		}
		if (singleNodes.getNext() != null) {
			flag = true;
			i = i + 1;
			if (i != 1) {
				singleNodes = singleNodes.getNext();

			}
		}
		return flag;
	}
	public T next() {
		return singleNodes.getData();
	}
}
