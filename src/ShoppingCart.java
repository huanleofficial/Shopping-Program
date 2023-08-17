
import java.util.Date;

// Shopping cart class owns by account
public class ShoppingCart {
	private Date created;
	private int cartSize;
	private LineItem[] lineItems;

	// Constructor
	public ShoppingCart() {
		this.created = new Date();
		this.lineItems = new LineItem[100];
		this.cartSize = 0;
	}

	// Method to add item into LineItem
	public void addLineItem(LineItem item) {
		this.lineItems[cartSize] = item;
		this.cartSize++;
	}

	// Method to empty cart
	public void emptyCart() {
		this.cartSize = 0;
		this.lineItems = new LineItem[100];
	}

	// LineItems accessor/getter
	public LineItem[] getLineItems() {
		return this.lineItems;
	}

	// Cart size accessor/getter
	public int getSize() {
		return this.cartSize;
	}
}