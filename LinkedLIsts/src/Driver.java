
public class Driver {

	public static void main(String[] args) {
		LinkedList401 ll = new LinkedList401();
		
		ll.add("cat");
		ll.add("dog");
		ll.add("cow");
		ll.add("hamster", 1);
		
		System.out.println(ll.getLinkedListAsString());

	}

}
