import java.util.Date;

public class Account {
	private String id;
	private Address billingAddress;
	private boolean accClosed;
	private Date open;
	private Date closed;

	private ShoppingCart cart;
	private Order[] orders;
	private int orderSize = 0;

	// Static variable to get customer unique ID
	private static long idCounter = 0;

	public static synchronized String createID() {
		return String.valueOf(idCounter++);
	}

	// Constructor
	public Account() {
		this.id = createID();
		this.billingAddress = new Address();
		this.accClosed = false;
		this.open = new Date();
		this.cart = new ShoppingCart();
		this.orders = new Order[10];
	}

	// Parameterized constructor
	public Account(String custWebID, Address custBillingAddress) {
		this.id = custWebID;
		this.billingAddress = custBillingAddress;
		this.accClosed = false;
		this.open = new Date();
		this.cart = new ShoppingCart();
		this.orders = new Order[10];
	}

	// Order create method
	public Order createOrder() {
		// Instantiating new order
		Order order = new Order();
		order.cartToOrder(this);
		orders[orderSize] = order;
		orderSize++;
		return order;
	}

	// Method to close customer account
	public void closeAcc() {
		closed = new Date();
		accClosed = true;
	}

	// ID accessor/getter
	public String getId() {
		return this.id;
	}

	// ID mutator/setter
	public void setId(String custID) {
		this.id = custID;
	}

	// Billing address accessor/getter
	public Address getBillingAddress() {
		return this.billingAddress;
	}

	// Billing address mutator/setter
	public void setBillingAddress(Address custBillingAddress) {
		this.billingAddress = custBillingAddress;
	}

	// Shopping cart accessor/getter
	public ShoppingCart getCart() {
		return this.cart;
	}

	// Order accessor/getter
	public Order[] getOrders() {
		return this.orders;
	}

	// Order Size accessor/getter
	public int getOrderSize() {
		return this.orderSize;
	}

	// toString print function for user accounts
	public String toString() {
		return "\nAccount ID: " + id + "\nAddress: " + billingAddress + "\nOrder Size: " + orderSize
				+ "\nAccount Open Date: " + open + "\nAccount Close Date: " + closed + "\n---------";
	}
}
