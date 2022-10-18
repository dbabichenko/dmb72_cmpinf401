
public class Node {
	// reference to the next node in the chain, or null if there isn't one.
	Node next;
	
	// data carried by this node. could be of any type you need.
	Object data;
	
	// Node constructor
	public Node(Object dataValue) {
		next = null;
		data = dataValue;
	}
	
	// another Node constructor if we want to specify the node to point to.
	public Node(Object dataValue, Node nextValue) {
		next = nextValue;
		data = dataValue;
	}
	
	// Getter for the data associated with a node
	public Object getData() {
		return data;
	}

	// Setter for the data associated with a node
	public void setData(Object dataValue) {
		data = dataValue;
	}

	// Getter for the pointer (link) to the next node in the list
	public Node getNext() {
		return next;
	}

	// Setter for the pointer (link) to the next node in the list
	public void setNext(Node nextValue) {
		next = nextValue;
	}
}