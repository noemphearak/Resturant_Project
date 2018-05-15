
public class FoodRestaurant {
	private String id;
	private String name;
	private double price;
	
	public FoodRestaurant(String id, String name, double price) {
		this.id		= id;
		this.name 	= name;
		this.price	= price;
	}
	
	public String toString() {
		return "ID: "+ id +" Food name: "+ name +" Price: "+ price;  
	}
}
