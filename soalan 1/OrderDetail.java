public class OrderDetail {
	private int quantity;
	private String taxStatus;
	private Item item;

	OrderDetail(int quantity, String taxStatus, Item item) {
		this.quantity = quantity;
		this.taxStatus = taxStatus;
		this.item = item;
	}

	public double calcSubTotal() {
		if (item.inStock(this.quantity)) {
			return item.getPriceForQuantity(quantity);
		} else {
			return 0;
		}
	}

	public double calcWeight() {
		if (item.inStock(this.quantity)) {
			return item.getShippingWeight() * this.quantity;
		} else {
			return 0;
		}
	}

	public double calcTax() {
		if (item.inStock(this.quantity)) {
			if ("true".equals(this.taxStatus)) {
				return item.getTex(this.calcSubTotal());
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}

	public void tolakStok() {
		if (item.inStock(quantity)) {
			item.setStok(quantity);
		}
	}

	public void show() {
		if (item.inStock(this.quantity)) {
			System.out.println("\nName\t\t\t" + item.getDescription());
			System.out.printf("Total weight item \t%.2f Kg", this.calcWeight());
			System.out.println("\nQuantity\t\t" + this.quantity);
			System.out.println("TaxStatus\t\t" + this.taxStatus);
			System.out.printf("Total tax (1 persen) \tRm %.2f", this.calcTax());
			System.out.printf("\nSubTotal Item \t\tRm %.2f\n", this.calcSubTotal());
			// item.setStok(quantity);
		} else {
			System.out.println("\nSorry " + item.getDescription() + " Tidak Ada Stok");
		}
	}

}
