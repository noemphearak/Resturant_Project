import java.util.ArrayList;
import java.util.List;

public class OrderRestaurant implements InterfaceRestaurant{
	// TODO Declaration variable
	private int id;
	private TableRestaurant table;
	private List<FoodRestaurant> foodLists;
	
	public OrderRestaurant(int id, TableRestaurant tables) {
		this.id		= id;
		this.table	= tables;
	}
	
	public void create(FoodRestaurant food) {
		
	}

	public void read(List<FoodRestaurant> read) {

	}

	public void update(FoodRestaurant update) {
		
	}

	public void delete(FoodRestaurant delete) {
		
	}
	
	public void read(ArrayList<BookingRestaurant> bookLists) {
		
	}

	@Override
	public void read() {
		
	}
	@Override
	public void update() {
		
	}
	@Override
	public void delete() {
		
	}

	@Override
	public void create() {
		
	}

}
