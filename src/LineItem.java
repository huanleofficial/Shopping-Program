public class LineItem {
	private int quantity;
	private double price;
	private Product product;

	// Parametrized constructor
	public LineItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	// Price accessor/getter
	public double getPrice() {
		return this.price;
	}

	// Quantity accessor/getter
	public int getQuantity() {
		return this.quantity;
	}

	// Total price for product and its quantity
	public double getTotalPrice() {
		return this.price * this.quantity;
	}
	
	// toString print method for LineItem
	public String toString() {
		return "Product: " + product.toString() + "\nQuantity: " + quantity + "\nPrice: " + price + "\nTotal: "
				+ getTotalPrice();
	}
}