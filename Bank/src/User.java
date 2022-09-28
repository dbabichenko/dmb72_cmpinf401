import java.util.UUID;

public class User {
	private String userID;
	private String ssn;
	private String firstName;
	private String lastName;
	private Account account;
	
	public User(String ssn, String firstName, String lastName) {
		this.userID = UUID.randomUUID().toString(); //Generates random UUID
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserID() {
		return userID;
	}

	public String getSsn() {
		return ssn;
	}

	public void addAccount(Account account) {
		this.account = account;
	}
	
	
}
