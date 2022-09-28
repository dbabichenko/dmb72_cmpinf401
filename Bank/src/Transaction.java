import java.util.UUID;

public class Transaction {
	private String transactionID;
	private String transactionType;
	private double amount;
	private String originAccountNumber;
	private String destinationAccountNumber;
	
	public Transaction(String transactionType, double amount, String originAccountNumber) {
		this.transactionID = UUID.randomUUID().toString(); //Generates random UUID
		this.transactionType = transactionType;
		this.amount = amount;
		this.originAccountNumber = originAccountNumber;
	}
	
	public Transaction(String transactionType, double amount, String originAccountNumber, String destinationAccountNumber) {
		this.transactionID = UUID.randomUUID().toString(); //Generates random UUID
		this.transactionType = transactionType;
		this.amount = amount;
		this.originAccountNumber = originAccountNumber;
		this.destinationAccountNumber = destinationAccountNumber;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public String getOriginAccountNumber() {
		return originAccountNumber;
	}

	public String getDestinationAccountNumber() {
		return destinationAccountNumber;
	}
	
	
}
