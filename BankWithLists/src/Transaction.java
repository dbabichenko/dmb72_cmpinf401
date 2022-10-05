import java.util.UUID;
/**
 * This class stores data about each transaction.  Transactions can be
 * deposits, withdrawals, or transfers.  For transfer transactions, this class
 * must be instantiated with both origin and target account numbers
 * @author dbabichenko
 *
 */
public class Transaction {
	private String transactionID;
	private String transactionType;
	private double amount;
	private String originAccountNumber;
	private String destinationAccountNumber;
	
	/**
	 * This constructor creates a transaction for a deposit or a withdrawal.
	 * @param transactionType Transaction type - deposit or withdrawal
	 * @param amount Transaction amount
	 * @param originAccountNumber Account number associated with the transaction
	 */
	public Transaction(String transactionType, double amount, String originAccountNumber) {
		this.transactionID = UUID.randomUUID().toString(); //Generates random UUID
		this.transactionType = transactionType;
		this.amount = amount;
		this.originAccountNumber = originAccountNumber;
	}
	
	/**
	 * This constructor creates a transaction for a deposit or a withdrawal.
	 * @param transactionType Transaction type - transfer
	 * @param amount Transaction amount
	 * @param originAccountNumber Account number associated with the origin account
	 * @param destinationAccountNumber Account number associated with the destination account
	 */
	public Transaction(String transactionType, double amount, String originAccountNumber, String destinationAccountNumber) {
		this.transactionID = UUID.randomUUID().toString(); //Generates random UUID
		this.transactionType = transactionType;
		this.amount = amount;
		this.originAccountNumber = originAccountNumber;
		this.destinationAccountNumber = destinationAccountNumber;
	}

	/**
	 * Getter for transaction ID
	 * @return Transaction unique identifier (transaction ID)
	 */
	public String getTransactionID() {
		return transactionID;
	}

	/**
	 * Getter for transaction type (deposit, withdrawal, transfer)
	 * @return Transaction type
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * Getter for transaction amount
	 * @return Transaction amount
	 */
	public double getTransactionAmount() {
		return amount;
	}

	/** 
	 * Getter for origin account ID
	 * @return Origin account ID
	 */
	public String getOriginAccountNumber() {
		return originAccountNumber;
	}

	/**
	 * Getter for destination account ID
	 * @return Destination account ID (for transfer transactions only)
	 */
	public String getDestinationAccountNumber() {
		return destinationAccountNumber;
	}
	
	
}
