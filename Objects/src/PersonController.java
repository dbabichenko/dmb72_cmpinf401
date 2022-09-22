
public class PersonController {

	public static void main(String[] args) {
		Person p = new Person();
		// p.ssn = "111-11-1111";
		
		// ssn = "111-11-2222";
		System.out.println(p.getSsn());

		System.out.println(p.getFirstName());
		p.setFirstName("Bob");
		System.out.println(p.getFirstName());
	}

}
