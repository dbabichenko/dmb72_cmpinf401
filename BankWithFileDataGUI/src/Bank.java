import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Bank {
	private String projectPath;
	private ArrayList<Account> accountList;
	private ArrayList<User> customerList;
	
	public Bank() {
		projectPath = getCurrentWorkingDirectory();
		loadAccounts();
		loadUsers();
		linkUserAccounts();
		
	}
	
	private void loadAccounts() {
		String dataPath = this.projectPath + "/data/accounts.csv";
		accountList = new ArrayList<Account>();
		// System.out.println(dataPath);
		try {
			FileReader fr = new FileReader(dataPath);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
	        while ((line = br.readLine()) != null) {
	        	// System.out.println(line);
	        	// Create accounts from the data
	        	String[] temp = line.split(",");
	        	if(temp.length == 4) {
	        		String accountNumber = temp[0];
	        		String accountType = temp[1];
	        		double balance = Double.parseDouble(temp[2]);
	        		double interestRate = Double.parseDouble(temp[3]);
	        		Account a = new Account(accountNumber, accountType, balance, interestRate);
	        		accountList.add(a);
	        	}
	        }
	        br.close();
	        fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void loadUsers() {
		customerList = new ArrayList<User>();
		String dataPath = this.projectPath + "/data/customers.csv";
		// System.out.println(dataPath);
		try {
			FileReader fr = new FileReader(dataPath);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
	        while ((line = br.readLine()) != null) {
	        	// System.out.println(line);
	        	// Create accounts from the data
	        	String[] temp = line.split(",");
	        	if(temp.length == 4) {
	        		String userID = temp[0];
	        		String ssn = temp[1];
	        		String firstName = temp[2];
	        		String lastName = temp[3];
	        		User u = new User(userID, ssn, firstName, lastName);
	        		customerList.add(u);
	        	}
	        }
	        br.close();
	        fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void linkUserAccounts() {
		String dataPath = this.projectPath + "/data/accountowners.csv";
		// System.out.println(dataPath);
		try {
			FileReader fr = new FileReader(dataPath);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
	        while ((line = br.readLine()) != null) {
	        	// System.out.println(line);
	        	// Create accounts from the data
	        	String[] temp = line.split(",");
	        	if(temp.length == 2) {
	        		String userID = temp[0];
	        		String accountID = temp[1];
	        		// System.out.println(userID);
	        		// System.out.println(accountID);
	        		
	        		User u = findCustomerByID(userID);
	        		Account a = findAccountByID(accountID);
	        		if(u != null && a!= null) {
		        		u.addAccount(a);
		        		a.addOwner(u);
	        		}
	        		
	        	}
	        }
	        br.close();
	        fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private String getCurrentWorkingDirectory() {
        String userDirectory = System.getProperty("user.dir");
        return userDirectory;
    }
	
	public ArrayList<Account> getAccounts() {
		return this.accountList;
	}
	
	public ArrayList<User> getCustomers(){
		return this.customerList;
	}
	
	public Account findAccountByID(String accountID) {
		for(Account a : this.accountList) {
			// System.out.println("Get account: " + a.getAccountNumber());
			if(a.getAccountNumber().equalsIgnoreCase(accountID)) {
				return a;
			}
		}
		return null;
	}
	
	public User findCustomerByID(String userID) {
		for(User u : this.customerList) {
			if(u.getUserID().equalsIgnoreCase(userID)) {
				return u;
			}
		}
		return null;
	}
}
