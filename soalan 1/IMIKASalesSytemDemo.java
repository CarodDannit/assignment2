import java.util.Date;

class IMIKASalesSytemDemo {
	public static void main(String[] args) {

		Item Victus = new Item(2.5, "HP Victus 16", 3000, 1);
		Item Omen = new Item(3.5, "HP Omen", 4000, 1);
		Item ROG = new Item(5, "Asus ROG ", 5000, 2);

		Customer abu = new Customer("Abu", "25, JALAN LOOREM 5");
		Order order1 = new Order(new Date(), "Pending", abu);

		order1.addOrderDetail(2, "true", Victus);
		order1.addOrderDetail(1, "true", Omen);
		order1.addOrderDetail(1, "true", ROG);
		order1.showResit();

		// Order order2 = new Order(new Date(), "Payment", abu);
		// order2.addOrderDetail(1, "false", ROG);
		// order2.showResit();

		// Victus.showItemDetail();
		// Omen.showItemDetail();
		// ROG.showItemDetail();

	}
};