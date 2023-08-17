import java.util.Scanner;

// Inheritance Customer class for Account
public class Customer extends Account {
	private Address address;
	private Phone phone;
	private String email;

	// Constructor
	public Customer() {
		super();
		this.address = new Address();
		this.phone = new Phone();
		this.email = "";
	}

	// Parameterized constructor
	public Customer(Address custAddress, Phone custPhone, String custEmail) {
		super();
		this.address = custAddress;
		this.phone = custPhone;
		this.email = custEmail;
	}

	// Parametrized constructor for web users
	public Customer(String custWebID, Phone custPhone, String custEmail, Address custAddress) {
		super(custWebID, custAddress);
		this.phone = custPhone;
		this.email = custEmail;
	}
	
	// Email accessor/getter
	public String getEmail() {
		return this.email;
	}
	
	// Email mutator/setter
	public void setEmail(String custEmail) {
		this.email = custEmail;
	}

	// Phone accessor/getter
	public Phone getPhone() {
		return this.phone;
	}

	// Phone mutator/setter
	public void setPhone(Phone custPhone) {
		this.phone = custPhone;
	}

	// Web User Method
	public WebUser webUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a username: ");
		String user = scan.nextLine();
		System.out.println("Enter a password: ");
		String password = scan.nextLine();
		scan.close();
		this.setId(user);
		return new WebUser(user, password);
	}

	// toString print method for customers information
	public String toString() {
		return "Customer " + getId() + "\nAddress: " + address + "\nPhone #: " + phone + "\nEmail: " + email + ")";
	}
}