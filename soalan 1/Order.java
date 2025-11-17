import java.util.ArrayList;
import java.util.List;
import java.util.Date;
public class Order {

	private Date date;
	private String status;
	private Customer customer;
	private List<OrderDetail> orderDetails;

	Order(Date date, String status, Customer customer) {
		this.date = date;
		this.status = status;
		this.customer = customer;
		this.orderDetails = new ArrayList<>(); // initialize list
	}

	public void addOrderDetail(int quantity, String taxStatus, Item item) {
		OrderDetail detail = new OrderDetail(quantity, taxStatus, item);
		orderDetails.add(detail);
	}

	public double calcSubTotal() {
		double subTotal = 0;
		for (OrderDetail d : orderDetails) {
			subTotal += d.calcSubTotal();
		}
		return subTotal;
	}

	public double calcTax() {
		double tax = 0;
		for (OrderDetail d : orderDetails) {
			tax += d.calcTax();
		}
		return tax;
	}

	public double Total() {
		return this.calcSubTotal() + this.calcTax();
	}

	public double TotalWeight() {
		double totalWeight = 0;
		for (OrderDetail d : orderDetails) {
			totalWeight += d.calcWeight();
		}
		return totalWeight;
	}

	public void showResit() {
		System.out.println("\n============== RISIT ==============");
		System.out.println("Customer\t\t" + customer.getName());
		System.out.println("Address\t\t\t" + customer.getAddress());
		System.out.println("Date\t\t\t" + this.date);
		System.out.println("Status\t\t\t" + this.status);
		System.out.println("\n=========== Item Detail ===========");

		for (OrderDetail d : orderDetails) {
			d.show();
		}
		System.out.println("\n===================================");
		System.out.printf("Total Weight\t\t%.2f Kg", this.TotalWeight());
		System.out.printf("\nSubTotal\t\tRm %.2f", this.calcSubTotal());
		System.out.printf("\nTax\t\t\tRm %.2f", this.calcTax());
		System.out.printf("\nTotal\t\t\tRm %.2f", this.Total());
		System.out.println("\n=====================================");

		for (OrderDetail d : orderDetails) {
			d.tolakStok();
		}

	}

}
