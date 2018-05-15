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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

}
