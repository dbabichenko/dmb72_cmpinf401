import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		Superclass a = new Subclass();
		
		ArrayList<Superclass> al = new ArrayList<Superclass>();
		Subclass b = new Subclass();
		al.add(b);
	}
}
