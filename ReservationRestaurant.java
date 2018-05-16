import java.util.ArrayList;
import java.util.List;

public class ReservationRestaurant implements InterfaceRestaurant{
	// TODO Create object list from BookingRestaurant 
	private List<BookingRestaurant> reservationLists = new ArrayList<BookingRestaurant>();
	
	public ReservationRestaurant() {}
	
	@Override
	public void create(BookingRestaurant add) {

	}
	
	@Override
	public void read(ArrayList<BookingRestaurant> bookLists) {
		
	}

	@Override
	public void update(BookingRestaurant update) {
		
	}

	@Override
	public void delete(BookingRestaurant delete) {
		
	}

	@Override
	public void create(FoodRestaurant food) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read(List<FoodRestaurant> read) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(FoodRestaurant update) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(FoodRestaurant delete) {
		// TODO Auto-generated method stub
		
	}
}
