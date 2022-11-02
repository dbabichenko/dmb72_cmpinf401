import java.util.UUID;

/**
 * This class manages individual bank users / account owners
 * @author dbabichenko
 *
 */
public class User {
	private String userID;
	private String ssn;
	private String firstName;
	private String lastName;
	private Account[] accounts;
	
	/**
	 * This constructor creates a new user based on user-provided parameters:
	 * social security number, first name, and last name
	 * @param ssn User's social security number
	 * @param firstName User's first name
	 * @param lastName User's last name
	 */
	public User(String ssn, String firstName, String lastName) {
		this.userID = UUID.randomUUID().toString(); //Generates random UUID
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accounts = new Account[5]; // Users can own up to five accounts
	}

	/**
	 * Getter for user's first name
	 * @return User's first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter for user's first name
	 * @param firstName User's first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter for user's last name
	 * @return User's last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter for user's last name
	 * @param lastName User's last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/** 
	 * Getter for User ID
	 * @return User's unique identifier (User ID)
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * Getter for User's social security number
	 * @return User's social security number
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * Associate an account with user
	 * @param account An object of type Account, associates an account with a user.
	 */
	public void addAccount(Account account) {
		for(int i = 0; i<this.accounts.length; i++) {
			// Check each element of the array 
			// If it is not null, add account to that position
			if(this.accounts[i] != null) {
				this.accounts[i] = account;
				break; // Once you added an account, exit the loop
			}
		}
	}
	
	/**
	 * Getter for account list.  Returns a list of accounts owned by user
	 * @return An array of accounts owned by user
	 */
	public Account[] getAccounts() {
		return this.accounts;
	}
	
	
}
