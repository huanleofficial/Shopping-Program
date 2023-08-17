import java.util.Date;

public class Order {
	private String number;
	private Date ordered;
	private Date shipped;
	private Address shipAddress;
	private OrderStatus status;
	private double total;

	private LineItem[] lineItems;
	private int orderSize;
	private Payment[] payment;
	private int paymentSize;

	// Static variable to generate customer unique ID
	private static long idCounter = 0;

	// Synchronized method to generate unique ID
	public static synchronized String createID() {
		return String.valueOf(idCounter++);
	}

	// Constructor
	public Order() {
		this.number = createID();
		this.ordered = new Date();
		this.status = OrderStatus.New;
		this.orderSize = 0;
		this.lineItems = new LineItem[100];
		this.payment = new Payment[100];
	}

	// Method to add item to LineItem
	public void addLineItem(LineItem item) {
		lineItems[orderSize] = item;
		orderSize++;
		total += item.getTotalPrice();
	}

	// Method to add Payments for order
	public void addPayment(Payment pay) {
		payment[paymentSize] = pay;
		paymentSize++;
	}

	// Method to add items from cart to order
	public void cartToOrder(Account account) {
		ShoppingCart cart = account.getCart();
		shipAddress = account.getBillingAddress();
		for (int index = 0; index < cart.getSize(); index++) {
			addLineItem(cart.getLineItems()[index]);
		}
		cart.emptyCart();
	}

	// Order status closed mutator/setter
	public void setClosed() {
		this.status = OrderStatus.Closed;
	}

	// Order status delivered mutator/setter
	public void setDelivered() {
		this.status = OrderStatus.Delivered;
	}

	// Order status hold mutator/setter
	public void setHold() {
		this.status = OrderStatus.Hold;
	}

	// Order status shipped mutator/setter
	public void setShipped() {
		this.status = OrderStatus.Shipped;
	}

	// Number accessor/getter
	public String getNumber() {
		return this.number;
	}

	// Order status accessor/getter
	public OrderStatus getStatus() {
		return this.status;
	}

}
