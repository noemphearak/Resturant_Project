
public class FoodRestaurant {
	private String id;
	private String name;
	private double price;
	
	public FoodRestaurant(String id, String name, double price) {
		this.id		= id;
		this.name 	= name;
		this.price	= price;
	}
	
	public FoodRestaurant() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "'00"+ id +"'"+ "\t\t"+ "'"+ name +"'"+ "\t\t\t"+ "'"+ price +"'";  
	}
}
