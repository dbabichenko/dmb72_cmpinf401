
public class Node {
	// reference to the next node in the chain,
		// or null if there isn't one.
		Node next;
		// data carried by this node, could be of any type you need.
		Object data;

		// Node constructor
		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}

		// Node constructor if we want to specify the node to point to.
		public Node(Object dataValue, Node nextValue) {
			next = nextValue;
			data = dataValue;
		}

}
