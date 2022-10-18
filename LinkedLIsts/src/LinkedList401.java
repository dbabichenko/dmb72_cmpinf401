
public class LinkedList401 {
	private static int counter;
	private Node head;

	// Default constructor
	public LinkedList401() {
	}

	// appends the specified element to the end of this list.
	public void add(Object data) {
		// Initialize Node only in case of 1st element
		if (head == null) {
			head = new Node(data);
		}
		
		Node temp = new Node(data);
		Node current = head;
		
		// Let's check for NullPointerException (NPE) before iterate over current
		if (current != null) {
			// starting at the head node, crawl to the end of the list and then add element after last node
			while (current.getNext() != null) {
				current = current.getNext();
			}
			
			// the last node's "next" reference set to our new node
			current.setNext(temp);
		}
		// increment the number of elements variable
		incrementCounter();
	}
	
	private static int getCounter() {
		return counter;
	}
	
	private static void incrementCounter() {
		counter++;
	}
	
	private void decrementCounter() {
		counter--;
	}
	
	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		Node temp = new Node(data);
		Node current = head;
		// Let's check for NullPointerException (NPE) before iterate over crunchifyCurrent
		if (current != null) {
			// crawl to the requested index or the last element in the list, whichever comes first
			for (int i = 0; i < index && current.getNext() != null; i++) {
				current = current.getNext();
			}
		}
		// set the new node's next-node reference to this node's next-node reference
		temp.setNext(current.getNext());
		
		// now set this node's next-node reference to the new node
		current.setNext(temp);
		
		// increment the number of elements variable
		incrementCounter();
	}
	public Object get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index < 0)
			return null;
		Node current = null;
		if (head != null) {
			current = head.getNext();
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return null;
				current = current.getNext();
			}
			return current.getData();
		}
		return current;
	}
	
	// removes the element at the specified position in this list.
	public boolean remove(int index) {
		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;
		Node current = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return false;
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
			// decrement the number of elements variable
			decrementCounter();
			return true;
		}
		return false;
	}
	// returns the number of elements in this list.
	public int size() {
		return getCounter();
	}
	
	public String getLinkedListAsString() {
		String output = "";
		if (head != null) {
			Node current = head.getNext();
			while (current != null) {
				output += "[" + current.getData().toString() + "]";
				current = current.getNext();
			}
		}
		return output;
	}

}
