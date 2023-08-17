public class Product {
	private String id;
	private String name;
	private String seller;

	// Static variable for generating unique ID
	private static long idCounter = 0;

	// Synchronized method to generate unique ID
	public static synchronized String createID() {
		return String.valueOf(idCounter++);
	}

	// Parametrized Constructor
	public Product(String name, String seller) {
		this.id = createID();
		this.name = name;
		this.seller = seller;
	}

	public String toString() {
		return "Product ID: " + id + "\nName: " + name + "\nSeller: " + seller;
	}
}
