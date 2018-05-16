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
	
	@Override
	public void create(FoodRestaurant food) {
		
	}

	@Override
	public void read(List<FoodRestaurant> read) {

	}

	@Override
	public void update(FoodRestaurant update) {
		
	}

	@Override
	public void delete(FoodRestaurant delete) {
		
	}

	@Override
	public void create(BookingRestaurant add) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read(ArrayList<BookingRestaurant> bookLists) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BookingRestaurant update) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(BookingRestaurant delete) {
		// TODO Auto-generated method stub
		
	}
}
