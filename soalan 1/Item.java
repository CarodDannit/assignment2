public class Item{
	private double shippingWeight;
	private String description;
	private double price;
	private int stock;

	public Item(double shippingWeight, String description, double price, int stock){
		this.shippingWeight = shippingWeight;
		this.description = description;
		this.price =  price;
		this.stock = stock;
	}
	public void setStok(int number){
		this.stock -= number;
	}
	public String getDescription(){
		return  this.description;
	}
	public double getShippingWeight(){
		return this.shippingWeight;
	}


	public double getTex(double priceItems){
		return 0.01 * priceItems;
	}
	
	public boolean inStock(int bil){
		if(this.stock <= 0 || this.stock < bil){
			return false;
		}else{
			return true;
		}
	}
	
	public double getPriceForQuantity(int quantity){
		return this.price * quantity;
	}

	public void showItemDetail(){
		System.out.println("stock " + this.description + "  " + this.stock);
	}

}
