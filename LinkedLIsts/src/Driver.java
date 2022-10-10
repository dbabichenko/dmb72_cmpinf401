
public class Driver {

	public static void main(String[] args) {
		ValueOrReference x = new ValueOrReference();
		// x.byValue(10);
		
		// x.byReference(new Node("Hello"));
		
		
		Node n = new Node("hello world");
		System.out.println(n);
		Node n1 = n;
		System.out.println(n1);
		Node n2 = n;
		System.out.println(n2);

	}

}
