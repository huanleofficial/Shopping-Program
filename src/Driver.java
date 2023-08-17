import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		blackBoxTest();
		whiteBoxTest();
	}

	public static void blackBoxTest() {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Black Box Testing");

		System.out.println("Enter Address: ");
		String address = Scan.nextLine();
		System.out.println("Enter City: ");
		String city = Scan.nextLine();
		System.out.println("Enter State: ");
		String state = Scan.nextLine();
		System.out.println("Enter Zip Code: ");
		String zip = Scan.nextLine();

		Address address1 = new Address(address, city, state, zip);

		System.out.println("Enter ID: ");
		String id = Scan.nextLine();

		Account userAccount1 = new Account(id, address1);
		userAccount1.setBillingAddress(address1);

		System.out.println("Enter Item Name: ");
		String itemName = Scan.nextLine();
		System.out.println("Enter Item Seller: ");
		String seller = Scan.nextLine();

		Product product = new Product(itemName, seller);
		System.out.println("Enter Price: ");
		double price = Scan.nextDouble();
		System.out.println("Enter Item Quantity: ");
		int quantity = Scan.nextInt();

		LineItem lineitem = new LineItem(quantity, price, product);

		ShoppingCart cart = new ShoppingCart();
		cart.addLineItem(lineitem);

		Order order = new Order();
		order.cartToOrder(userAccount1);
		order.setHold();

		WebUser web = new WebUser();
		System.out.println("Enter Web ID: ");
		String webid = Scan.nextLine();
		String line = Scan.nextLine();
		System.out.println("Enter Password: ");
		String password = Scan.nextLine();

		System.out.println("Enter Phone Number: ");
		String phoneNumber = Scan.nextLine();
		web.setPassword(password);
		web.setId(webid);
		web.setId(line);
		Phone phone = new Phone(phoneNumber);
		System.out.println("Enter Email: ");
		String email = Scan.nextLine();
		Customer customer = new Customer(webid, phone, email, address1);
	}

	public static void whiteBoxTest() {
		System.out.println("\nWhite Box Testing\n");
		Scanner Scan = new Scanner(System.in);

		System.out.println("Enter Address: ");
		String address = Scan.nextLine();
		System.out.println("Enter City: ");
		String city = Scan.nextLine();
		System.out.println("Enter State: ");
		String state = Scan.nextLine();
		System.out.println("Enter Zip Code: ");
		String zip = Scan.nextLine();

		Address address1 = new Address(address, city, state, zip);
		System.out.println("Address: " + address1.toString());
		System.out.println("Enter ID: ");
		String id = Scan.nextLine();

		Account userAccount1 = new Account(id, address1);
		userAccount1.setBillingAddress(address1);
		System.out.println("User ID: " + userAccount1.getId());

		System.out.println("Enter Item Name: ");
		String itemName = Scan.nextLine();
		System.out.println("Enter Item Seller: ");
		String seller = Scan.nextLine();

		Product product = new Product(itemName, seller);
		System.out.println("Enter Price: ");
		double price = Scan.nextDouble();
		System.out.println("Enter Item Quantity: ");
		int quantity = Scan.nextInt();
		System.out.println(product.toString());

		LineItem lineitem = new LineItem(quantity, price, product);
		System.out.println("Line item total price: " + lineitem.getTotalPrice());
		ShoppingCart cart = new ShoppingCart();
		cart.addLineItem(lineitem);

		Order order = new Order();
		order.cartToOrder(userAccount1);
		order.setHold();

		WebUser web = new WebUser();
		System.out.println("Enter Web ID: ");
		String webidd = Scan.nextLine();
		String webid = Scan.nextLine();
		web.setId(webidd);
		System.out.println("Enter Password: ");
		String password = Scan.nextLine();
		web.setPassword(password);
		System.out.println("Enter Phone Number: ");
		String phoneNumber = Scan.nextLine();
		web.setPassword(password);
		web.setId(id);
		Phone phone = new Phone(phoneNumber);
		System.out.println(phone.toString());
		System.out.println("Enter Email: ");
		String email = Scan.nextLine();
		System.out.println();
		Customer customer = new Customer(id, phone, email, address1);
		System.out.println("Customer email: " + customer.getEmail());
		System.out.println("Customer ID: " + customer.getId());
		System.out.println("Customer billing address: " + customer.getBillingAddress());
		System.out.println("Customer phone: " + customer.getPhone());

		userAccount1.getCart();
		userAccount1.createOrder();
		userAccount1.getCart();
		userAccount1.getOrders();
		userAccount1.getOrderSize();
		userAccount1.closeAcc();
	}
}