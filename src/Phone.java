public class Phone {
	private String number;

	// Constructor
	public Phone() {
		this.number = "";
	}

	// Parametrized Constructor
	public Phone(String number) {
		this.number = number;
	}

	// toString print method for user phone numbers
	public String toString() {
		return "Phone #: " + number;
	}
}