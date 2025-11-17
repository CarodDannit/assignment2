public class Customer {
	private  String name;
	private String address;

	Customer(String n,String a){
		this.name =  n;
		this.address = a;	
	}

	public String getName(){
		return this.name;
	}
	public String getAddress(){
		return this.address;
	}

}
