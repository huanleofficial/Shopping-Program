import java.util.Date;

public class Payment {
	private String id;
	private Date paid;
	private double total;
	private String info;
	private Account account;

	// Static variable to generate customer unique ID
	private static long idCounter = 0;

	// Synchronized method to generate customer unique ID
	public static synchronized String createID() {
		return String.valueOf(idCounter++);
	}

	// Parametrized constructor
	public Payment(double total, String information, Account account) {
		this.id = createID();
		this.paid = new Date();
		this.total = total;
		this.info = information;
		this.account = account;
	}

	// toString print function for user payment information
	public String toString() {
		return "Account: " + account.toString() + "\nPayment ID: " + id + "\nPaid: " + paid + "\nTotal: " + total
				+ "\nAccount info: " + info;
	}
}